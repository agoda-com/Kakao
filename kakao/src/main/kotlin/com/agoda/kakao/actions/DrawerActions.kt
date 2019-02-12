package com.agoda.kakao.actions

import android.support.test.espresso.contrib.DrawerActions
import android.view.Gravity

/**
 * Provides actions for navigation drawer
 */
interface DrawerActions : BaseActions {
    /**
     * Opens the navigation drawer
     *
     * @param gravity Gravity to use (Gravity.START by default)
     * @see Gravity.START
     */
    fun open(gravity: Int = Gravity.START) {
        view.perform(DrawerActions.open(gravity))
    }

    /**
     * Closes the navigation drawer
     *
     * @param gravity Gravity to use (Gravity.START by default)
     * @see Gravity.START
     */
    fun close(gravity: Int = Gravity.START) {
        view.perform(DrawerActions.close(gravity))
    }
}