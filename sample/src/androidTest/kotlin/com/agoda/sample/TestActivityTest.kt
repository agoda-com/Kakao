package com.agoda.sample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.idle
import com.agoda.sample.screen.TestActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestActivityTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(TestActivity::class.java)

    val screen = TestActivityScreen()

    @Test
    fun testContentScreen() {
        screen {
            content {
                isVisible()
            }

            textViewLarge {
                click()
                isVisible()
                hasText("LARGE")
            }

            textViewSmall {
                isVisible()
                hasText("small")
            }

            textViewColored {
                hasTextColor(R.color.background_color)
            }

            map {
                click()
                hasAnyTag("test_tag", "non_test_tag")
            }

            recycler {
                hasText("RECYCLER")
            }

            autoComplete {
                hasText("AUTO_COMPLETE")
            }

            ratingbar {
                hasRating(0f)
                setRatingAt(3f)
                hasRating(3f)
            }

            snackbarButton {
                click()
            }

            snackbar {
                isDisplayed()

                text { hasText("This is snackbar!") }
                action {
                    hasText("DISMISS")
                    click()
                    idle(500)
                }

                doesNotExist()
            }

            seekbar {
                hasProgress(70)
                dragProgressTo(30)
                hasProgress(30)
            }
        }
    }
}
