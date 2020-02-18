@file:Suppress("unused")

package com.agoda.kakao.pager2

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.viewpager2.widget.ViewPager2
import com.agoda.kakao.common.actions.ScrollableActions
import com.agoda.kakao.common.actions.SwipeableActions
import org.hamcrest.Matchers

/**
 * Provides ScrollableActions implementation for ViewPager2
 *
 * @see ScrollableActions
 * @see SwipeableActions
 * @see ViewPager2
 */
interface ViewPager2Actions : ScrollableActions, SwipeableActions {

    override fun scrollToStart() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll view pager 2 to the start"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(ViewPager2::class.java)

            override fun perform(controller: UiController, view: View) {
                if (view is ViewPager2) {
                    view.setCurrentItem(0, false)
                    controller.loopMainThreadUntilIdle()
                }
            }
        })
    }

    override fun scrollToEnd() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll view pager 2 to the end"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(ViewPager2::class.java)

            override fun perform(controller: UiController, view: View) {
                if (view is ViewPager2) {
                    val endPosition = view.adapter?.itemCount?.let { it - 1 } ?: 0
                    view.setCurrentItem(endPosition, false)
                    controller.loopMainThreadUntilIdle()
                }
            }
        })
    }

    override fun scrollTo(position: Int) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll view pager 2 to specific position"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(ViewPager2::class.java)

            override fun perform(controller: UiController, view: View) {
                if (view is ViewPager2) {
                    view.setCurrentItem(position, false)
                    controller.loopMainThreadUntilIdle()
                }
            }
        })
    }
    /**
     * Returns the size of ViewPager2
     *
     * @return size of adapter
     *
     * @see ViewPager2
     */
    fun getSize(): Int {
        var size = 0

        view.perform(object : ViewAction {
            override fun getDescription() = "Get view pager adapter size"

            override fun getConstraints() =
                Matchers.allOf(ViewMatchers.isAssignableFrom(ViewPager2::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ViewPager2) {
                    size = view.adapter?.itemCount!!
                }
            }
        })

        return size
    }
}
