package com.agoda.kakao.common.matchers

import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class ToolbarTitleMatcher(val title: String) : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {
    override fun describeTo(desc: Description) {
        desc.appendText("Title is not equals to $title")
    }

    override fun matchesSafely(view: Toolbar?): Boolean =
        view?.title?.equals(title)?: false
}
