package com.agoda.sample

import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.agoda.sample.screen.TestListScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ListTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(ListActivity::class.java)

    val screen = TestListScreen()

    @Test
    fun testContentItemsListView() {
        screen {
            list {
                isVisible()
                hasSize(10)

                firstChild<TestListScreen.Item> {
                    isVisible()
                    title {
                        hasText("Title 1")
                    }
                    subtitle {
                        hasText("This is a test subtitle character sequence")
                        hasBackgroundColor("#dfebf5")
                    }
                }

                lastChild<TestListScreen.Item> {
                    isVisible()
                    title { hasText("Title 10") }
                }

                children<TestListScreen.Item> {
                    subtitle {
                        hasText("This is a test subtitle character sequence")
                        hasBackgroundColor(R.color.background_color)
                    }
                }

                childWith<TestListScreen.Item> {
                    isInstanceOf(String::class.java)
                    equals("Title 5")
                } perform {
                    title {
                        isDisplayed()
                        hasText("Title 5")
                    }

                    button { click() }
                }

                childAt<TestListScreen.Item>(4) {
                    title {
                        isDisplayed()
                        hasText("Title 5")
                    }
                }
            }
        }
    }
}
