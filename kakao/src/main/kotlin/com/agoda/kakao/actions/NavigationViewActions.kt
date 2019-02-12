package com.agoda.kakao.actions

import android.support.test.espresso.contrib.NavigationViewActions

/**
 * Provides actions for navigation view
 */
interface NavigationViewActions : BaseActions {
    /**
     * Clicks on the navigation view menu item with given id
     *
     * @param id Menu id to be navigated to
     */
    fun navigateTo(id: Int) {
        view.perform(NavigationViewActions.navigateTo(id))
    }
}