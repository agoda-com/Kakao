package com.agoda.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.ChipGroupActivityScreen
import org.hamcrest.CoreMatchers.`is`
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ChipGroupTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ChipGroupActivity::class.java)

    @Test
    fun testChipGroupInteraction() {
        onScreen<ChipGroupActivityScreen> {
            chipGroup {
                selectChip("Chip2")

                isChipSelected("Chip2")

                isChipSelected(`is`("Chip2"))

                selectChipAt(3)

                isChipSelected("Chip4")

                hasSize(4)
            }

            chipGroup1 {
                hasChip(R.id.chip1)

                selectChip(R.id.chip1)

                isChipSelected(R.id.chip1)

                hasSize(1)
            }
        }
    }

}
