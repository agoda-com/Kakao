package com.agoda.kakao.picker

import android.widget.DatePicker
import androidx.test.espresso.contrib.PickerActions
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton

/**
 * View for interact with default date picker
 *
 * @see DatePicker
 */
class KDatePicker : KBaseView<KDatePicker>({ isInstanceOf(DatePicker::class.java) }) {
    val action = KButton {
        isDescendantOfA { isInstanceOf(DatePicker::class.java) }
        withId(android.R.id.button1)
    }

    fun setDate(year: Int, month: Int, day: Int) {
        perform {
            PickerActions.setDate(year, month, day)
        }
    }
}
