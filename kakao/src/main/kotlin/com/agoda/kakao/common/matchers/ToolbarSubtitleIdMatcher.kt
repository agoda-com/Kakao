package com.agoda.kakao.common.matchers

import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.widget.Toolbar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class ToolbarSubtitleIdMatcher(@StringRes val resId: Int) : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {

    var expectedSubtitle: String? = null

    override fun describeTo(desc: Description) {
        desc.appendText("Subtitle is not equals to $expectedSubtitle")
    }

    override fun matchesSafely(view: Toolbar?): Boolean =
        view?.let {
            expectedSubtitle = it.context.getString(resId)
            it.subtitle == expectedSubtitle
        } ?: false
}
