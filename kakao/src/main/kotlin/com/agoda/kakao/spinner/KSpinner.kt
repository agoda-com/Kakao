package com.agoda.kakao.spinner

import android.view.View
import android.widget.AdapterView
import androidx.test.espresso.DataInteraction
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Root
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.matchers.SpinnerPopupMatcher
import com.agoda.kakao.delegate.ViewInteractionDelegate
import com.agoda.kakao.list.DataBuilder
import com.agoda.kakao.list.KAdapterItem
import com.agoda.kakao.list.KAdapterItemType
import com.agoda.kakao.list.KAdapterItemTypeBuilder
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import kotlin.reflect.KClass

@KakaoDslMarker
class KSpinner : SpinnerAdapterActions, SpinnerAdapterAssertions, BaseAssertions {
    val matcher: Matcher<View>
    val itemTypes: Map<KClass<out KAdapterItem<*>>, KAdapterItemType<KAdapterItem<*>>>

    override val view: ViewInteractionDelegate
    override var popupView: ViewInteractionDelegate? = null
    override var root: Matcher<Root> = RootMatchers.DEFAULT

    /**
     * Constructs view class with view interaction from given ViewBuilder
     *
     * @param builder ViewBuilder which will result in view's interaction
     * @param itemTypeBuilder Lambda with receiver where you pass your item providers
     *
     * @see ViewBuilder
     */
    constructor(builder: ViewBuilder.() -> Unit, itemTypeBuilder: KAdapterItemTypeBuilder.() -> Unit) {
        val vb = ViewBuilder().apply(builder)
        matcher = vb.getViewMatcher()
        view = vb.getViewInteractionDelegate()
        itemTypes = KAdapterItemTypeBuilder().apply(itemTypeBuilder).itemTypes
    }

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent Matcher that will be used as parent in isDescendantOfA() matcher
     * @param builder ViewBuilder which will result in view's interaction
     * @param itemTypeBuilder Lambda with receiver where you pass your item providers
     *
     * @see ViewBuilder
     */
    constructor(
        parent: Matcher<View>, builder: ViewBuilder.() -> Unit,
        itemTypeBuilder: KAdapterItemTypeBuilder.() -> Unit
    ) : this({
                 isDescendantOfA { withMatcher(parent) }
                 builder(this)
             }, itemTypeBuilder)

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent DataInteraction that will be used as parent to ViewBuilder
     * @param builder ViewBuilder which will result in view's interaction
     * @param itemTypeBuilder Lambda with receiver where you pass your item providers
     *
     * @see ViewBuilder
     */
    @Suppress("UNCHECKED_CAST")
    constructor(
        parent: DataInteraction, builder: ViewBuilder.() -> Unit,
        itemTypeBuilder: KAdapterItemTypeBuilder.() -> Unit
    ) {
        val makeTargetMatcher = DataInteraction::class.java.getDeclaredMethod("makeTargetMatcher")
        val parentMatcher = makeTargetMatcher.invoke(parent)

        val vb = ViewBuilder().apply {
            isDescendantOfA { withMatcher(parentMatcher as Matcher<View>) }
            builder(this)
        }

        matcher = vb.getViewMatcher()
        view = vb.getViewInteractionDelegate()
        itemTypes = KAdapterItemTypeBuilder().apply(itemTypeBuilder).itemTypes
    }

    /**
     * Performs given actions/assertion on child at given position
     *
     * @param T Type of item at given position. Must be registered via constructor.
     * @param position Position of item in adapter
     * @param function Tail lambda which receiver will be matched item with given type T
     */
    inline fun <reified T : KAdapterItem<*>> childAt(position: Int, function: T.() -> Unit) {
        val provideItem = itemTypes.getOrElse(T::class) {
            throw IllegalStateException("${T::class.java.simpleName} did not register to Spinner")
        }.provideItem

        val interaction = Espresso.onData(Matchers.anything())
            .inRoot(SpinnerPopupMatcher())
            .atPosition(position)

        function(provideItem(interaction) as T)
    }

