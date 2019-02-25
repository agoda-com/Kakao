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
