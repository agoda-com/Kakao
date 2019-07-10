package com.agoda.kakao.picker.date

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.appcompat.widget.AlertDialogLayout
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton

/**
 * View for interact with default date picker dialog
 *
 * @see DatePickerDialog
 */
class KDatePickerDialog : KBaseView<KDatePickerDialog>({ isInstanceOf(AlertDialogLayout::class.java) }) {
    val datePicker = KDatePicker { isInstanceOf(DatePicker::class.java) }
    val okButton = KButton {
        withId(android.R.id.button1)
    }
    val cancelButton = KButton {
        withId(android.R.id.button2)
    }
}
