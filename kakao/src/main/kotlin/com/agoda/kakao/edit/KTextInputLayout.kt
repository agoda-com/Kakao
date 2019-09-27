@file:Suppress("unused")

package com.agoda.kakao.edit

import android.view.View
import android.widget.EditText
import androidx.test.espresso.DataInteraction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with TextInputLayoutAssertions
 *
 * @see TextInputLayoutAssertions
 */
class KTextInputLayout : KBaseView<KTextInputLayout>, TextInputLayoutAssertions {
    val edit: KEditText

    constructor(function: ViewBuilder.() -> Unit) : super(function) {
        edit = KEditText {
            isDescendantOfA(function)
            withMatcher(ViewMatchers.isAssignableFrom(EditText::class.java))
        }
    }

    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function) {
        edit = KEditText {
            isDescendantOfA(function)
            withMatcher(ViewMatchers.isAssignableFrom(EditText::class.java))
        }
    }

    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function) {
        edit = KEditText {
            isDescendantOfA(function)
            withMatcher(ViewMatchers.isAssignableFrom(EditText::class.java))
        }
    }
}
