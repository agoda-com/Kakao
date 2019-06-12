package com.agoda.kakao.delegates

import android.support.test.espresso.NoMatchingViewException
import android.support.test.espresso.Root
import android.support.test.espresso.ViewAction
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.ViewInteraction
import android.view.View
import com.agoda.kakao.configurator.KakaoConfigurator
import org.hamcrest.Matcher

/**
 * An interface duplicating the used in Kakao part of view interaction interface and providing original Espresso *Interactions.
 * If you want to extend the base view interaction behavior, you should implement this interface, and specify it's
 * factory in [KakaoConfigurator]
 */
interface ViewInteractionDelegate {

    val viewInteraction: ViewInteraction

    fun perform(viewAction: ViewAction): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.perform(viewAction)
                ?: viewInteraction.perform(viewAction)
        return this
    }

    fun check(viewAssertion: ViewAssertion): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.check(viewAssertion)
                ?: viewInteraction.check(viewAssertion)
        return this
    }

    fun check(
            function: (View, NoMatchingViewException?) -> Unit
    ): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.check(function)
                ?: viewInteraction.check(function)
        return this
    }

    fun withFailureHandler(
            function: (Throwable, Matcher<View>) -> Unit
    ): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.withFailureHandler(function)
                ?: viewInteraction.withFailureHandler(function)
        return this
    }

    fun inRoot(rootMatcher: Matcher<Root>): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.inRoot(rootMatcher)
                ?: viewInteraction.inRoot(rootMatcher)
        return this
    }
}
