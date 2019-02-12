package com.agoda.kakao.actions

import android.support.test.espresso.UiController
import android.support.test.espresso.ViewAction
import android.support.test.espresso.matcher.ViewMatchers
import android.support.v4.widget.SwipeRefreshLayout
import android.view.View

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