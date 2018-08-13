package com.agoda.sample

import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.agoda.sample.screen.TestRecyclerScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecyclerTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(RecyclerActivity::class.java)

    val screen = TestRecyclerScreen()

    @Test
    fun testContentItemsRecyclerView() {
        screen {
            recycler {
                isVisible()
                hasSize(10)

                firstChild<TestRecyclerScreen.Item> {
                    isVisible()
                    title { hasText("Title 1") }
                }

                lastChild<TestRecyclerScreen.Item> {
                    isVisible()
                    title { hasText("Final Title") }
                }

                children<TestRecyclerScreen.Item> {
                    subtitle { hasText("This is a test subtitle character sequence") }
                }

                childWith<TestRecyclerScreen.Item> { withDescendant { withText("Final Title") } } perform {
                    title {
                        isDisplayed()
                        hasText("Final Title")
                    }
                }

                childWith<TestRecyclerScreen.Item> { withDescendant { withText("Title 1") } } perform {
                    title {
                        isDisplayed()
                        hasText("Title 1")
                    }
                }
            }
        }
    }
}
