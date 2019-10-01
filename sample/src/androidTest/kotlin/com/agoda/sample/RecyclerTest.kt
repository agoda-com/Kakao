package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.TestRecyclerScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class RecyclerTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(RecyclerActivity::class.java)

    @Test
    fun testContentItemsRecyclerView() {
        onScreen<TestRecyclerScreen> {
            recycler {
                isVisible()
                hasSize(9)

                firstChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Title 0") }
                }

                lastChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Final Title") }
                }

                children<TestRecyclerScreen.ItemWithSubtitle> {
                    subtitle { hasText("This is a test subtitle character sequence") }
                }

                childWith<TestRecyclerScreen.MainItem> { withDescendant { withText("Title 2") } } perform {
                    title {
                        isDisplayed()
                        hasText("Title 2")
                    }
                }

                childWith<TestRecyclerScreen.MainItem> { withDescendant { withText("Title 2") } } perform {
                    title {
                        isDisplayed()
                        hasText("Title 2")
                    }
                }

                childWith<TestRecyclerScreen.CheckBoxItem> { withDescendant { withText("CheckBox 2") } } perform {
                    checkbox {
                        isNotChecked()
                        click()
                        isChecked()
                    }
                }
            }
        }
    }
}
