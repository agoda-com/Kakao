@file:Suppress("unused")

package com.agoda.kakao.progress

import android.view.View
import android.widget.ProgressBar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

/**
 * Matcher of value progress of given matcher
 *
 * @param value of progress that matched the view which is ProgressBar
 */
class ProgressMatcher(private val value: Int) : BoundedMatcher<View, ProgressBar>(ProgressBar::class.java) {
    override fun matchesSafely(view: ProgressBar?) = view?.let { it.progress == value } ?: false

    override fun describeTo(description: Description) {
        description.appendText("progress value is: $value")
    }
}
