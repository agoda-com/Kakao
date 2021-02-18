package com.agoda.kakao.common.actions

import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ListView
import android.widget.ScrollView
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ScrollToAction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anyOf

/**
 * Scrolls to a given view with [NestedScrollView] support.
 */
class NestedScrollToAction : ViewAction by ScrollToAction() {
    override fun getConstraints(): Matcher<View> = allOf(
        withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE),
        isDescendantOfA(
            anyOf(
                isAssignableFrom(ScrollView::class.java),
                isAssignableFrom(HorizontalScrollView::class.java),
                isAssignableFrom(NestedScrollView::class.java),
                isAssignableFrom(ListView::class.java),
                isAssignableFrom(RecyclerView::class.java)
            )
        )
    )
}
