package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen
import com.agoda.sample.screen.PickersActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AlerdDialogTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(AlertDialogActivity::class.java)

    @Test
    fun testAlertDialog() {
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
}
