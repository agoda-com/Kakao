package com.agoda.kakao.intercept

import com.agoda.kakao.delegate.Delegate

interface Interceptable<T, C, P> {
    val view: Delegate<T, C, P>

    /**
     * Sets the interceptors for the instance.
     * Interceptors will be invoked on the interaction with the KView.
     *
     * @param builder Builder of the interceptors
     *
     * @see Interceptor
     */
    fun intercept(builder: Interceptor.Builder<T, C, P>.() -> Unit) {
        view.interceptor = Interceptor.Builder<T, C, P>().apply(builder).build()
    }

    /**
     * Removes the interceptors from the instance.
     */
    fun reset() {
        view.interceptor = null
    }
}
