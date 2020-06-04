package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.TextInputLayoutScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class TextInputLayoutTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(TextInputLayoutActivity::class.java)

    @Test
    fun testTextInputLayout() {
        onScreen<TextInputLayoutScreen> {
            inputLayout {
                hasCounterMaxLength(50)
                edit {
                    hasHint("This is the HINT!")
                }
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
