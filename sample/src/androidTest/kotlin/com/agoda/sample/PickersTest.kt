package com.agoda.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.agoda.kakao.screen.Screen
import com.agoda.sample.screen.PickersActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class PickersTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(PickersActivity::class.java)

    @Test
    fun testDatePickerDialog() {
        Screen.onScreen<PickersActivityScreen> {
            selectDateButton {
                click()
            }

            datePickerDialog {
                datePicker {
                    setDate(1955, 11, 12)
                    hasDate(1955, 11, 12)
                }
                cancelButton {
                    click()
                }
            }

            selectDateButton {
                click()
            }

            datePickerDialog {
                datePicker {
                    setDate(1955, 11, 12)
                }
                okButton {
                    click()
                }
            }

            dateText {
                hasText("12 11 1955")
            }
        }
    }

    @Test
    fun testTimePickerDialog() {
        Screen.onScreen<PickersActivityScreen> {
            selectTimeButton {
                click()
            }

            timePickerDialog {
                timePicker {
                    setTime(22, 4)
                    hasTime(22, 4)
                }
                cancelButton {
                    click()
                }
            }

            selectTimeButton {
                click()
            }

            timePickerDialog {
                timePicker {
                    setTime(22, 4)
                }
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
        }
    }

}
