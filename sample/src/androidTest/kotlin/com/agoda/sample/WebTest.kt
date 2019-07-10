package com.agoda.sample

import android.support.test.espresso.web.webdriver.Locator
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.TestWebScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WebTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(WebAcitivty::class.java)

    @Test
    fun testWebViewHasTextHelloAndClickLink() {
        onScreen<TestWebScreen> {
            webView {
                withElement(Locator.ID, "text") {
                    hasText("Hello")
                }
                withElement(Locator.LINK_TEXT, "My Home") {
                    click()
                }
            }
        }
    }

    @Test
    fun testWebViewInteractionInterceptor() {
        val list = mutableListOf<String>()

        onScreen<TestWebScreen> {
            webView {
                intercept {
                    onAll { list.add("ALL") }
                    onCheck { _, _ -> list.add("CHECK") }
                    onPerform { _, _ -> list.add("PERFORM") }
                }

                withElement(Locator.ID, "text") {
                    hasText("Hello")
                }
                withElement(Locator.LINK_TEXT, "My Home") {
                    click()
                }
            }
        }

        assert(list == mutableListOf("ALL", "CHECK", "ALL", "PERFORM"))
    }
}