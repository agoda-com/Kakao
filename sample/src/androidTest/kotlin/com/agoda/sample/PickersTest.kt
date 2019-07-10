package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen
import com.agoda.sample.screen.PickersActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class PickersTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(PickersActivity::class.java)

    @Test
    fun testTextInputLayout() {
        Screen.onScreen<PickersActivityScreen> {
            selectTimeButton {
                click()
            }

            timePicker {
                setTime(22, 4)
                hasTime(22, 4)
                cancelButton {
                    click()
                }
                doesNotExist()
            }

            selectTimeButton {
                click()
            }

            timePicker {
                setTime(22, 4)
                okButton {
                   click()
                }
            }

            timeText {
                hasText("22:4")
            }

            selectDateButton {
                click()
            }

            datePicker {
                setDate(1955, 11, 12)
                hasDate(1955, 11, 12)
                cancelButton {
                    click()
                }
                doesNotExist()
            }

            selectDateButton {
                click()
            }

            datePicker {
                setDate(1955, 11, 12)
                okButton {
                    click()
                }
            }

            dateText {
                hasText("12 11 1955")
            }
        }
    }
}
