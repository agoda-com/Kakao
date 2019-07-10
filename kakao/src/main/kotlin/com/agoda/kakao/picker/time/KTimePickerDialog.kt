package com.agoda.kakao.picker.time

import android.app.TimePickerDialog
import android.widget.TimePicker
import androidx.appcompat.widget.AlertDialogLayout
import com.agoda.kakao.common.views.KBaseView

/**
 * View for interact with default date picker dialog
 *
 * @see TimePickerDialog
 */
class KTimePickerDialog : KBaseView<KTimePickerDialog>({ isInstanceOf(AlertDialogLayout::class.java) }) {
    val timePicker = KTimePicker { isInstanceOf(TimePicker::class.java) }
    val okButton = timePicker.okButton
    val cancelButton = timePicker.cancelButton
}
