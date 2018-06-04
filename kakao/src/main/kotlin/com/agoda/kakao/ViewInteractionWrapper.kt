package com.agoda.kakao

import android.support.test.espresso.*
import android.view.View
import org.hamcrest.Matcher

interface ViewInteractionWrapper {
    fun check(viewAssert: ViewAssertion)
    fun inRoot(rootMatcher: Matcher<Root>)
    fun noActivity()
    fun perform(vararg viewActions: ViewAction)
    fun withFailureHandler(failureHandler: FailureHandler)
}

interface ViewInteractionWrapperFactory {
    fun create(viewInteraction: ViewInteraction): ViewInteractionWrapper

    companion object {
        var factory: ViewInteractionWrapperFactory = DEFAULT

        fun createWrapper(viewInteraction: ViewInteraction): ViewInteractionWrapper {
            return factory.create(viewInteraction)
        }

        object DEFAULT : ViewInteractionWrapperFactory {
            override fun create(viewInteraction: ViewInteraction): ViewInteractionWrapper {
                return DelegatingViewInteractionWrapper(viewInteraction)
            }
        }
    }
}

inline fun ViewInteractionWrapper.withFailureHandler(crossinline function: (error: Throwable, matcher: Matcher<View>) -> Unit) {
    withFailureHandler(FailureHandler { error, viewMatcher -> function(error, viewMatcher) })
}

inline fun ViewInteractionWrapper.check(crossinline viewAssert: (View, NoMatchingViewException?) -> Unit) {
    check(ViewAssertion { view, noViewFoundException -> viewAssert(view, noViewFoundException) })
}

fun ViewInteraction.wrap(): ViewInteractionWrapper = ViewInteractionWrapperFactory.createWrapper(this)

private class DelegatingViewInteractionWrapper(private val viewInteraction: ViewInteraction) : ViewInteractionWrapper {
    override fun check(viewAssert: ViewAssertion) {
        viewInteraction.check(viewAssert)
    }

    override fun inRoot(rootMatcher: Matcher<Root>) {
        viewInteraction.inRoot(rootMatcher)
    }

    override fun noActivity() {
        viewInteraction.noActivity()
    }

    override fun perform(vararg viewActions: ViewAction) {
        viewInteraction.perform(*viewActions)
    }

    override fun withFailureHandler(failureHandler: FailureHandler) {
        viewInteraction.withFailureHandler(failureHandler)
    }
}
