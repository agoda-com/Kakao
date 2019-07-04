package com.agoda.kakao.configurator

import android.support.test.espresso.web.assertion.WebAssertion
import android.support.test.espresso.web.model.Atom
import android.support.test.espresso.web.model.ElementReference
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.delegates.WebInteractionDelegate
import com.agoda.kakao.delegates.factory.InteractionDelegatesFactory
import org.hamcrest.Matcher


class WebInteractionDelegateBuilder(
    private val webInteractionForBuilder: Web.WebInteraction<*>,
    private val parentWebInteractionDelegate: WebInteractionDelegate?
) {

    internal val webInteractionDelegate = object : WebInteractionDelegate {
        override val webInteraction: Web.WebInteraction<*>
            get() = webInteractionForBuilder

        override fun withElement(ref: Atom<ElementReference>): WebInteractionDelegate {
            return InteractionDelegatesFactory().createWebInteractionDelegate(
                withElement?.invoke(ref)
                    ?: parentWebInteractionDelegate?.withElement(ref)?.webInteraction
                    ?: webInteraction.withElement(ref)
            )
        }

        override fun perform(webAction: Atom<*>): WebInteractionDelegate {
            return InteractionDelegatesFactory().createWebInteractionDelegate(
                perform?.invoke(webAction)
                    ?: parentWebInteractionDelegate?.perform(webAction)?.webInteraction
                    ?: webInteraction.perform(webAction)
            )
        }

        override fun <E> check(webAssertion: WebAssertion<E>, atom: Atom<E>, matcher: Matcher<E>): WebInteractionDelegate {
            // todo
            return this
        }

    }

    private var withElement: ((Atom<ElementReference>) -> Web.WebInteraction<*>)? = null
    private var perform: ((Atom<*>) -> Web.WebInteraction<*>)? = null
    private var check: ((WebAssertion<out Any>, Atom<out Any>, Matcher<out Any>) -> Unit)? = null

    fun onWithElement(withElement: (Atom<ElementReference>) -> Web.WebInteraction<*>) {
        this.withElement = withElement
    }

    fun onPerform(perform: (Atom<*>) -> Web.WebInteraction<*>) {
        this.perform = perform
    }

    fun onCheck() {
        // todo
    }

}