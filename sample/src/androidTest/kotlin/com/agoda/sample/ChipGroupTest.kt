package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.idle
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.ChipGroupActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ChipGroupTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(ChipGroupActivity::class.java)

    @Test
    fun testChipGroupInteraction() {
        onScreen<ChipGroupActivityScreen> {
            chipGroup {
                selectChip("Chip2")

                idle(5000)

                chipIsSelected("Chip2")
            }
        }
    }

}
