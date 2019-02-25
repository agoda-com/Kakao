package com.agoda.sample

import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.IntentActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class IntentActivityTest {
    @Rule
    @JvmField
    val rule = IntentsTestRule(IntentActivity::class.java)

    @Test
    fun testContentScreen() {
        onScreen<IntentActivityScreen> {
            resultText { hasText("No result") }

            startActivityButton { click() }
            normalIntent { intended() }
            pressBack()

            okResultIntent { intending() }
            startActivityForResultButton { click() }
            resultText { hasText("SUCCESS") }

            errorResultIntent { intending() }
            startActivityForResultButton { click() }
            resultText { hasText("null") }
        }
    }
}