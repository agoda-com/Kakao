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
     * @param year Menu id to be navigated to
     */
    fun setDate(year: Int, month: Int, day: Int) = view.perform(PickerActions.setDate(year, month, day))
}
