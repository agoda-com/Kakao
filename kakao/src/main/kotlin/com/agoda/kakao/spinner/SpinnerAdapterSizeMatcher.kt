package com.agoda.kakao.spinner

import android.view.View
import android.widget.Spinner
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

/**
 * Matches Spinner with count of children
 *
 * @param size of children count in Spinner
 */
class SpinnerAdapterSizeMatcher(private val size: Int) : BoundedMatcher<View, Spinner>(Spinner::class.java) {

    private var itemCount: Int = 0

    override fun matchesSafely(view: Spinner) = run {
        itemCount = view.adapter?.count ?: 0
        itemCount == size
    }

    override fun describeTo(description: Description) {
        description
            .appendText("Spinner with ")
            .appendValue(size)
            .appendText(" item(s), but got with ")
            .appendValue(itemCount)
    }
}
