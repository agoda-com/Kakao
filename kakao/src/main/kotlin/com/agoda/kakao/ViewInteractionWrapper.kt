package com.agoda.kakao

import android.support.test.espresso.*
import android.view.View
import com.agoda.kakao.KakaoInterceptors.viewInteractionInterceptor
import org.hamcrest.Matcher

interface ViewInteractionWrapper : ViewInteractionInterceptor {
    fun check(viewAssertion: ViewAssertion): ViewInteractionWrapper
    fun inRoot(rootMatcher: Matcher<Root>): ViewInteractionWrapper
    fun noActivity(): ViewInteractionWrapper
    fun perform(viewAction: ViewAction): ViewInteractionWrapper
    fun withFailureHandler(failureHandler: FailureHandler): ViewInteractionWrapper
}

inline fun ViewInteractionWrapper.withFailureHandler(crossinline function: (error: Throwable, matcher: Matcher<View>) -> Unit) {
    withFailureHandler(FailureHandler { error, viewMatcher -> function(error, viewMatcher) })
}

inline fun ViewInteractionWrapper.check(crossinline viewAssert: (View, NoMatchingViewException?) -> Unit) {
    check(ViewAssertion { view, noViewFoundException -> viewAssert(view, noViewFoundException) })
}

fun ViewInteraction.wrap(): ViewInteractionWrapper = InterceptingViewInteractionWrapper(this)

private class InterceptingViewInteractionWrapper(private val viewInteraction: ViewInteraction) : ViewInteractionWrapper, MutableViewInteractionInterceptor by BaseViewInteractionInterceptor() {
    override fun check(viewAssertion: ViewAssertion): ViewInteractionWrapper {
        val intercepted = checkInterceptor?.check(viewInteraction, viewAssertion).orFalse() && viewInteractionInterceptor.checkInterceptor?.check(viewInteraction, viewAssertion).orFalse()
        if (!intercepted) {
            viewInteraction.check(viewAssertion)
        }
        return this
    }

    override fun inRoot(rootMatcher: Matcher<Root>): ViewInteractionWrapper {
        viewInteraction.inRoot(rootMatcher)
        return this
    }

    override fun noActivity(): ViewInteractionWrapper {
        viewInteraction.noActivity()
        return this
    }

    override fun perform(viewAction: ViewAction): ViewInteractionWrapper {
        val intercepted = performInterceptor?.perform(viewInteraction, viewAction).orFalse() && viewInteractionInterceptor.performInterceptor?.perform(viewInteraction, viewAction).orFalse()
        if (!intercepted) {
            viewInteraction.perform(viewAction)
        }
        return this
    }

    override fun withFailureHandler(failureHandler: FailureHandler): ViewInteractionWrapper {
        viewInteraction.withFailureHandler(failureHandler)
        return this
    }
}
