package com.agoda.kakao.picker.time

import android.view.View
import android.widget.TimePicker
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton
import org.hamcrest.Matcher

/**
 * View for interact with default time picker
 *
 * @see TimePicker
 */
class KTimePicker : KBaseView<KTimePicker>, TimePickerAction, TimePickerAssertion {
    val okButton: KButton
    val cancelButton: KButton

    constructor(function: ViewBuilder.() -> Unit) : super(function) {
        okButton = KButton {
            isDescendantOfA(function)
            withId(android.R.id.button1)
        }

        cancelButton = KButton {
            isDescendantOfA(function)
            withId(android.R.id.button2)
        }
    }

    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function) {
        okButton = KButton {
            isDescendantOfA(function)
            withId(android.R.id.button1)
        }

        cancelButton = KButton {
            isDescendantOfA(function)
            withId(android.R.id.button2)
        }
    }

    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function) {
        okButton = KButton {
            isDescendantOfA(function)
            withId(android.R.id.button1)
        }

        cancelButton = KButton {
            isDescendantOfA(function)
            withId(android.R.id.button2)
        }
    }
}
