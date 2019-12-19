package com.agoda.kakao.common.matchers

import android.view.View
import androidx.test.espresso.matcher.BoundedMatcher
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import org.hamcrest.Description

/**
 * Matches Chip in ChipGroup which is selected and matches text
 *
 * @see ChipGroup
 * @see Chip
 */
class SelectedChipMatcher(private val text: String) :
    BoundedMatcher<View, ChipGroup>(ChipGroup::class.java) {
    override fun describeTo(description: Description) {
        description.appendText("selected chip with text: $text")
    }

    override fun matchesSafely(item: ChipGroup?): Boolean {
        val group = item ?: return false
        for (i in 0 until group.childCount) {
            val chip = group.getChildAt(i)
            if (chip is Chip) {
                if (chip.text == text && chip.isChecked) {
                    return true
                }
            }
        }
        return false
    }
}
