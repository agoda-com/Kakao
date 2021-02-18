package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.TestRecyclerScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MultiTypeRecyclerTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(MultitypeRecyclerActivity::class.java)

    @Test
    fun testMultipleItemTypeRecyclerView() {
        onScreen<TestRecyclerScreen> {
            recycler {
                isVisible()
                hasSize(10)

                firstChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Title 0") }
                }

                lastChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Final Title") }
                }

                childAt<TestRecyclerScreen.MainItem>(9) {
                    scrollTo()
                    title { containsText("What is Lorem Ipsum?") }
                    button {
                        scrollTo()
                        click()
                    }
                }

                childWith<TestRecyclerScreen.CheckBoxItem> { withText("CheckBox 2") } perform {
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
