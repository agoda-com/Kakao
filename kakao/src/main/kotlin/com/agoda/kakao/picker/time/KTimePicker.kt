package com.agoda.kakao.picker.time

import android.widget.TimePicker
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton

/**
 * View for interact with default time picker
 *
 * @see TimePicker
 */
class KTimePicker : KBaseView<KTimePicker>({ isInstanceOf(TimePicker::class.java) }), TimePickerAction, TimePickerAssertion {
    val okButton = KButton {
        withId(android.R.id.button1)
    }

    val cancelButton = KButton {
        withId(android.R.id.button2)
    }
}
