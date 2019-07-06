package com.agoda.sample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.screen.Screen
import com.agoda.sample.screen.ConfiguratorTestActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ConfiguratorTestActivityTest {

    init {
        KakaoConfigurator.configure(history = null) {
            onViewInteraction { viewInteraction ->
                onPerform { viewAction ->
                    Log.i("Intercept_", "action=${viewAction.description}")
                    viewInteraction.perform(viewAction)
                }
                onCheck { viewAssertion ->
                    Log.i("Intercept_", "check=$viewAssertion")
                    viewInteraction.check(viewAssertion)
                }
            }
        }
    }

    @Rule
    @JvmField
    val rule = ActivityTestRule(TestActivity::class.java)

    val screen = ConfiguratorTestActivityScreen()

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
                    Screen.idle(500)
                }

                doesNotExist()
            }

        }

        Log.i("Intercept", "---------------")

        KakaoConfigurator.configure(history = null) {
            onViewInteraction(doOverride = true) { viewInteraction ->
                onCheck { viewAssertion ->
                    Log.i("Intercept_2", "check=$viewAssertion")
                    viewInteraction.check(viewAssertion)
                }
            }
        }

        Log.i("Intercept", "---------------")

        screen {
            content {
                isVisible()
            }

            textViewLarge {
                click()
                isVisible()
                hasText("LARGE")
            }
        }

    }

}