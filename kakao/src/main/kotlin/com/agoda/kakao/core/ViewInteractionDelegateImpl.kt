package com.agoda.kakao.core

import android.view.View
import androidx.test.espresso.*
import com.agoda.kakao.common.interceptors.Interceptor
import org.hamcrest.Matcher

class ViewInteractionDelegateImpl(private val viewInteraction: ViewInteraction,
                                  private val interceptor: Interceptor) : ViewInteractionDelegate {
    override fun check(viewAssertion: ViewAssertion) {
        viewInteraction.check(viewAssertion)
    }

    override fun check(function: (view: View, noViewFoundException: NoMatchingViewException) -> Unit) {
        viewInteraction.check(function)
        interceptor.onCheck?.invoke(viewInteraction)
    }

    override fun inRoot(matcher: Matcher<Root>) {
        viewInteraction.inRoot(matcher)
    }

    override fun perform(vararg viewActions: ViewAction) {
        viewInteraction.perform(*viewActions)
        interceptor.onPerform?.invoke(viewInteraction)
    }

    override fun withFailureHandler(function: (error: Throwable, matcher: Matcher<View>) -> Unit) {
        viewInteraction.withFailureHandler(function)
    }
}
