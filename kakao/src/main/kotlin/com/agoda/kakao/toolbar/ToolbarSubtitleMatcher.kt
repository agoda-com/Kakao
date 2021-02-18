package com.agoda.kakao.toolbar

import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.widget.Toolbar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class ToolbarSubtitleMatcher() : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {

    var subtitle: String? = null
    var resId: Int? = null

    constructor(subtitle: String) : this() {
        this.subtitle = subtitle
    }

    constructor(@StringRes resId: Int) : this() {
        this.resId = resId
    }

    override fun describeTo(desc: Description) {
        desc.appendText("Subtitle is not equals to $subtitle")
    }

    override fun matchesSafely(view: Toolbar?): Boolean {
        if (subtitle == null && resId != null) {
            subtitle = resId?.let { view?.context?.getString(it) }
        }
        return view?.subtitle?.equals(subtitle) ?: false
    }
}
