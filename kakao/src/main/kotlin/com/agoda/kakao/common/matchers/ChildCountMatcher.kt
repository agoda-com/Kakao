package com.agoda.kakao.common.matchers

import android.view.View
import android.view.ViewGroup
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

/**
 * Matches view with size no of children
 *
 */
class ChildCountMatcher(private val size: Int) : TypeSafeMatcher<View>(View::class.java) {
    override fun describeTo(description: Description?) {
        description?.appendText("view has $size children")
    }

    override fun matchesSafely(item: View?): Boolean {
        if (item is ViewGroup) {
            return item.childCount == size
        }
        return false
    }
}
