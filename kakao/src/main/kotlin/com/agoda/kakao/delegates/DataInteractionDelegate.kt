package com.agoda.kakao.delegates

import android.support.annotation.CheckResult
import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewAssertion
import android.view.View
import com.agoda.kakao.configurator.KakaoConfigurator
import org.hamcrest.Matcher
import javax.annotation.CheckReturnValue

/**
 * An interface duplicating the used in Kakao part of data interaction interface and providing original Espresso *Interactions.
 * If you want to extend the base data interaction behavior, you should implement this interface, and specify it's
 * factory in [com.kaspersky.klkakao.configurator.KakaoConfigurator]
 */
interface DataInteractionDelegate {

    val dataInteraction: DataInteraction

    @CheckResult
    @CheckReturnValue
    fun onChildView(childMatcher: Matcher<View>): DataInteractionDelegate {
        return KakaoConfigurator.configurator.dataInteractionDelegateSource
            .invoke(dataInteraction)
            .onChildView(childMatcher)
    }

    fun check(viewAssertion: ViewAssertion): ViewInteractionDelegate {
        return KakaoConfigurator.configurator.dataInteractionDelegateSource
            .invoke(dataInteraction)
            .check(viewAssertion)
    }

}