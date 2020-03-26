package com.agoda.kakao.common.matchers

import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class ToolbarSubtitleMatcher(val subtitle: String) : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {
    override fun describeTo(desc: Description) {
        desc.appendText("Subtitle is not equals to $subtitle")
    }

    override fun matchesSafely(view: Toolbar?): Boolean =
        view?.subtitle?.equals(subtitle)?: false
}
