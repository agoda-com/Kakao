@file:Suppress("unused")

package com.agoda.kakao.swiperefresh

import android.view.View
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

class SwipeRefreshLayoutMatcher(private val refreshing: Boolean) : TypeSafeMatcher<View>() {
    override fun matchesSafely(item: View?): Boolean {
        return item?.let {
            if (item is SwipeRefreshLayout) {
                item.isRefreshing == refreshing
            } else false
        } ?: false
    }

    override fun describeTo(desc: Description) {
        desc.appendText("with refreshing state: ")
            .appendValue(refreshing)
    }
}
