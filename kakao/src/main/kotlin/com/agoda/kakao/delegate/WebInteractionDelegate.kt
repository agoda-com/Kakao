package com.agoda.kakao.delegate

import androidx.test.espresso.web.assertion.WebAssertion
import androidx.test.espresso.web.model.Atom
import androidx.test.espresso.web.model.ElementReference
import androidx.test.espresso.web.model.WindowReference
import androidx.test.espresso.web.sugar.Web
import com.agoda.kakao.Kakao
import com.agoda.kakao.intercept.Interceptor
import com.agoda.kakao.screen.Screen
import java.util.concurrent.TimeUnit

/**
 * Delegation class for [Web.WebInteraction].
 * Wraps all available public calls and intercepts [check] and [perform].
 *
 * @see Delegate
 * @see Interceptor
 */
class WebInteractionDelegate(override var interaction: Web.WebInteraction<*>) : Delegate<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>> {
    override var interceptor: Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>? = null

    fun check(assertion: WebAssertion<*>) = this.also {
        if (!interceptCheck(assertion)) interaction = interaction.check(assertion)
    }

    fun forceJavascriptEnabled() = this.also {
        interaction.forceJavascriptEnabled()
    }

    fun get(): Any = interaction.get()

    fun inWindow(window: WindowReference) = this.also {
        interaction = interaction.inWindow(window)
    }

    fun inWindow(windowPicker: Atom<WindowReference>) = this.also {
        interaction = interaction.inWindow(windowPicker)
    }

    fun perform(atom: Atom<*>) = this.also {
        if (!interceptPerform(atom)) interaction = interaction.perform(atom)
    }

    fun reset() = this.also {
        interaction = interaction.reset()
    }

    fun withContextualElement(elementPicker: Atom<ElementReference>) = this.also {
        interaction = interaction.withContextualElement(elementPicker)
    }

    fun withElement(element: ElementReference) = this.also {
        interaction = interaction.withElement(element)
    }

    fun withElement(elementPicker: Atom<ElementReference>) = this.also {
        interaction = interaction.withElement(elementPicker)
    }

    fun withNoTimeout() = this.also {
        interaction = interaction.withNoTimeout()
    }

    fun withTimeout(amount: Long, unit: TimeUnit) = this.also {
        interaction = interaction.withTimeout(amount, unit)
    }

    override fun screenInterceptors() = Screen.webInterceptors
    override fun kakaoInterceptor() = Kakao.webInterceptor
}
