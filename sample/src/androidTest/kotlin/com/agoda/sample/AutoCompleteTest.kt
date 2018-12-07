package com.agoda.sample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.sample.screen.AutoCompleteActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AutoCompleteTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(AutoCompleteActivity::class.java)

    val screen = AutoCompleteActivityScreen()

    @Test
    fun testContentItemsListView() {
        screen {
            input {
                isDisplayed()
                typeText("Title")
            }

            list {
                inRoot {
                    isPlatformPopup()
                }

                isVisible()
                hasSize(10)

                firstChild<AutoCompleteActivityScreen.Item> {
                    isVisible()
                    text {
                        hasText("Title 1")
                    }
                }

                lastChild<AutoCompleteActivityScreen.Item> {
                    isVisible()
                    text { hasText("Title 10") }
                }

                childWith<AutoCompleteActivityScreen.Item> {
                    isInstanceOf(String::class.java)
                    equals("Title 5")
                } perform {
                    text {
                        isDisplayed()
                        click()
                    }
                }
            }

            input {
                isDisplayed()
                hasText("Title 5")
            }
        }
    }
}
