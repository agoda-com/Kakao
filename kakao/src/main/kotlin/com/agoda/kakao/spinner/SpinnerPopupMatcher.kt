package com.agoda.kakao.spinner

import androidx.test.espresso.Root
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withClassName
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.anyOf
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

/**
 * Matches Root View is popup window and contains DropDownView
 *
 */
class SpinnerPopupMatcher : TypeSafeMatcher<Root>() {
    var popupClassName = arrayOf(
        "android.widget.PopupWindow\$PopupViewContainer",
        "android.widget.PopupWindow\$PopupDecorView"
    )

    var dropdownClassName = arrayOf(
        "androidx.appcompat.widget.DropDownListView",
        "android.widget.ListPopupWindow\$DropDownListView",
        "android.widget.DropDownListView"
    )

    override fun describeTo(description: Description?) {
        description?.appendText(
            "with decor view of any type in $popupClassName and descendant of any type in $dropdownClassName"
        )
    }

    override fun matchesSafely(item: Root?): Boolean {
        return withDecorView(
            allOf(
                withClassName(anyOf(
                    equalTo(popupClassName[0]),
                    equalTo(popupClassName[1])
                )),
                hasDescendant(withClassName(
                    anyOf(
                        equalTo(dropdownClassName[0]),
                        equalTo(dropdownClassName[1]),
                        equalTo(dropdownClassName[2])
                    )
                ))
            )
        ).matches(item)
    }
}
