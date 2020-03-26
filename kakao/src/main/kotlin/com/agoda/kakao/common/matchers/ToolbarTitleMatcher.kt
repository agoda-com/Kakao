package com.agoda.kakao.common.matchers

import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.widget.Toolbar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class ToolbarTitleMatcher() : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {

    var title: String? = null
    var resId: Int? = null

    constructor(title: String) : this() {
        this.title = title
    }

    constructor(@StringRes resId: Int) : this() {
        this.resId = resId
    }

    override fun describeTo(desc: Description) {
        desc.appendText("Title is not equals to $title")
    }

    override fun matchesSafely(view: Toolbar?): Boolean {
        if (title == null && resId != null) {
            title = resId?.let { view?.context?.getString(it) }
        }
        return view?.title?.equals(title) ?: false
    }
}
