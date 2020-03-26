@file:Suppress("unused")

package com.agoda.kakao.toolbar

import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.ToolbarSubtitleMatcher
import com.agoda.kakao.common.matchers.ToolbarTitleMatcher

/**
 * Provides assertion for Toolbar
 */
interface ToolbarViewAssertions : BaseAssertions {
    fun hasTitle(title: String) {
        view.check(ViewAssertions.matches(ToolbarTitleMatcher(title)))
    }

    fun hasSubtitle(subtitle: String) {
        view.check(ViewAssertions.matches(ToolbarSubtitleMatcher(subtitle)))
    }
}
