@file:Suppress("unused")

package com.agoda.kakao.common.actions

import android.view.InputDevice
import android.view.MotionEvent
import android.view.View
import androidx.test.espresso.FailureHandler
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.GeneralClickAction
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Tap
import androidx.test.espresso.action.ViewActions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.delegate.ViewInteractionDelegate
import org.hamcrest.Matcher

/**
 * Base interface for performing actions on view
 *
 * Provides a lot of basic action methods, such as click(), scrollTo(), etc.
 *
 * @see com.agoda.kakao.edit.EditableActions
 * @see com.agoda.kakao.common.actions.SwipeableActions
 * @see com.agoda.kakao.common.actions.ScrollableActions
 * @see com.agoda.kakao.check.CheckableActions
 */
interface BaseActions {
    val view: ViewInteractionDelegate

    /**
     * Performs click on view
     *
     * @param location Location of view where it should be clicked (VISIBLE_CENTER by default)
     */
    fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER) {
        view.perform(
            GeneralClickAction(
                Tap.SINGLE, location, Press.FINGER,
                InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY
            )
        )
    }

    /**
     * Performs double click on view
     *
     * @param location Location of view where it should be clicked (VISIBLE_CENTER by default)
     */
    fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER) {
        view.perform(
            GeneralClickAction(
                Tap.DOUBLE, location, Press.FINGER,
                InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY
            )
        )
    }

    /**
     * Performs long click on view
     *
     * @param location Location of view where it should be clicked (VISIBLE_CENTER by default)
     */
    fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER) {
        view.perform(
            GeneralClickAction(
                Tap.LONG, location, Press.FINGER,
                InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY
            )
        )
    }

    /**
     * Presses IME action, if supported view is in focus
     */
    fun pressImeAction() {
        view.perform(ViewActions.pressImeActionButton())
    }

    /**
     * Scrolls to the view, if possible
     */
    fun scrollTo() {
        view.perform(NestedScrollToAction())
    }

    /**
     * Performs custom action on a view
     *
     * @param function Lambda that must return ViewAction which will be performed
     */
    fun act(function: () -> ViewAction) {
        view.perform(function.invoke())
    }

    /**
     * Adds failure handler to the view
     *
     * @param function Lambda that handles this view's errors
     */
    fun onFailure(function: (error: Throwable, matcher: Matcher<View>) -> Unit) {
        view.withFailureHandler(FailureHandler { error, viewMatcher -> function(error, viewMatcher) })
    }

    /**
     * Repeats given action on the view until this view will match the given matcher
     *
     * @param maxAttempts Maximum repeat count of the action
     * @param action Action to be performed
     * @param matcher ViewBuilder that will be used as matcher
     *
     * @see ViewActions.repeatedlyUntil
     */
    fun repeatUntil(maxAttempts: Int = 1, action: () -> ViewAction, matcher: ViewBuilder.() -> Unit) {
        view.perform(
            ViewActions.repeatedlyUntil(
                action(),
                ViewBuilder().apply(matcher).getViewMatcher(), maxAttempts
            )
        )
    }
}
