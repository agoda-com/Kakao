package com.agoda.kakao.delegates.impl

import android.support.test.espresso.web.assertion.WebAssertion
import android.support.test.espresso.web.model.Atom
import android.support.test.espresso.web.model.ElementReference
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.delegates.WebInteractionDelegate
import com.agoda.kakao.delegates.factory.InteractionDelegatesFactory
import org.hamcrest.Matcher

/**
 * Stub implementation of [WebInteractionDelegate], repeats the [Web.WebInteraction] behavior.
 */
internal class WebInteractionDelegateImpl constructor(
        override val webInteraction: Web.WebInteraction<*>
) : WebInteractionDelegate {

    override fun withElement(ref: Atom<ElementReference>): WebInteractionDelegate {
        return InteractionDelegatesFactory().createWebInteractionDelegate(
                KakaoConfigurator.webInteractionDelegateFactory
                        ?.invoke(webInteraction)?.withElement(ref)?.webInteraction
                        ?: webInteraction.withElement(ref)
        )
    }

    override fun perform(webAction: Atom<*>): WebInteractionDelegate {
        return InteractionDelegatesFactory().createWebInteractionDelegate(
                KakaoConfigurator.webInteractionDelegateFactory
                        ?.invoke(webInteraction)?.perform(webAction)?.webInteraction
                        ?: webInteraction.perform(webAction)
        )
    }

    override fun <E> check(
            webAssertion: WebAssertion<E>,
            atom: Atom<E>,
            matcher: Matcher<E>
    ): WebInteractionDelegate {
        return InteractionDelegatesFactory().createWebInteractionDelegate(
                KakaoConfigurator.webInteractionDelegateFactory
                        ?.invoke(webInteraction)?.check(webAssertion, atom, matcher)?.webInteraction
                        ?: webInteraction.check(webAssertion)
        )
    }
}