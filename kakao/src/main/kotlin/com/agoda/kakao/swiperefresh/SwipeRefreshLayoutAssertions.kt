@file:Suppress("unused")

package com.agoda.kakao.swiperefresh

import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions

/**
 * Provides assertion for SwipeRefreshLayout
 */
interface SwipeRefreshLayoutAssertions : BaseAssertions {
    /**
     * Checks if the SwipeRefreshLayout is refreshing
     */
    fun isRefreshing() {
        view.check(ViewAssertions.matches(SwipeRefreshLayoutMatcher(true)))
    }

    /**
     * Checks if the SwipeRefreshLayout is not refreshing
     */
    fun isNotRefreshing() {
        view.check(ViewAssertions.matches(SwipeRefreshLayoutMatcher(false)))
    }
}
