package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.kakao.spinner.KSpinnerItem
import com.agoda.sample.screen.SpinnerActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SpinnerTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(SpinnerActivity::class.java)

    @Test
    fun testContentItemsSpinner() {
        onScreen<SpinnerActivityScreen> {
            spinner {
                isVisible()
                hasSize(10)

                open()

                childAt<KSpinnerItem>(0) {
                    isVisible()
                    hasText("Title 0")
                }

                emptyLastChild {
                    isVisible()
                    hasText("Title 10")
                }

                emptyChildWith {
                    isInstanceOf(String::class.java)
                    equals("Title 5")
                }

                emptyChildAt(4) {
                    isDisplayed()
                    hasText("Title 5")
                    click()
                }

                hasText("Title 5")
            }
        }
    }
}
