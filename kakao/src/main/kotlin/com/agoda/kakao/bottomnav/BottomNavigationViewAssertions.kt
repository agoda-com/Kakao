@file:Suppress("unused")

package com.agoda.kakao.bottomnav

import androidx.test.espresso.ViewAssertion
import com.agoda.kakao.common.assertions.BaseAssertions
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Provides assertion for BottomNavigationview
 */
interface BottomNavigationViewAssertions : BaseAssertions {
    /**
     * Checks if the view's selected item id matches given one
     *
     * @param id Menu item id to be checked
     */
    fun hasSelectedItem(id: Int) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is BottomNavigationView) {
                if (view.selectedItemId != id) {
                    throw AssertionError("Expected selected item id is $id," +
                            " but actual is ${view.selectedItemId}")
                }
            } else {
                notFoundException?.let {
                    throw AssertionError(it)
                }
            }
        })
    }
}
