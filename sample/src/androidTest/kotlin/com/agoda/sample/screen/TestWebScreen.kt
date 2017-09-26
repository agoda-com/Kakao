package com.agoda.sample.screen

import com.agoda.kakao.KWebView
import com.agoda.kakao.Screen
import com.agoda.sample.R

class TestWebScreen : Screen<TestWebScreen>() {
    val webView = KWebView {
        withId(R.id.webView)
    }
}