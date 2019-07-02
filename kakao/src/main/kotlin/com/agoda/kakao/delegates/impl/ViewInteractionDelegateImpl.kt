package com.agoda.kakao.delegates.impl

import android.support.test.espresso.*
import android.view.View
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.delegates.ViewInteractionDelegate
import org.hamcrest.Matcher

/**
 * Stub implementation of [ViewInteractionDelegate], repeats the [ViewInteraction] behavior.
 */
internal class ViewInteractionDelegateImpl constructor(
        override val viewInteraction: ViewInteraction
) : ViewInteractionDelegate {

    override fun perform(viewAction: ViewAction): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.perform(viewAction)
                ?: viewInteraction.perform(viewAction)
        return this
    }

    override fun check(viewAssertion: ViewAssertion): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.check(viewAssertion)
                ?: viewInteraction.check(viewAssertion)
        return this
    }

    override fun check(
            function: (View, NoMatchingViewException?) -> Unit
    ): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.check(function)
                ?: viewInteraction.check(function)
        return this
    }

    override fun withFailureHandler(
            function: (Throwable, Matcher<View>) -> Unit
    ): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.withFailureHandler(function)
                ?: viewInteraction.withFailureHandler(function)
        return this
    }

    override fun inRoot(rootMatcher: Matcher<Root>): ViewInteractionDelegate {
        KakaoConfigurator.viewInteractionDelegateFactory
                ?.invoke(viewInteraction)?.inRoot(rootMatcher)
                ?: viewInteraction.inRoot(rootMatcher)
        return this
    }
}