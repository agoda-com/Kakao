@file:Suppress("unused")

package com.agoda.kakao.slider

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.CoordinatesProvider
import androidx.test.espresso.action.GeneralSwipeAction
import androidx.test.espresso.action.Press
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.actions.BaseActions
import com.agoda.kakao.progress.PreciseSwipe
import com.google.android.material.slider.Slider

/**
 * Provides action for Slider
 */
interface SliderActions : BaseActions {
    /**
     * Set value for Slider
     *
     * @param value of value to set for the Slider
     */
    fun setValue(value: Float) {
        view.perform(object : ViewAction {
            override fun getDescription() = "set value of slider as: $value"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(Slider::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is Slider) {
                    view.value = value
                }
            }
        })
    }

    /**
     * Drags slider to defined position.
     * Please note that this dragging is emulated via Espresso's swipe action
     * and might not be accurate, if progress max value is too high or device's
     * density is too low.
     *
     * @param value of slider to drag to
     *
     * @see GeneralSwipeAction
     */
    fun dragValueTo(value: Float) {
        view.perform(object : ViewAction {
            override fun getDescription() = "drags progress of slider to: $value"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(Slider::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is Slider) {
                    view.takeIf { it.width > 0 }?.run {
                        val position = IntArray(2).apply {
                            view.getLocationOnScreen(this)
                        }

                        val realWidth = (width - paddingLeft - paddingRight).toFloat()
                        val realHeight = (height - paddingTop - paddingBottom).toFloat()

                        position[0] += paddingLeft
                        position[1] += paddingTop

                        val start = CoordinatesProvider {
                            floatArrayOf(
                                position[0].toFloat() + realWidth / valueTo * view.value,
                                position[1].toFloat() + realHeight / 2
                            )
                        }

                        val end = CoordinatesProvider {
                            floatArrayOf(
                                position[0].toFloat() + realWidth / valueTo * value,
                                position[1].toFloat() + realHeight / 2
                            )
                        }

                        GeneralSwipeAction(PreciseSwipe, start, end, Press.PINPOINT)
                            .perform(uiController, view)
                    }
                }
            }
        })
    }
}
