package com.agoda.kakao.picker.date

import android.widget.DatePicker
import androidx.test.espresso.ViewAssertion
import com.agoda.kakao.common.actions.BaseActions

/**
 * Provides assertions for date picker
 */
interface DatePickerAssertion : BaseActions {

    /**
     * Check if picker dialog contain selected date
     * Month number will be normalized
     *
     * @param year year
     * @param monthOfYear month
     * @param day day
     */
    fun hasDate(year: Int, monthOfYear: Int, day: Int) {
        hasYear(year)
        hasMonth(monthOfYear)
        hasDay(day)
    }

    /**
     * Check if picker dialog contain selected day
     *
     * @param day day
     */
    fun hasDay(day: Int) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is DatePicker) {
                if (day != view.dayOfMonth) {
                    throw AssertionError(
                        "Expected day is $day," +
                                " but actual is ${view.dayOfMonth}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    /**
     * Check if picker dialog contain selected month
     *
     * @param monthOfYear month
     */
    fun hasMonth(monthOfYear: Int) {
        val normalizedMonthOfYear = monthOfYear - 1
        view.check(ViewAssertion { view, notFoundException ->
            if (view is DatePicker) {
                if (normalizedMonthOfYear != view.month) {
                    throw AssertionError(
                        "Expected month is $normalizedMonthOfYear," +
                                " but actual is ${view.month}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    /**
     * Check if picker dialog contain selected year
     *
     * @param year year
     */
    fun hasYear(year: Int) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is DatePicker) {
                if (year != view.year) {
                    throw AssertionError(
                        "Expected year is $year," +
                                " but actual is ${view.year}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }
}
