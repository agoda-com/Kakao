@file:Suppress("unused")

package com.agoda.kakao.toolbar

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.View
import androidx.annotation.DrawableRes
import androidx.test.espresso.DataInteraction
import androidx.test.espresso.Root
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.RootMatchers
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.matchers.ToolbarSubtitleMatcher
import com.agoda.kakao.common.matchers.ToolbarTitleMatcher
import com.agoda.kakao.delegate.ViewInteractionDelegate
import com.agoda.kakao.image.KImageView
import org.hamcrest.Matcher

class KToolbar : ToolbarViewActions, ToolbarViewAssertions, BaseAssertions {
    val matcher: Matcher<View>
    private val navigationDrawable: KImageView?

    override val view: ViewInteractionDelegate
    override var root: Matcher<Root> = RootMatchers.DEFAULT

    /**
     * Constructs view class with view interaction from given ViewBuilder
     *
     * @param rootBuilder ViewBuilder which will result in view's interaction
     * @param itemTypeBuilder Lambda with receiver where you pass your item providers
     *
     * @see ViewBuilder
     */
    constructor(rootBuilder: ViewBuilder.() -> Unit, drawableBuilder: (ViewBuilder.() -> Unit)? = null) {
        val vb = ViewBuilder().apply(rootBuilder)
        matcher = vb.getViewMatcher()
        view = vb.getViewInteractionDelegate()
        navigationDrawable = drawableBuilder?.let { KImageView(it) }
    }

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent Matcher that will be used as parent in isDescendantOfA() matcher
     * @param rootBuilder ViewBuilder which will result in view's interaction
     * @param itemTypeBuilder Lambda with receiver where you pass your item providers
     *
     * @see ViewBuilder
     */
    constructor(
        parent: Matcher<View>, rootBuilder: ViewBuilder.() -> Unit,
        drawableBuilder: (ViewBuilder.() -> Unit)?
    ) : this({
                 isDescendantOfA { withMatcher(parent) }
                 rootBuilder(this)
             }, drawableBuilder)

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent DataInteraction that will be used as parent to ViewBuilder
     * @param builder ViewBuilder which will result in view's interaction
     * @param drawableBuilder Lambda with receiver where you pass your item providers
     *
     * @see ViewBuilder
     */
    @Suppress("UNCHECKED_CAST")
    constructor(
        parent: DataInteraction, rootBuilder: ViewBuilder.() -> Unit,
        drawableBuilder: (ViewBuilder.() -> Unit)?
    ) {
        val makeTargetMatcher = DataInteraction::class.java.getDeclaredMethod("makeTargetMatcher")
        val parentMatcher = makeTargetMatcher.invoke(parent)

        val vb = ViewBuilder().apply {
            isDescendantOfA { withMatcher(parentMatcher as Matcher<View>) }
            rootBuilder(this)
        }

        matcher = vb.getViewMatcher()
        view = vb.getViewInteractionDelegate()
        navigationDrawable = drawableBuilder?.let { KImageView(it) }
    }

    /**
     * Checks if Toolbar has title
     *
     * @param title expected title string
     */
    fun hasTitle(title: String) {
        view.check(ViewAssertions.matches(ToolbarTitleMatcher(title)))
    }

    /**
     * Checks if Toolbar has subtitle
     *
     * @param subtitle expected subtitle string
     */
    fun hasSubtitle(subtitle: String) {
        view.check(ViewAssertions.matches(ToolbarSubtitleMatcher(subtitle)))
    }

    /**
     * Checks if Toolbar has title
     *
     * @param resId expected title resource id
     */
    fun hasTitle(resId: Int) {
        view.check(ViewAssertions.matches(ToolbarTitleMatcher(resId)))
    }

    /**
     * Checks if Toolbar has subtitle
     *
     * @param resId expected subtitle resource id
     */
    fun hasSubtitle(resId: Int) {
        view.check(ViewAssertions.matches(ToolbarSubtitleMatcher(resId)))
    }

    /**
     * Checks if Toolbar has navigation drawable
     *
     * @param resId expected drawable resource id
     */
    fun hasNavigationDrawable(@DrawableRes resId: Int, toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        navigationDrawable?.hasDrawable(resId = resId, toBitmap = toBitmap) ?: throw AssertionError(
            "Unable to match navigationDrawable, did you forget to provide its builder?"
        )
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KToolbar.() -> Unit) {
        function(this)
    }
}