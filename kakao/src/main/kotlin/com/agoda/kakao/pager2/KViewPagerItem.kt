@file:Suppress("unused")

package com.agoda.kakao.pager2

import android.view.View
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.RootMatchers
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.common.actions.BaseActions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.delegate.ViewInteractionDelegate
import com.agoda.kakao.intercept.Interceptable
import org.hamcrest.Matcher

/**
 * Base class for KViewPager2 adapter items
 *
 * Please extend this class to provide custom view pager 2 view item types
 *
 * @param T type of your item. Used to enable invoke() and perform() on descendants
 * @param matcher Matcher of root view of adapter item. Can be used as parent for all views inside item.
 *
 * @see KViewPagerItemTypeBuilder
 */
@Suppress("UNCHECKED_CAST")
@KakaoDslMarker
open class KViewPagerItem<out T>(matcher: Matcher<View>) : BaseActions, BaseAssertions,
    Interceptable<ViewInteraction, ViewAssertion, ViewAction> {
    override val view = ViewInteractionDelegate(Espresso.onView(matcher))
    override var root = RootMatchers.DEFAULT

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: T.() -> Unit) {
        function(this as T)
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
    infix fun perform(function: T.() -> Unit): T {
        function(this as T)
        return this
    }
}
