@file:Suppress("unused")

package com.agoda.kakao.actions

import android.support.test.espresso.UiController
import android.support.test.espresso.ViewAction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.*
import android.support.test.espresso.matcher.ViewMatchers
import android.view.View

/**
 * Interface with common actions for all screens
 *
 * Provides basic actions that can be performed on each and every screen
 *
 * @property view ViewInteraction on which all actions are performed (root view by default)
 */
interface ScreenActions {
    val view: ViewInteraction

    /**
     * Performs click on device's back button
     */
    fun pressBack() {
        view.perform(ViewActions.pressBack())
    }

    /**
     * Closes soft keyboard, if opened
     */
    fun closeSoftKeyboard() {
        view.perform(ViewActions.closeSoftKeyboard())
    }

    /**
     * Presses a key with corresponding KeyCode
     */
    fun pressKey(keyCode: Int) {
        view.perform(ViewActions.pressKey(keyCode))
    }

    /**
     * Presses a key with correspondingKeyCode and modifiers
     */
    fun pressKey(key: EspressoKey) {
        view.perform(ViewActions.pressKey(key))
    }

    /**
     * Presses the hardware menu key
     */
    fun pressMenuKey() {
        view.perform(ViewActions.pressMenuKey())
    }

    /**
     * Idles for given amount of time
     *
     * @param duration Time to idle in milliseconds (1 second by default)
     */
    fun idle(duration: Long = 1000L) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Idle for $duration milliseconds"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(View::class.java)

            override fun perform(uiController: UiController?, view: View?) {
                uiController?.loopMainThreadForAtLeast(duration)
            }
        })
    }
}

