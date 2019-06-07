package com.agoda.kakao.delegates.impl

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.ViewInteraction
import android.view.View
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.factory.InteractionDelegatesFactory
import org.hamcrest.Matcher

/**
 * Stub implementation of [DataInteractionDelegate], repeats the [DataInteraction] behavior.
 */
internal class DataInteractionDelegateImpl constructor(
        override val viewInteraction: ViewInteraction,
        override val dataInteraction: DataInteraction
) : DataInteractionDelegate {

    override fun onChildView(childMatcher: Matcher<View>): DataInteractionDelegate {
        KakaoConfigurator.dataInteractionDelegateFactory
                ?.invoke(viewInteraction, dataInteraction)?.onChildView(childMatcher)
                ?: dataInteraction.onChildView(childMatcher)
        return this
    }

    override fun check(viewAssertion: ViewAssertion): ViewInteractionDelegate {
        return InteractionDelegatesFactory().createViewInteractionDelegate(
                KakaoConfigurator.dataInteractionDelegateFactory
                        ?.invoke(viewInteraction, dataInteraction)?.check(viewAssertion)?.viewInteraction
                        ?: dataInteraction.check(viewAssertion)
        )
    }
}