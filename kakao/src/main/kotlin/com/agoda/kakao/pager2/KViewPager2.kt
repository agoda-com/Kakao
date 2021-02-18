@file:Suppress("unused")

package com.agoda.kakao.pager2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.DataInteraction
import androidx.test.espresso.Root
import androidx.test.espresso.matcher.RootMatchers
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.common.actions.SwipeableActions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.matchers.PositionMatcher
import com.agoda.kakao.delegate.ViewInteractionDelegate
import org.hamcrest.Matcher
import kotlin.reflect.KClass

/**
 * View with SwipeableActions and ViewPager2Assertions
 *
 * @see SwipeableActions
 */
@KakaoDslMarker
class KViewPager2 : ViewPager2Actions, ViewPager2AdapterAssertions, SwipeableActions, BaseAssertions {
    val matcher: Matcher<View>
    val itemTypes: Map<KClass<out KViewPagerItem<*>>, KViewPagerItemType<KViewPagerItem<*>>>

    override val view: ViewInteractionDelegate
    override var root: Matcher<Root> = RootMatchers.DEFAULT

    /**
     * Constructs view class with view interaction from given ViewBuilder
     *
     * @param builder ViewBuilder which will result in view's interaction
     * @param itemTypeBuilder Lambda with receiver where you pass your item providers
     *
     * @see ViewBuilder
     */
    constructor(builder: ViewBuilder.() -> Unit, itemTypeBuilder: KViewPagerItemTypeBuilder.() -> Unit) {
        val vb = ViewBuilder().apply(builder)
        matcher = vb.getViewMatcher()
        view = vb.getViewInteractionDelegate()
        itemTypes = KViewPagerItemTypeBuilder().apply(itemTypeBuilder).itemTypes
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
        itemTypeBuilder: KViewPagerItemTypeBuilder.() -> Unit
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
        itemTypeBuilder: KViewPagerItemTypeBuilder.() -> Unit
    ) {
        val makeTargetMatcher = DataInteraction::class.java.getDeclaredMethod("makeTargetMatcher")
        val parentMatcher = makeTargetMatcher.invoke(parent)

        val vb = ViewBuilder().apply {
            isDescendantOfA { withMatcher(parentMatcher as Matcher<View>) }
            builder(this)
        }

        matcher = vb.getViewMatcher()
        view = vb.getViewInteractionDelegate()
        itemTypes = KViewPagerItemTypeBuilder().apply(itemTypeBuilder).itemTypes
    }

    /**
     * Performs given actions/assertion on child at given position
     *
     * @param T Type of item at given position. Must be registered via constructor.
     * @param position Position of item in adapter
     * @param function Tail lambda which receiver will be matched item with given type T
     */
    inline fun <reified T : KViewPagerItem<*>> childAt(position: Int, function: T.() -> Unit) {
        val provideItem = itemTypes.getOrElse(T::class) {
            throw IllegalStateException("${T::class.java.simpleName} did not register to KViewPager2")
        }.provideItem

        try {
            scrollTo(position)
        } catch (error: Throwable) {
        }

        val vb = ViewBuilder().apply {
            isDescendantOfA { withMatcher(this@KViewPager2.matcher) }
            isInstanceOf(RecyclerView::class.java)
        }

        function(provideItem(PositionMatcher(vb.getViewMatcher(), position)) as T)
            .also { inRoot { withMatcher(this@KViewPager2.root) } }
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KViewPager2.() -> Unit) {
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
    infix fun perform(function: KViewPager2.() -> Unit): KViewPager2 {
        function(this)
        return this
    }
}
