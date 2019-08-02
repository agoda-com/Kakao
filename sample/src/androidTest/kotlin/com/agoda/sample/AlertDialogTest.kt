package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen
import com.agoda.sample.screen.AlertDialogActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AlertDialogTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(AlertDialogActivity::class.java)

    @Test
    fun testAlertDialog() {
        Screen.onScreen<AlertDialogActivityScreen> {
            showAlertDialogButton {
                click()
            }

            alertDialog {
                title {
                    hasText("Title")
                }

                message {
                    hasText("Message")
                }

                icon {
                    hasDrawable(R.drawable.abc_ic_star_black_36dp)
                }

                positiveButton {
                    hasText("Positive")
                    click()
                }
            }

            showAlertDialogButton {
                click()
            }

            alertDialog {
                negativeButton {
                    hasText("Negative")
                    click()
                }
            }

            showAlertDialogButton {
                click()
            }

            alertDialog {
                neutralButton {
                    hasText("Neutral")
                    click()
                }
            }
        }
    }
}
