@file:Suppress("unused")

package com.agoda.kakao.pager

import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions

/**
 * Provides assertions for view pagers
 */
interface ViewPagerAssertions : BaseAssertions {
    /**
     * Checks if the view is currently at given page
     *
     * @param index Page index to be matched
     */
    fun isAtPage(index: Int) {
        view.check(ViewAssertions.matches(PageMatcher(index)))
    }
}
