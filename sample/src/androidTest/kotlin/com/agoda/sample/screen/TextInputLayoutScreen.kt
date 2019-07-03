package com.agoda.sample.screen

import com.agoda.kakao.edit.KTextInputLayout
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.sample.R

class TextInputLayoutScreen : Screen<TextInputLayoutScreen>() {
    val inputLayout = KTextInputLayout { withId(R.id.input_layout) }
    val toggleCounter = KButton { withId(R.id.toggle_counter) }
    val toggleHint = KButton { withId(R.id.toggle_hint) }
    val toggleError = KButton { withId(R.id.toggle_error) }

    init {
        rootView = inputLayout
    }
}
