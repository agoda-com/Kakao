package com.agoda.kakao.chipgroup

import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.SelectedChipMatcher
import org.hamcrest.Matcher

/**
 * Provides assertions for a ChipGroup
 */
interface ChipGroupAssertions : BaseAssertions {
    /**
     * Check for Chip with text
     *
     * @param text expected text in chip
     */
    fun hasChip(text: String) {
        view.check(ViewAssertions.matches(ViewMatchers.hasDescendant(withText(text))))
    }

    /**
     * Check for Chip with matcher
     *
     * @param matcher expected matcher for chip
     */
    fun hasChip(matcher: Matcher<String>) {
        view.check(ViewAssertions.matches(ViewMatchers.hasDescendant(withText(matcher))))
    }

    /**
     * Check if Chip with matching text in ChipGroup is selected
     *
     * @param text text in chip
     */
    fun chipIsSelected(text: String) {
        view.check(ViewAssertions.matches(SelectedChipMatcher(text)))
    }
}
