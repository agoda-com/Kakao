package com.agoda.kakao.spinner

import android.view.View
import android.widget.AdapterView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.delegate.ViewInteractionDelegate
import org.hamcrest.Matchers

interface SpinnerAdapterActions {
    val view: ViewInteractionDelegate
    var popupView: ViewInteractionDelegate?

    /**
     * Returns the size of the spinner
     *
     * @return size of adapter
     *
     * @see Spinner
     * @see AdapterView
     */
    fun getSize(): Int {
        var size = 0

        popupView?.perform(object: ViewAction {
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


    /**
     * Opens the spinner to display it's items
     */
    fun open()

    /**
     * Closes the spinner
     */
    fun close()
}