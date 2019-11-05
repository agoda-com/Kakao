package com.agoda.kakao.spinner

import android.os.Build
import androidx.test.espresso.Root
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withSpinnerText
import com.agoda.kakao.common.assertions.AdapterAssertions
import com.agoda.kakao.common.matchers.SpinnerAdapterSizeMatcher
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.containsString
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

/**
 * Provides assertions for Spinner adapter
 */
interface SpinnerAdapterAssertions : AdapterAssertions {
    /**
     * Check size of Spinner
     *
     * @param size expected child count size in Spinner
     */
    fun hasSize(size: Int) {
        view.check(ViewAssertions.matches(SpinnerAdapterSizeMatcher(size)))
    }

    /**
     * Check selected text
     *
     * @param text expected selected text in Spinner
     */
    fun hasText(text: String) {
        view.check(ViewAssertions.matches(withSpinnerText(containsString(text))))
    }

    /**
     * Check root view is popup and has a DropDownView Descendant
     *
     * @return Matcher<Root>
     */
    fun isSpinnerPopup() : Matcher<Root> {
        return object: TypeSafeMatcher<Root>() {
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
    }
}
