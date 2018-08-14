package com.agoda.sample

import androidx.test.espresso.web.webdriver.Locator
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.agoda.sample.screen.TestWebScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WebTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(WebAcitivty::class.java)

    private val screen = TestWebScreen()

    @Test
    fun testWebViewHasTextHelloAndClickLink() {
        screen {
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
}