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
class KTimePickerDialog : KBaseView<KTimePickerDialog>({ isRoot() }) {

    init {
        inRoot { isDialog() }
    }

    val timePicker = KTimePicker { isInstanceOf(TimePicker::class.java) }.also {
        it.inRoot { isDialog() }
    }

    val okButton = timePicker.okButton.also {
        it.inRoot { isDialog() }
    }

    val cancelButton = timePicker.cancelButton.also {
        it.inRoot { isDialog() }
    }
}
