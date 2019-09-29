package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.RecyclerComplexScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class RecyclerComplexTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(RecyclerComplexActivity::class.java)

    @Test
    fun testContentItemsRecyclerView() {
        onScreen<RecyclerComplexScreen> {
            recycler {
                isVisible()
                hasSize(7)

                firstChild<RecyclerComplexScreen.CheckRow> {
                    isVisible()
                    checkRow { hasText("Setting 1") }
                }

                lastChild<RecyclerComplexScreen.CheckRow> {
                    isVisible()
                    checkRow { hasText("Setting 7") }
                }

                childWith<RecyclerComplexScreen.CheckRow> { withText("Setting 2") } perform {
                    checkRow.isChecked()
                    checkRow.click()
                    checkRow.isNotChecked()
                }
            }
        }
    }
}
