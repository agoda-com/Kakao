package com.agoda.sample

import androidx.test.espresso.web.webdriver.Locator
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.TestWebScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
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
}