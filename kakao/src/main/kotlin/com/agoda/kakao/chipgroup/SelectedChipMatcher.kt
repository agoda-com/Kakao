package com.agoda.kakao.chipgroup

import android.view.View
import androidx.test.espresso.matcher.BoundedMatcher
import com.google.android.material.chip.Chip
import org.hamcrest.Description

/**
 * Matches checked chip
 *
 * @see Chip
 */
class SelectedChipMatcher() :
    BoundedMatcher<View, Chip>(Chip::class.java) {
    override fun describeTo(description: Description) {
        description.appendText("Chip is checked")
    }

    override fun matchesSafely(item: Chip?): Boolean = item?.isChecked == true
}
