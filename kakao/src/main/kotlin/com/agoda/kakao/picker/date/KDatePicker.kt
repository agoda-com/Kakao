package com.agoda.kakao.picker.date

import android.widget.DatePicker
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton

/**
 * View for interact with default date picker
 *
 * @see DatePicker
 */
class KDatePicker : KBaseView<KDatePicker>({ isInstanceOf(DatePicker::class.java) }), DatePickerAction, DatePickerAssertion{
    val okButton = KButton {
        withId(android.R.id.button1)
    }

    val cancelButton = KButton {
        withId(android.R.id.button2)
    }
}
