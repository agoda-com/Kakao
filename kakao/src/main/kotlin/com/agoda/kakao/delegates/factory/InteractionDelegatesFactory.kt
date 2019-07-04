package com.agoda.kakao.delegates.factory

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.WebInteractionDelegate

/**
 * Responsible for creating interaction delegates instances, uses interaction delegates factories set in
 * [KakaoConfigurator]. If factories are not set, by default creates stub interaction wrappers without any changes in
 * behavior.
 */
class InteractionDelegatesFactory {

    /**
     * Creates an instance of [ViewInteractionDelegate]. If [viewInteractionDelegateFactory] is null, returns
     * stub implementation, that repeats the [ViewInteraction] behavior.
     *
     * @param viewInteraction the view interaction to be wrapped.
     * @return [ViewInteractionDelegate] the wrapper of [viewInteraction].
     */
    fun createViewInteractionDelegate(
            viewInteraction: ViewInteraction
    ): ViewInteractionDelegate {
        return KakaoConfigurator.configurator.viewInteractionDelegateFactory.invoke(viewInteraction)
    }

    /**
     * Creates an instance of [DataInteractionDelegate]. If [dataInteractionDelegateFactory] is null, returns
     * stub implementation, that repeats the [DataInteraction] behavior.
     *
     * @param dataInteraction the data interaction to be wrapped.
     * @return [DataInteractionDelegate] the wrapper of [dataInteraction].
     */
    fun createDataInteractionDelegate(
            dataInteraction: DataInteraction
    ): DataInteractionDelegate {
        return KakaoConfigurator.configurator.dataInteractionDelegateFactory.invoke(dataInteraction)
    }

    /**
     * Creates an instance of [WebInteractionDelegate]. If [webInteractionDelegateFactory] is null, returns
     * stub implementation, that repeats the [Web.WebInteraction] behavior.
     *
     * @param webInteraction the web interaction to be wrapped.
     * @return [WebInteractionDelegate] the wrapper of [webInteraction].
     */
    fun createWebInteractionDelegate(
            webInteraction: Web.WebInteraction<*>
    ): WebInteractionDelegate {
        return KakaoConfigurator.configurator.webInteractionDelegateFactory.invoke(webInteraction)
    }
}