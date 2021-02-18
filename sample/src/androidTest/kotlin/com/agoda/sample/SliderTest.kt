package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.SliderScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SliderTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(SliderActivity::class.java)

    @Test
    fun testSlider() {
        onScreen<SliderScreen> {
            slider {
                isVisible()
                hasValue(0f)
                setValue(2f)
                hasValue(2f)
                dragValueTo(8f)
                hasValue(8f)
            }
            buttonValue5 {
                click()
            }
            slider {
                hasValue(5f)
            }
        }
    }
}
