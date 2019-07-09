package com.agoda.kakao.intercept

import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.web.assertion.WebAssertion
import androidx.test.espresso.web.model.Atom
import androidx.test.espresso.web.sugar.Web

data class InterceptConfiguration(
        val viewInteractionInterceptor: Interceptor<ViewInteraction, ViewAssertion, ViewAction>?,
        val dataInteractionInterceptor: Interceptor<DataInteraction, ViewAssertion, ViewAction>?,
        val webViewInteractionInterceptor: Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>?
)
