@file:Suppress("unused")

package com.agoda.kakao.toolbar

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.ToolbarNavigationMatcher
import com.agoda.kakao.common.matchers.ToolbarSubtitleMatcher
import com.agoda.kakao.common.matchers.ToolbarTitleMatcher

/**
 * Provides assertion for Toolbar
 */
interface ToolbarViewAssertions : BaseAssertions {

    /**
     * Checks if Toolbar has title
     *
     * @param title expected title string
     */
    fun hasTitle(title: String) {
        view.check(ViewAssertions.matches(ToolbarTitleMatcher(title)))
    }

    /**
     * Checks if Toolbar has subtitle
     *
     * @param subtitle expected subtitle string
     */
    fun hasSubtitle(subtitle: String) {
        view.check(ViewAssertions.matches(ToolbarSubtitleMatcher(subtitle)))
    }

    /**
     * Checks if Toolbar has title
     *
     * @param resId expected title resource id
     */
    fun hasTitle(resId: Int) {
        view.check(ViewAssertions.matches(ToolbarTitleMatcher(resId)))
    }

    /**
     * Checks if Toolbar has subtitle
     *
     * @param resId expected subtitle resource id
     */
    fun hasSubtitle(resId: Int) {
        view.check(ViewAssertions.matches(ToolbarSubtitleMatcher(resId)))
    }

    /**
     * Checks if Toolbar has navigation icon
     *
     * @param resId expected drawable resource id
     */
    fun hasHomeAsUpIndicatorDrawable(@DrawableRes resId: Int) {
        view.check(ViewAssertions.matches(ToolbarNavigationMatcher(resId)))
    }

    /**
     * Checks if Toolbar has navigation icon
     *
     * @param drawable expected drawable
     */
    fun hasHomeAsUpIndicatorDrawable(drawable: Drawable) {
        view.check(ViewAssertions.matches(ToolbarNavigationMatcher(drawable)))
    }
}
