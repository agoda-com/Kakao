@file:Suppress("unused")

package com.agoda.kakao.edit

import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.TextInputLayoutCounterEnabledMatcher
import com.agoda.kakao.common.matchers.TextInputLayoutErrorEnabledMatcher
import com.agoda.kakao.common.matchers.TextInputLayoutHintEnabledMatcher
import com.google.android.material.textfield.TextInputLayout

/**
 * Provides assertions for TextInputLayout
 */
interface TextInputLayoutAssertions : BaseAssertions {
    fun isHintEnabled() {
        view.check(ViewAssertions.matches(TextInputLayoutHintEnabledMatcher(true)))
    }

    fun isHintDisabled() {
        view.check(ViewAssertions.matches(TextInputLayoutHintEnabledMatcher(false)))
    }

    fun hasError(error: String) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is TextInputLayout) {
                if (error != view.error) {
                    throw AssertionError(
                        "Expected error is $error," +
                                " but actual is ${view.error}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    fun isErrorEnabled() {
        view.check(ViewAssertions.matches(TextInputLayoutErrorEnabledMatcher(true)))
    }

    fun isErrorDisabled() {
        view.check(ViewAssertions.matches(TextInputLayoutErrorEnabledMatcher(false)))
    }

    fun hasCounterMaxLength(length: Int) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is TextInputLayout) {
                if (length != view.counterMaxLength) {
                    throw AssertionError(
                        "Expected counter max length is $length," +
                                " but actual is ${view.counterMaxLength}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    fun isCounterEnabled() {
        view.check(ViewAssertions.matches(TextInputLayoutCounterEnabledMatcher(true)))
    }

    fun isCounterDisabled() {
        view.check(ViewAssertions.matches(TextInputLayoutCounterEnabledMatcher(false)))
    }
}
