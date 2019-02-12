package com.agoda.kakao.assertions

import android.support.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.matchers.PageMatcher

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