package com.agoda.kakao.configurator

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.WebInteractionDelegate

data class ConfigModel(
    val parentConfig: ConfigModel?,
    val viewInteractionDelegateFactory: ((ViewInteraction) -> ViewInteractionDelegate),
    val dataInteractionDelegateFactory: ((DataInteraction) -> DataInteractionDelegate),
    val webInteractionDelegateFactory: ((Web.WebInteraction<*>) -> WebInteractionDelegate)
)