package com.agoda.kakao

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewAction
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.assertion.WebAssertion
import android.support.test.espresso.web.model.Atom
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.intercept.Interceptor

object Kakao {
    internal var viewInterceptor: Interceptor<ViewInteraction, ViewAssertion, ViewAction>? = null
    internal var dataInterceptor: Interceptor<DataInteraction, ViewAssertion, ViewAction>? = null
    internal var webInterceptor: Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>? = null

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your Kakao runtime
     */
    operator fun invoke(function: Kakao.() -> Unit) {
        function(this)
    }

    /**
     * Sets the interceptors for the whole Kakao runtime.
     * Interceptors will be invoked on all of the interactions with the KView instances.
     *
     * @param configurator Configuration of the interceptors
     *
     * @see Interceptor
     */
    fun intercept(configurator: Interceptor.Configurator.() -> Unit) {
        Interceptor.Configurator().apply(configurator).configure().also {
            (viewInterceptor,dataInterceptor,webInterceptor) ->
            this.viewInterceptor = viewInterceptor
            this.dataInterceptor = dataInterceptor
            this.webInterceptor = webInterceptor
        }
    }

    /**
     * Removes the interceptors from the Kakao runtime.
     *
     * @see intercept
     * @see Interceptor
     */
    fun reset() {
        viewInterceptor = null
        dataInterceptor = null
        webInterceptor = null
    }
}