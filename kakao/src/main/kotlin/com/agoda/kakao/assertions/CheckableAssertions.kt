package com.agoda.kakao.assertions

import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers

/**
 * Provides checkable based assertions for views
 */
interface CheckableAssertions : BaseAssertions {
    /**
     * Checks if the view is checked
     */
    fun isChecked() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isChecked()))
    }

    /**
     * Checks if the view is not checked
     */
    fun isNotChecked() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isNotChecked()))
    }
}