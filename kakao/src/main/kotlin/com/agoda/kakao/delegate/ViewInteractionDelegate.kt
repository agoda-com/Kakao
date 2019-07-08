package com.agoda.kakao.delegate

import androidx.test.espresso.*
import com.agoda.kakao.Kakao
import com.agoda.kakao.intercept.Interceptor
import com.agoda.kakao.screen.Screen
import org.hamcrest.Matcher
import org.jetbrains.annotations.Contract

/**
 * Delegation class for [ViewInteraction].
 * Wraps all available public calls and intercepts [check] and [perform].
 *
 * @see Delegate
 * @see Interceptor
 */
class ViewInteractionDelegate(override var interaction: ViewInteraction) : Delegate<ViewInteraction, ViewAssertion, ViewAction> {
    var interceptor: Interceptor<ViewInteraction, ViewAssertion, ViewAction>? = null

    @Contract("_->this")
    fun check(viewAssert: ViewAssertion) = this.also {
        if (!interceptCheck(viewAssert)) interaction.check(viewAssert)
    }

    @Contract("_->this")
    fun inRoot(rootMatcher: Matcher<Root>) = this.also {
        interaction.inRoot(rootMatcher)
    }

    @Contract("_->this")
    fun noActivity() = this.also {
        interaction.noActivity()
    }

    @Contract("_->this")
    fun perform(vararg viewActions: ViewAction) = this.also {
        if (viewActions.none { interceptPerform(it) }) interaction.perform(*viewActions)
    }

    @Contract("_->this")
    fun withFailureHandler(failureHandler: FailureHandler) = this.also {
        interaction.withFailureHandler(failureHandler)
    }

    override fun viewInterceptor() = interceptor
    override fun screenInterceptor() = Screen.vis.takeIf { it.isNotEmpty() }?.peek()
    override fun kakaoInterceptor() = Kakao.vi
}
