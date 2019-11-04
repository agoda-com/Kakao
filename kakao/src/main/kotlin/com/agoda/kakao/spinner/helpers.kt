package com.agoda.kakao.spinner

import android.os.Build
import androidx.test.espresso.Root
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withClassName
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

fun isSpinnerPopup(): Matcher<Root> = SpinnerPopup()


class SpinnerPopup : TypeSafeMatcher<Root>() {
    override fun describeTo(description: Description?) {
        description?.appendText("with decor view of type PopupWindow\$PopupViewContainer")
    }

    override fun matchesSafely(item: Root?): Boolean {
        var popupClassName = "android.widget.PopupWindow\$PopupViewContainer"
        if (Build.VERSION.SDK_INT >= 23) {
            popupClassName = "android.widget.PopupWindow\$PopupDecorView"
        }
        val dropdownClassName = "android.widget.DropDownListView"
        return withDecorView(
            allOf(
                withClassName(`is`<String>(popupClassName)),
                hasDescendant(withClassName(`is`<String>(dropdownClassName)))
            )
        ).matches(item)
    }

}
