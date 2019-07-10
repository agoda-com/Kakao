package com.agoda.sample.screen

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.picker.KDatePicker
import com.agoda.kakao.picker.KTimePicker

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

    val datePicker: KDatePicker = KDatePicker()
    val timePicker: KTimePicker = KTimePicker()
}
