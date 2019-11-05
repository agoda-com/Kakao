package com.agoda.kakao.common.matchers

import android.os.Build
import androidx.test.espresso.Root
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.CoreMatchers
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

/**
 * Matches Root View is popup window and contains DropDownView
 *
 */
class SpinnerPopupMatcher : TypeSafeMatcher<Root>() {
    override fun describeTo(description: Description?) {
        description?.appendText("with decor view of type PopupWindow\$PopupViewContainer " +
                                        "and Descendant DropDownView")
    }

    override fun matchesSafely(item: Root?): Boolean {
        var popupClassName = "android.widget.PopupWindow\$PopupViewContainer"
        if (Build.VERSION.SDK_INT >= 23) {
            popupClassName = "android.widget.PopupWindow\$PopupDecorView"
        }
        val dropdownClassName = "android.widget.DropDownListView"
        return RootMatchers.withDecorView(
            CoreMatchers.allOf(
                ViewMatchers.withClassName(CoreMatchers.`is`<String>(popupClassName)),
                ViewMatchers.hasDescendant(ViewMatchers.withClassName(CoreMatchers.`is`<String>(dropdownClassName)))
            )
        ).matches(item)
    }
}
