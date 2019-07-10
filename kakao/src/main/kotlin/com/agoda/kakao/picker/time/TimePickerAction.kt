package com.agoda.kakao.picker.time

import androidx.test.espresso.contrib.PickerActions
import com.agoda.kakao.common.actions.BaseActions

/**
 * Provides actions for time picker
 */
interface TimePickerAction : BaseActions {
    /**
     * Set time to picker dialog
     *
     * @param
     */
    fun setTime(hour: Int, minutes: Int) = view.perform(PickerActions.setTime(hour, minutes))
}
