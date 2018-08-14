package com.agoda.sample

import androidx.test.runner.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.agoda.sample.screen.TextInputLayoutScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TextInputLayoutTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(TextInputLayoutActivity::class.java)

    val screen = TextInputLayoutScreen()

    @Test
    fun testTextInputLayout() {
        screen {
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