package com.agoda.sample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.KakaoInterceptors
import com.agoda.sample.screen.TestActivityScreen
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InterceptorTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(TestActivity::class.java)
    val screen = TestActivityScreen()

    @Before
    fun setUp() {
        resetInterceptors()
    }

    @Test
    fun testLocalPerformInterceptorCalled() {
        var localInterceptorCalled = false

        screen.button {
            onPerform { _, _ ->
                localInterceptorCalled = true
                true
            }
            click()
        }

        assertTrue(localInterceptorCalled)
    }

    @Test
    fun testGlobalPerformInterceptorNotCalledWhenLocalIntercepted() {
        var globalInterceptorCalled = false

        KakaoInterceptors.setViewInteractionPerformInterceptor { _, _ ->
            globalInterceptorCalled = true
            true
        }
        screen.button {
            onPerform { _, _ -> true }
            click()
        }

        assertFalse(globalInterceptorCalled)
    }

    @Test
    fun testLocalCheckInterceptorCalled() {
        var localInterceptorCalled = false

        screen.button {
            onCheck { _, _ ->
                localInterceptorCalled = true
                true
            }
            isVisible()
        }

        assertTrue(localInterceptorCalled)
    }

    @Test
    fun testGlobalCheckInterceptorNotCalledWhenLocalIntercepted() {
        var globalInterceptorCalled = false

        KakaoInterceptors.setViewInteractionCheckInterceptor { _, _ ->
            globalInterceptorCalled = true
            true
        }
        screen.button {
            onCheck { _, _ -> true }
            isVisible()
        }

        assertFalse(globalInterceptorCalled)
    }

    @Test
    fun testLocalCheckInterceptorCalledBeforeGlobal() {
        val callOrder = mutableListOf<String>()
        KakaoInterceptors.setViewInteractionCheckInterceptor { _, _ ->
            callOrder += "global"
            true
        }

        screen.button {
            onCheck { _, _ ->
                callOrder += "local"
                false
            }
            isVisible()
        }

        assertEquals(listOf("local", "global"), callOrder)
    }

    @Test
    fun testLocalPerformInterceptorCalledBeforeGlobal() {
        val callOrder = mutableListOf<String>()
        KakaoInterceptors.setViewInteractionPerformInterceptor { _, _ ->
            callOrder += "global"
            true
        }

        screen.button {
            onPerform { _, _ ->
                callOrder += "local"
                false
            }
            click()
        }

        assertEquals(listOf("local", "global"), callOrder)
    }

    @After
    fun tearDown() {
        resetInterceptors()
    }

    private fun resetInterceptors() {
        KakaoInterceptors.reset()
        screen.button.reset()
    }
}
