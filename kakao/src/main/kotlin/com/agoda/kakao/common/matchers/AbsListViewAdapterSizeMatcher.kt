@file:Suppress("unused")

package com.agoda.kakao.common.matchers

import android.view.View
import android.widget.AbsListView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

/**
 * Matches AbsListView with count of children
 *
 * @param size of children count in AbsListView
 */
class AbsListViewAdapterSizeMatcher(private val size: Int) : BoundedMatcher<View, AbsListView>(AbsListView::class.java) {

    private var itemCount: Int = 0

    override fun matchesSafely(view: AbsListView) = run {
        itemCount = view.adapter?.count ?: 0
        itemCount == size
    }

    override fun describeTo(description: Description) {
        description
                .appendText("ListView with ")
                .appendValue(size)
                .appendText(" item(s), but got with ")
                .appendValue(itemCount)
    }
}
