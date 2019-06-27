package com.agoda.kakao.list

import android.view.View
import android.widget.AdapterView
import android.widget.ScrollView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.core.ViewInteractionDelegate
import org.hamcrest.Matchers

interface AbsListViewAdapterActions {
    val view: ViewInteractionDelegate

    /**
     * Returns the size of ScrollView
     *
     * @return size of adapter
     *
     * @see ScrollView
     * @see AdapterView
     */
    fun getSize(): Int {
        var size = 0

        view.perform(object : ViewAction {
            override fun getDescription() = "Get AdapterView adapter size"

            override fun getConstraints() = Matchers.allOf(ViewMatchers.isAssignableFrom(AdapterView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is AdapterView<*>) {
                    size = view.count
                }
            }
        })

        return size
    }
}
