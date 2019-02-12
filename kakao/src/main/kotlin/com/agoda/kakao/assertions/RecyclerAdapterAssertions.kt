package com.agoda.kakao.assertions

import android.support.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.matchers.RecyclerViewAdapterSizeMatcher

/**
 * Provides assertions for recyclerView adapter
 */
interface RecyclerAdapterAssertions : AdapterAssertions {
    /**
     * Check size of recycler view
     *
     * @param size expected child count size in recycler view
     */
    fun hasSize(size: Int) {
        view.check(ViewAssertions.matches(RecyclerViewAdapterSizeMatcher(size)))
    }
}