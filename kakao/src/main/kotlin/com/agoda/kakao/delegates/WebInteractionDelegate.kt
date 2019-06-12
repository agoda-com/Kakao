package com.agoda.kakao.delegates

import android.support.annotation.CheckResult
import android.support.test.espresso.web.assertion.WebAssertion
import android.support.test.espresso.web.model.Atom
import android.support.test.espresso.web.model.ElementReference
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.delegates.factory.InteractionDelegatesFactory
import org.hamcrest.Matcher
import javax.annotation.CheckReturnValue

/**
 * An interface duplicating the used in Kakao part of web interaction interface and providing original Espresso *Interactions.
 * If you want to extend the base web interaction behavior, you should implement this interface, and specify it's
 * factory in [KakaoConfigurator]
 */
interface WebInteractionDelegate {

    val webInteraction: Web.WebInteraction<*>

    @CheckResult
    @CheckReturnValue
    fun withElement(ref: Atom<ElementReference>): WebInteractionDelegate {
        return InteractionDelegatesFactory().createWebInteractionDelegate(
                KakaoConfigurator.webInteractionDelegateFactory
                        ?.invoke(webInteraction)?.withElement(ref)?.webInteraction
                        ?: webInteraction.withElement(ref)
        )
    }


    fun perform(webAction: Atom<*>): WebInteractionDelegate {
        return InteractionDelegatesFactory().createWebInteractionDelegate(
                KakaoConfigurator.webInteractionDelegateFactory
                        ?.invoke(webInteraction)?.perform(webAction)?.webInteraction
                        ?: webInteraction.perform(webAction)
        )
    }

    fun <E> check(
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
