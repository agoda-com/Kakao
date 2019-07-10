package com.agoda.kakao.picker.date

import androidx.test.espresso.contrib.PickerActions
import com.agoda.kakao.common.actions.BaseActions

/**
 * Provides actions for date picker
 */
interface DatePickerAction : BaseActions {
    /**
     * Set date to picker dialog
     * Month number will be normalized
     *
     * @param year year
     * @param monthOfYear month
     * @param day day
     */
    fun setDate(year: Int, monthOfYear: Int, day: Int) = view.perform(PickerActions.setDate(year, monthOfYear, day))
}
