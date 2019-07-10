package com.agoda.sample.screen

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.picker.date.KDatePickerDialog
import com.agoda.kakao.picker.time.KTimePickerDialog

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.agoda.sample.R

open class PickersActivityScreen : Screen<PickersActivityScreen>() {
    val selectDateButton: KView = KView { withId(R.id.select_date) }
    val selectTimeButton: KView = KView { withId(R.id.select_time) }

    val dateText: KTextView = KTextView {
        withId(R.id.date_field)
    }

    val timeText: KTextView = KTextView {
        withId(R.id.time_field)
    }

    val datePickerDialog: KDatePickerDialog = KDatePickerDialog()
    val timePickerDialog: KTimePickerDialog = KTimePickerDialog()
}
