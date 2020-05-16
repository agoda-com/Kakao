package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen
import com.agoda.sample.screen.TestActivityNoToolbarDrawableScreen
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class TestActivityNoToolbarDrawableTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(TestActivityNoToolbarDrawable::class.java)

    @Rule
    @JvmField
    val exceptionRule: ExpectedException = ExpectedException.none().apply {
        expect(AssertionError::class.java)
        expectMessage("Unable to match navigationIconDrawable, did you forget to provide its view builder?")
    }

    @Test
    fun testToolbarThrowsAssertionErrorOnMissingNavigationDrawableIconBuilder() {
        Screen.onScreen<TestActivityNoToolbarDrawableScreen> {
            content {
                isVisible()
            }

            toolbar {
                hasTitle("Test Activity")
                hasSubtitle("Subtitle")
                hasNavigationIconDrawable(R.drawable.ic_arrow_back_24)
            }
        }
    }
}