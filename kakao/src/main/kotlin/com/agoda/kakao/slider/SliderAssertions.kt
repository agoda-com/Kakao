package com.agoda.kakao.slider

import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.SliderMatcher

interface SliderAssertions : BaseAssertions {
    fun hasValue(value: Float) {
        view.check(
            ViewAssertions.matches(SliderMatcher(value))
        )
    }
}
