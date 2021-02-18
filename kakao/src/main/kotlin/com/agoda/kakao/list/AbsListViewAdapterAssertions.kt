@file:Suppress("unused")

package com.agoda.kakao.list

import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.AdapterAssertions

/**
 * Provides assertions for AbsListView adapter
 */
interface AbsListViewAdapterAssertions : AdapterAssertions {
    /**
     * Check size of AbsListView
     *
     * @param size expected child count size in AbsListView
     */
    fun hasSize(size: Int) {
        view.check(ViewAssertions.matches(AbsListViewAdapterSizeMatcher(size)))
    }
}
