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
interface Delegate<T, C, P> {
    var interaction: T

    fun viewInterceptor(): Interceptor<T, C, P>?
    fun screenInterceptor(): Interceptor<T, C, P>?
    fun kakaoInterceptor(): Interceptor<T, C, P>?

    fun interceptors(): List<Interceptor<T, C, P>> = mutableListOf<Interceptor<T, C, P>>().also { list ->
        viewInterceptor()?.let { list.add(it) }
        screenInterceptor()?.let { list.add(it) }
        kakaoInterceptor()?.let { list.add(it) }
    }

    fun interceptCheck(assertion: C): Boolean {
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

    fun interceptPerform(action: P): Boolean {
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
}
