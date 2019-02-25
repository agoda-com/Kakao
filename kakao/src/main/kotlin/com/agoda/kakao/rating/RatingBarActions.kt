@file:Suppress("unused")

package com.agoda.kakao.rating

import android.view.View
import android.widget.RatingBar
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.actions.BaseActions

/**
 * Provides action for RatingBar
 */
interface RatingBarActions : BaseActions {
    /**
     * Set rating for RatingBar
     *
     * @param number rating to set for the RatingBar
     */
    fun setRatingAt(number: Float) {
        view.perform(object : ViewAction {
            override fun getDescription() = "set rating value of rating bar as: $number"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(RatingBar::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is RatingBar) {
                    view.rating = number
                }
            }
        })
    }
}