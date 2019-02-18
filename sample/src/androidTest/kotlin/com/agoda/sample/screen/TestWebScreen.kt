package com.agoda.sample.screen

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.web.KWebView
import com.agoda.sample.R

class TestWebScreen : Screen<TestWebScreen>() {
    val webView = KWebView {
        withId(R.id.webView)
    }
}