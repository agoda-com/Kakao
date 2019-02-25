@file:Suppress("unused")

package com.agoda.kakao.bottomnav

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.actions.BaseActions
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Provides actions for BottomNavigationView
 */
interface BottomNavigationViewActions : BaseActions {
    /**
     * Sets the given item id as selected
     *
     * @param id menu item id to be set
     */
    fun setSelectedItem(id: Int) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Sets given item id as selected: $id"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(BottomNavigationView::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is BottomNavigationView) {
                    view.selectedItemId = id
                }
            }
        })
    }
}
