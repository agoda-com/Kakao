package com.agoda.kakao.assertions

import android.support.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.matchers.RatingBarMatcher

/**
 * Provides assertions for RatingBar
 */
interface RatingBarAssertions : BaseAssertions {
    /**
     *  Checks if RatingBar has number of rating as expected
     *
     *  @param number rating as expected
     */
    fun hasRating(number: Float) {
        view.check(ViewAssertions.matches(RatingBarMatcher(number)))
    }
}