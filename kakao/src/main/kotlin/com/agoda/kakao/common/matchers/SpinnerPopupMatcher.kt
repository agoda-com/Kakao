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

    var popupClassName = ""
    var dropdownClassName = ""

    override fun describeTo(description: Description?) {
        description?.appendText(
            "with decor view of type $popupClassName and Descendant $dropdownClassName"
        )
    }

    override fun matchesSafely(item: Root?): Boolean {
        val sdkVersion = Build.VERSION.SDK_INT

        popupClassName = when (sdkVersion) {
            in 17..21 -> "android.widget.PopupWindow\$PopupViewContainer"
            else -> "android.widget.PopupWindow\$PopupDecorView"
        }

        dropdownClassName = when (sdkVersion) {
            in 17..21 -> "androidx.appcompat.widget.DropDownListView"
            in 22..23 -> "android.widget.ListPopupWindow\$DropDownListView"
            else -> "android.widget.DropDownListView"
        }

        return RootMatchers.withDecorView(
            CoreMatchers.allOf(
                ViewMatchers.withClassName(CoreMatchers.`is`<String>(popupClassName)),
                ViewMatchers.hasDescendant(ViewMatchers.withClassName(CoreMatchers.`is`<String>(dropdownClassName)))
            )
        ).matches(item)
    }
}
