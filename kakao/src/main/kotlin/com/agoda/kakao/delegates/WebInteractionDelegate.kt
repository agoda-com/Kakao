package com.agoda.kakao.delegates

import android.support.annotation.CheckResult
import android.support.test.espresso.web.assertion.WebAssertion
import android.support.test.espresso.web.model.Atom
import android.support.test.espresso.web.model.ElementReference
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.configurator.KakaoConfigurator
import org.hamcrest.Matcher
import javax.annotation.CheckReturnValue

/**
 * An interface duplicating the used in Kakao part of web interaction interface and providing original Espresso *Interactions.
 * If you want to extend the base web interaction behavior, you should implement this interface, and specify it's
 * factory in [com.kaspersky.klkakao.configurator.KakaoConfigurator]
 */
interface WebInteractionDelegate {

    val webInteraction: Web.WebInteraction<*>

    @CheckResult
    @CheckReturnValue
    fun withElement(ref: Atom<ElementReference>): WebInteractionDelegate {
        return KakaoConfigurator.configurator.webInteractionDelegateFactory
            .invoke(webInteraction)
            .withElement(ref)
    }

    fun perform(webAction: Atom<*>): WebInteractionDelegate {
        return KakaoConfigurator.configurator.webInteractionDelegateFactory
            .invoke(webInteraction)
            .perform(webAction)
    }

    fun <E> check(
        webAssertion: WebAssertion<E>,
        atom: Atom<E>,
        matcher: Matcher<E>
    ): WebInteractionDelegate {
        return KakaoConfigurator.configurator.webInteractionDelegateFactory
            .invoke(webInteraction)
            .check(webAssertion, atom, matcher)
    }

}