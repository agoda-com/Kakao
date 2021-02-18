@file:Suppress("unused")

package com.agoda.kakao.pager

import android.view.View
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.viewpager.widget.ViewPager
import org.hamcrest.Description

/**
 * Matches ViewPager which page index equals given
 *
 * @param index Index of page
 */
class PageMatcher(private val index: Int) : BoundedMatcher<View, ViewPager>(ViewPager::class.java) {
    override fun describeTo(desc: Description) {
        desc.appendText("with current page index = $index")
    }

    override fun matchesSafely(view: ViewPager?): Boolean =
        view?.let { it.currentItem == index } ?: false
}
