@file:Suppress("unused")

package com.agoda.kakao.common.matchers

import android.view.View
import androidx.test.espresso.matcher.BoundedMatcher
import com.google.android.material.slider.Slider
import org.hamcrest.Description

/**
 * Matcher of value slider of given matcher
 *
 * @param value of value that matched the view which is Slider
 */
class SliderMatcher(private val value: Float) : BoundedMatcher<View, Slider>(Slider::class.java) {
    override fun matchesSafely(view: Slider?) = view?.let { it.value == value } ?: false

    override fun describeTo(description: Description) {
        description.appendText("slider value is: $value")
    }
}
