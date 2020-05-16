package com.agoda.sample.screen

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.toolbar.KToolbar
import com.agoda.sample.R

open class TestActivityNoToolbarDrawableScreen : Screen<TestActivityNoToolbarDrawableScreen>() {
    val content: KView = KView { withId(R.id.content) }
    val toolbar: KToolbar = KToolbar(rootBuilder = { withId(R.id.action_bar) })
}
