package com.agoda.kakao.picker.date

import android.app.DatePickerDialog
import android.widget.DatePicker
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton

/**
 * View for interact with default date picker dialog
 *
 * @see DatePickerDialog
 */
class KDatePickerDialog : KBaseView<KDatePickerDialog>({ isRoot() }) {

    init {
        inRoot { isDialog() }
    }

    val datePicker = KDatePicker { isInstanceOf(DatePicker::class.java) }
            .also { it.inRoot { isDialog() } }

    val okButton = KButton { withId(android.R.id.button1) }
            .also { it.inRoot { isDialog() } }

    val cancelButton = KButton { withId(android.R.id.button2) }
            .also { it.inRoot { isDialog() } }
}
