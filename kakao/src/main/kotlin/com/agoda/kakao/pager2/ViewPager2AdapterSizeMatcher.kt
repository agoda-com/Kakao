@file:Suppress("unused")

package com.agoda.kakao.pager2

import android.view.View
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.viewpager2.widget.ViewPager2
import org.hamcrest.Description

/**
 * Matches ViewPager2 with count of children
 *
 * @param size of children count in ViewPager2
 */
class ViewPager2AdapterSizeMatcher(private val size: Int) : BoundedMatcher<View, ViewPager2>(ViewPager2::class.java) {

    private var itemCount: Int = 0

    override fun matchesSafely(view: ViewPager2) = run {
        itemCount = view.adapter?.itemCount ?: 0
        itemCount == size
    }

    override fun describeTo(description: Description) {
        description
            .appendText("ViewPager2 with ")
            .appendValue(size)
            .appendText(" item(s), but got with ")
            .appendValue(itemCount)
    }
}
