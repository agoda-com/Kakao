package com.agoda.kakao.common.interceptors

import androidx.test.espresso.ViewInteraction

class Interceptor {
    var onAll: ((ViewInteraction) -> Unit)? = null
    var onPerform: ((ViewInteraction) -> Unit)? = null
    var onCheck: ((ViewInteraction) -> Unit)? = null

    fun onAll(override: Boolean = false, onAll: (ViewInteraction) -> Unit) {
        this.onAll = onAll
    }

    fun onPerform(override: Boolean = false, onPerform: (ViewInteraction) -> Unit) {
        this.onPerform = onPerform
    }

    fun onCheck(override: Boolean = false, onCheck: (ViewInteraction) -> Unit) {
        this.onCheck= onCheck
    }
}
