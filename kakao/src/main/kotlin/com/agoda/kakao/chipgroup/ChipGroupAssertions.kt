package com.agoda.kakao.chipgroup

import androidx.annotation.IdRes
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withChild
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.ChildCountMatcher
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.allOf
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
        view.check(ViewAssertions.matches(withChild(withText(text))))
    }

    /**
     * Check for Chip with matcher
     *
     * @param matcher expected matcher for chip
     */
    fun hasChip(matcher: Matcher<String>) {
        view.check(ViewAssertions.matches(withChild(withText(matcher))))
    }

    /**
     * Check if ChipGroup has a Chip with id
     *
     * @param id Chip id
     */
    fun hasChip(@IdRes id: Int) {
        view.check(ViewAssertions.matches(withChild(withId(id))))
    }

    /**
     * Check if Chip with matching text in ChipGroup is selected
     *
     * @param text text in chip
     */
    fun isChipSelected(text: String) {
        isChipSelected(`is`(text))
    }

    /**
     * Check if Chip with matching text in ChipGroup is selected
     *
     * @param matcher matcher with text
     */
    fun isChipSelected(matcher: Matcher<String>) {
        view.check(ViewAssertions.matches(withChild(allOf(withText(matcher), SelectedChipMatcher()))))
    }

    /**
     * Check if Chip with matching id in ChipGroup is selected
     *
     * @param id Chip id
     */
    fun isChipSelected(@IdRes id: Int) {
        view.check(ViewAssertions.matches(withChild(allOf(withId(id), SelectedChipMatcher()))))
    }

    /**
     * Check if ChipGroup has size number of chips
     *
     * @param size Chip id
     */
    fun hasSize(size: Int) {
        view.check(ViewAssertions.matches(ChildCountMatcher(size)))
    }
}
