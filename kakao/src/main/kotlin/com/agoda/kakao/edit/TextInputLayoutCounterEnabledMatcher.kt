@file:Suppress("unused")

package com.agoda.kakao.edit

import android.view.View
import com.google.android.material.textfield.TextInputLayout
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

class TextInputLayoutCounterEnabledMatcher(private val enabled: Boolean) : TypeSafeMatcher<View>() {
    override fun matchesSafely(item: View?): Boolean {
        return item?.let {
            if (item is TextInputLayout) {
                item.isCounterEnabled == enabled
            } else false
        } ?: false
    }

    override fun describeTo(desc: Description) {
        desc.appendText("with counter state: ")
            .appendValue(enabled)
    }
}
