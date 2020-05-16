@file:Suppress("unused")

package com.agoda.kakao.toolbar

import android.view.View
import androidx.test.espresso.Root
import androidx.test.espresso.matcher.RootMatchers
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.delegate.ViewInteractionDelegate
import com.agoda.kakao.image.KImageView
import org.hamcrest.Matcher

class KToolbar : ToolbarViewActions, ToolbarViewAssertions {
    val matcher: Matcher<View>
    override val navigationIcon: KImageView?

    override val view: ViewInteractionDelegate
    override var root: Matcher<Root> = RootMatchers.DEFAULT

    /**
     * Constructs view class with view interaction from given ViewBuilder
     *
     * @param rootBuilder ViewBuilder which will result in view's interaction
     * @param navigateUpBuilder ViewBuilder which will be used to locate the navigation icon
     *
     * @see ViewBuilder
     */
    constructor(rootBuilder: ViewBuilder.() -> Unit, navigateUpBuilder: (ViewBuilder.() -> Unit)? = null) {
        val vb = ViewBuilder().apply(rootBuilder)
        matcher = vb.getViewMatcher()
        view = vb.getViewInteractionDelegate()
        navigationIcon = navigateUpBuilder?.let { KImageView(it) }
    }

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent Matcher that will be used as parent in isDescendantOfA() matcher
     * @param rootBuilder ViewBuilder which will result in view's interaction
     * @param navigateUpBuilder ViewBuilder which will be used to locate the navigation icon
     *
     * @see ViewBuilder
     */
    constructor(
        parent: Matcher<View>, rootBuilder: ViewBuilder.() -> Unit,
        navigateUpBuilder: (ViewBuilder.() -> Unit)?
    ) : this({
                 isDescendantOfA { withMatcher(parent) }
                 rootBuilder(this)
             }, navigateUpBuilder)

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KToolbar.() -> Unit) {
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
    infix fun perform(function: KToolbar.() -> Unit): KToolbar {
        function(this)
        return this
    }
}