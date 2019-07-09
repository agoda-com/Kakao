package com.agoda.kakao.delegate

import com.agoda.kakao.intercept.Interceptor

/**
 * Base delegate interface.
 *
 * Provides functionality of aggregating interceptors and invoking them on `check`
 * and `perform` invocations.
 *
 * @see Interceptor
 */
interface Delegate<INTERACTION, ASSERTION, ACTION> {
    var interaction: INTERACTION
    var interceptor: Interceptor<INTERACTION, ASSERTION, ACTION>?

    fun screenInterceptor(): Interceptor<INTERACTION, ASSERTION, ACTION>?
    fun kakaoInterceptor(): Interceptor<INTERACTION, ASSERTION, ACTION>?

    fun interceptCheck(assertion: ASSERTION): Boolean {
        interceptors().forEach { interceptor ->
            interceptor.onAll?.let {
                it.second(interaction)
                if (it.first) return true
            }

            interceptor.onCheck?.let {
                it.second(interaction, assertion)
                if (it.first) return true
            }
        }

        return false
    }

    fun interceptPerform(action: ACTION): Boolean {
        interceptors().forEach { interceptor ->
            interceptor.onAll?.let {
                it.second(interaction)
                if (it.first) return true
            }

            interceptor.onPerform?.let {
                it.second(interaction, action)
                if (it.first) return true
            }
        }

        return false
    }

    private fun interceptors() = mutableListOf<Interceptor<INTERACTION, ASSERTION, ACTION>>().also { list ->
        interceptor?.let { list.add(it) }
        screenInterceptor()?.let { list.add(it) }
        kakaoInterceptor()?.let { list.add(it) }
    }
}
