@file:Suppress("unused")

package com.agoda.kakao.swiperefresh

import android.view.View
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.actions.SwipeableActions

/**
 * Provides actions for SwipeRefreshLayout
 */
interface SwipeRefreshLayoutActions : SwipeableActions {
    /**
     * Sets the refreshing state of SwipeRefreshLayout
     *
     * @param refreshing state to be set
     */
    fun setRefreshing(refreshing: Boolean) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Sets the refreshing state to $refreshing"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(SwipeRefreshLayout::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is SwipeRefreshLayout) {
                    view.isRefreshing = refreshing
                }
            }
        })
    }
}