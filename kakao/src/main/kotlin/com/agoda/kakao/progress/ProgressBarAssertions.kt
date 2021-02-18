@file:Suppress("unused")

package com.agoda.kakao.progress

import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions

/**
 * Provides assertions for progress bar
 */
interface ProgressBarAssertions : BaseAssertions {
    /**
     *  Checks if view has number of progress as expected
     *
     *  @param number progress as expected
     */
    fun hasProgress(number: Int) {
        view.check(ViewAssertions.matches(ProgressMatcher(number)))
    }
}
