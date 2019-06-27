@file:Suppress("unused")

package com.agoda.kakao.tabs

import androidx.test.espresso.ViewAssertion
import com.agoda.kakao.common.assertions.BaseAssertions
import com.google.android.material.tabs.TabLayout

/**
 * Provides assertions for TabLayout
 */
interface TabLayoutAssertions : BaseAssertions {
    /**
     * Checks if TabLayout have selected tab with given index
     *
     * @param index tab index to be checked
     */
    fun isTabSelected(index: Int) {
        view.check { view, notFoundException ->
            if (view is TabLayout) {
                if (view.selectedTabPosition != index) {
                    throw AssertionError("Expected selected item index is $index," +
                            " but actual is ${view.selectedTabPosition}")
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        }
    }
}
