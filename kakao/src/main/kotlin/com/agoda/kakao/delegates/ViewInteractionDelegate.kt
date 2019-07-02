package com.agoda.kakao.delegates

import android.support.test.espresso.*
import android.view.View
import org.hamcrest.Matcher

/**
 * An interface duplicating the used in Kakao part of view interaction interface and providing original Espresso *Interactions.
 * If you want to extend the base view interaction behavior, you should implement this interface, and specify it's
 * factory in [com.kaspersky.klkakao.configurator.KakaoConfigurator]
 */
interface ViewInteractionDelegate {

    val viewInteraction: ViewInteraction

    fun perform(viewAction: ViewAction): ViewInteractionDelegate

    fun check(viewAssertion: ViewAssertion): ViewInteractionDelegate

    fun check(function: (View, NoMatchingViewException?) -> Unit): ViewInteractionDelegate

    fun withFailureHandler(function: (Throwable, Matcher<View>) -> Unit): ViewInteractionDelegate

    fun inRoot(rootMatcher: Matcher<Root>): ViewInteractionDelegate
}