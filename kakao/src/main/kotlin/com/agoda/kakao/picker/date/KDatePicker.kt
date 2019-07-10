package com.agoda.kakao.picker.date

import android.view.View
import android.widget.DatePicker
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton
import org.hamcrest.Matcher

/**
 * View for interact with default date picker
 *
 * @see DatePicker
 */
class KDatePicker : KBaseView<KDatePicker>, DatePickerAction, DatePickerAssertion {
    val okButton: KButton
    val cancelButton: KButton

    constructor(function: ViewBuilder.() -> Unit) : super(function) {
        okButton = KButton {
            withId(android.R.id.button1)
        }

        cancelButton = KButton {
            withId(android.R.id.button2)
        }
    }

    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function) {
        okButton = KButton {
            withId(android.R.id.button1)
        }

        cancelButton = KButton {
            withId(android.R.id.button2)
        }
    }

    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function) {
        okButton = KButton {
            withId(android.R.id.button1)
        }

        cancelButton = KButton {
            withId(android.R.id.button2)
        }
    }
}
