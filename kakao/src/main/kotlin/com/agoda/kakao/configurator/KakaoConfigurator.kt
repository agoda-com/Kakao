package com.agoda.kakao.configurator

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.WebInteractionDelegate

/**
 * Holds interaction delegates factories used in Kakao.
 * Interaction delegates are middleware between Kakao and Espresso (*Interaction classes).
 * By those delegates you can modify common Kakao's API behaviour like to put logs, to handle flaky occurred because of Espresso bugs and others.
 * You can change factories at any time of a test but we strongly recommend to change before your tests start.
 */
object KakaoConfigurator {

    internal var viewInteractionDelegateFactory:
            ((ViewInteraction) -> ViewInteractionDelegate)? = null

    internal var dataInteractionDelegateFactory:
            ((ViewInteraction, DataInteraction) -> DataInteractionDelegate)? = null

    internal var webInteractionDelegateFactory:
            ((Web.WebInteraction<*>) -> WebInteractionDelegate)? = null

    /**
     * Setter for [viewInteractionDelegateFactory].
     * This factory is used to create instances of [ViewInteractionDelegate] for all Kakao views, so
     * we strongly recommend to set it before your tests start.
     *
     * @param factory the function that returns [ViewInteractionDelegate] as a result of the invocation.
     */
    fun initViewInteractionDelegateFactory(
            factory: ((ViewInteraction) -> ViewInteractionDelegate)?
    ) {
        viewInteractionDelegateFactory = factory
    }

    /**
     * Setter for [dataInteractionDelegateFactory].
     * This factory is used to create instances of [DataInteractionDelegate] for all Kakao views, so
     * we strongly recommend to set it before your tests start.
     *
     * @param factory the function that returns [DataInteractionDelegate] as a result of the invocation.
     */
    fun initDataInteractionDelegateFactory(
            factory: ((ViewInteraction, DataInteraction) -> DataInteractionDelegate)?
    ) {
        dataInteractionDelegateFactory = factory
    }

    /**
     * Setter for [webInteractionDelegateFactory].
     * This factory is used to create instances of [WebInteractionDelegate] for all Kakao views, so
     * we strongly recommend to set it before your tests start.
     *
     * @param factory the function that returns [WebInteractionDelegate] as a result of the invocation.
     */
    fun initWebInteractionDelegateFactory(
            factory: ((Web.WebInteraction<*>) -> WebInteractionDelegate)?
    ) {
        webInteractionDelegateFactory = factory
    }
}