    /**
     * Performs given actions/assertion on first child in adapter
     *
     * @param T Type of item at first position. Must be registered via constructor.
     * @param function Tail lambda which receiver will be matched item with given type T
     */
    inline fun <reified T : KAdapterItem<*>> firstChild(function: T.() -> Unit) {
        childAt(0, function)
    }

    /**
     * Performs given actions/assertion on last child in adapter
     *
     * @param T Type of item at last position. Must be registered via constructor.
     * @param function Tail lambda which receiver will be matched item with given type T
     */
    inline fun <reified T : KAdapterItem<*>> lastChild(function: T.() -> Unit) {
        childAt(getSize() - 1, function)
    }

    /**
     * Performs given actions/assertion on all children in adapter
     *
     * @param T Type of all items. Must be registered via constructor.
     * @param function Tail lambda which receiver will be matched item with given type T
     */
    inline fun <reified T : KAdapterItem<*>> children(function: T.() -> Unit) {
        for (i in 0 until getSize()) {
            childAt(i, function)
        }
    }

    /**
     * Performs given actions/assertion on child that matches given matcher
     *
     * @param T Type of item at given position. Must be registered via constructor.
     * @param childMatcher Matcher for item in adapter
     * @return Item with type T. To make actions/assertions on it immediately, use perform() infix function.
     */
    inline fun <reified T : KAdapterItem<*>> childWith(childMatcher: DataBuilder.() -> Unit): T {
        val provideItem = itemTypes.getOrElse(T::class) {
            throw IllegalStateException("${T::class.java.simpleName} did not register to Spinner")
        }.provideItem

        val interaction = Espresso.onData(DataBuilder().apply(childMatcher).getDataMatcher())
            .inRoot(root)
//            .inAdapterView(withClassName(containsString("PopupDecorView")))

        return provideItem(interaction) as T
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KSpinner.() -> Unit) {
        function(this)
    }

    /**
     * Infix function for invoking lambda on your view
     *
     * Sometimes instance of view is a result of a function or constructor.
     * In this specific case you can't call invoke() since it will be considered as
     * tail lambda of your fun/constructor. In such cases please use this function.
     *
     * @param function Tail lambda with receiver which is your view
     * @return This object
     */
    infix fun perform(function: KSpinner.() -> Unit): KSpinner {
        function.invoke(this)
        return this
    }

    /**
     * Calls childAt() on your view with base child
     *
     * Calls childAt() on your Spinner and casts received item to KSpinnerItem
     *
     * @param position Position of child in adapter
     * @param tail Lambda with KSpinnerItem receiver
     * @see KSpinnerItem
     */
    fun emptyChildAt(position: Int, tail: KSpinnerItem.() -> Unit) {
        childAt(position, tail)
    }

    /**
     * Calls firstChild() on your view with base child
     *
     * Calls firstChild() on your Spinner and casts received item to KSpinnerItem
     *
     * @param tail Lambda with KSpinnerItem receiver
     * @see KSpinnerItem
     */
    fun emptyFirstChild(tail: KSpinnerItem.() -> Unit) {
        firstChild(tail)
    }

    /**
     * Calls lastChild() on your view with base child
     *
     * Calls lastChild() on your Spinner and casts received item to KSpinnerItem
     *
     * @param tail Lambda with KSpinnerItem receiver
     * @see KSpinnerItem
     */
    fun emptyLastChild(tail: KSpinnerItem.() -> Unit) {
        lastChild(tail)
    }

    /**
     * Calls childWith() on your view with base child
     *
     * Calls childWith() on your Spinner and casts received item to KSpinnerItem
     *
     * @param builder Data builder that will match the child view
     * @return Matched KSpinnerItem
     * @see KSpinnerItem
     */
    fun emptyChildWith(builder: DataBuilder.() -> Unit) = childWith<KSpinnerItem>(builder)

    override fun open() {
        view.perform(click())
        popupView =
            ViewInteractionDelegate(onView(allOf(ViewMatchers.isAssignableFrom(AdapterView::class.java))).inRoot(SpinnerPopupMatcher()))
    }

    override fun close() {
        view.perform(click())
        popupView = null
    }
}
