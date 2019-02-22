package com.agoda.sample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.TextInputLayoutScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TextInputLayoutTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(TextInputLayoutActivity::class.java)

    @Test
    fun testTextInputLayout() {
        onScreen<TextInputLayoutScreen> {
            inputLayout {
                hasCounterMaxLength(50)
                hasHint("This is the HINT!")
                hasError("This is the ERROR!")
                isCounterEnabled()
                isHintEnabled()
                isErrorEnabled()
            }

            toggleCounter { click() }
            toggleHint { click() }
            toggleError { click() }

            inputLayout {
                isCounterDisabled()
                isHintDisabled()
                isErrorDisabled()

                edit {
                    typeText("EDIT TEST")
                    hasText("EDIT TEST")
                }
            }
        }
    }
}