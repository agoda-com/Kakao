package com.agoda.kakao.chipgroup

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import com.agoda.kakao.common.actions.BaseActions
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

interface ChipGroupActions : BaseActions {
    /**
     *  Select a Chip in a ChipGroup with matching text
     *
     *  @param text Text to match
     */
    fun selectChip(text: String) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Clicks a chip with the text: $text"

            override fun getConstraints() = isAssignableFrom(ChipGroup::class.java)

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ChipGroup) {
                    for (i in 0 until view.childCount) {
                        val chip = view.getChildAt(i)
                        if (chip is Chip) {
                            if (chip.text == text) {
                                chip.performClick()
                            }
                        }
                    }
                }
            }

        })
    }
}
