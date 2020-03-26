@file:Suppress("unused")

package com.agoda.kakao.pager2

import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.AdapterAssertions
import com.agoda.kakao.common.matchers.ViewPager2AdapterSizeMatcher

/**
 * Provides assertions for viewpager2 adapter
 */
interface ViewPager2AdapterAssertions : AdapterAssertions {
    /**
     * Check size of view pager 2 view
     *
     * @param size expected child count size in view pager 2 view
     */
    fun hasSize(size: Int) {
        view.check(ViewAssertions.matches(ViewPager2AdapterSizeMatcher(size)))
    }
}
