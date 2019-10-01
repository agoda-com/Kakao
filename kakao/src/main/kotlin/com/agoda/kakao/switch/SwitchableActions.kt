@file:Suppress("unused")

package com.agoda.kakao.switch

import android.graphics.Rect
import android.os.Build
import android.view.View
import android.widget.Switch
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.SwitchCompat
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.CoordinatesProvider
import androidx.test.espresso.action.GeneralSwipeAction
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Swipe
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.actions.BaseActions
import org.hamcrest.Description
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

/**
 * Provides action for actions on Switch
 */
interface SwitchableActions : BaseActions {

    enum class Direction { RIGHT, LEFT }

    /**
     * Moves the thumb of the switch to the right
     *
     * @param direction for the thumb to move
     */
    fun swipeSwitchThumb(direction: Direction) {
        view.perform(object : ViewAction {
            override fun getDescription() = "performing SwitchableActions.swipe: $direction"

            override fun getConstraints() =
                Matchers.allOf(ViewMatchers.isAssignableFrom(View::class.java),
                               object : TypeSafeMatcher<View>() {
                                   override fun describeTo(description: Description) {
                                       description.appendText("is assignable from class: ${Switch::class.java} or ${SwitchCompat::class.java}")
                                   }

                                   override fun matchesSafely(view: View) =
                                       Switch::class.java.isAssignableFrom(view.javaClass) or
                                               SwitchCompat::class.java.isAssignableFrom(view.javaClass)
                               })

            @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
            override fun perform(uiController: UiController, view: View) {
                if (view is Switch) {
                    view.takeIf { it.width > 0 }?.run {
                        val trackBounds = trackDrawable.copyBounds()
                        val thumbBounds = thumbDrawable.copyBounds()
                        buildSwitchAction(trackBounds, thumbBounds, direction, uiController)
                    }
                } else if (view is SwitchCompat) {
                    view.takeIf { it.width > 0 }?.run {
                        val trackBounds = trackDrawable.copyBounds()
                        val thumbBounds = thumbDrawable.copyBounds()
                        buildSwitchAction(trackBounds, thumbBounds, direction, uiController)
                    }
                }
            }
        })
    }

    private fun View.buildSwitchAction(
        trackBounds: Rect,
        thumbBounds: Rect,
        direction: Direction,
        uiController: UiController
    ) {
        val position = IntArray(2).also {
            getLocationOnScreen(it)
        }

        val trackWidth = trackBounds.right - trackBounds.left
        val thumbMiddleX = (thumbBounds.right - thumbBounds.left) / 2

        val realHeight = (height - paddingTop - paddingBottom).toFloat()

        val thumbCoordinateProvider = CoordinatesProvider {
            floatArrayOf(
                (position[0] + thumbBounds.left + thumbMiddleX).toFloat(),
                (position[1] + paddingTop).toFloat() + realHeight / 2
            )
        }

        val horizontalMove = if (direction == Direction.RIGHT) trackWidth else -trackWidth
        val endMoveCoordinateProvider = CoordinatesProvider {
            floatArrayOf(
                (position[0] + thumbBounds.left + thumbMiddleX + horizontalMove).toFloat(),
                (position[1] + paddingTop).toFloat() + realHeight / 2
            )
        }

        GeneralSwipeAction(Swipe.FAST, thumbCoordinateProvider, endMoveCoordinateProvider, Press.THUMB)
            .perform(uiController, this)
    }
}
