package com.agoda.sample.screen

import com.agoda.kakao.KButton
import com.agoda.kakao.KTextInputLayout
import com.agoda.kakao.Screen
import com.agoda.sample.R

class TextInputLayoutScreen : Screen<TextInputLayoutScreen>() {
    val inputLayout = KTextInputLayout { withId(R.id.input_layout) }
    val toggleCounter = KButton { withId(R.id.toggle_counter) }
    val toggleHint = KButton { withId(R.id.toggle_hint) }
    val toggleError = KButton { withId(R.id.toggle_error) }
}