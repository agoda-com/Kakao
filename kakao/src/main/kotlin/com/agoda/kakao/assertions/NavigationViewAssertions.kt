package com.agoda.kakao.assertions

import android.support.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.matchers.NavigationItemMatcher

/**
 * Provides assertions for NavigationView
 */
interface NavigationViewAssertions : BaseAssertions {
    /**
     * Checks if NavigationView has checked given item id
     *
     * @param id menu item expected to be checked
     */
    fun isItemChecked(id: Int) {
        view.check(ViewAssertions.matches(NavigationItemMatcher(id)))
    }
}