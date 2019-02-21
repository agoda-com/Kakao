package com.agoda.sample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.TestNestedRecyclerScreen
import com.agoda.sample.screen.TestNestedRecyclerScreen.NestedItem
import com.agoda.sample.screen.TestNestedRecyclerScreen.RecyclerItem
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NestedRecyclerTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(NestedRecyclerActivity::class.java)

    @Test
    fun testContentItemsRecyclerView() {
        onScreen<TestNestedRecyclerScreen> {
            recycler {
                isVisible()

                firstChild<RecyclerItem> {
                    isVisible()

                    nested {
                        firstChild<NestedItem> {
                            isVisible()
                            title { hasText("Title 1") }
                        }

                        lastChild<NestedItem> {
                            isVisible()
                            title { hasText("Final Title") }
                        }

                        children<NestedItem> {
                            subtitle { hasText("This is a test subtitle character sequence") }
                            button { click() }
                        }

                        childWith<NestedItem> { withDescendant { withText("Final Title") } } perform {
                            title {
                                isDisplayed()
                                hasText("Final Title")
                            }
                        }

                        childWith<NestedItem> { withDescendant { withText("Title 1") } } perform {
                            title {
                                isDisplayed()
                                hasText("Title 1")
                            }
                        }
                    }
                }
            }
        }
    }
}