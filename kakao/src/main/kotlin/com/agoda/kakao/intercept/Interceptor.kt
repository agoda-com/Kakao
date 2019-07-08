package com.agoda.kakao.intercept

import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.web.assertion.WebAssertion
import androidx.test.espresso.web.model.Atom
import androidx.test.espresso.web.sugar.Web

/**
 * Base class for intercepting the call chain from Kakao to Espresso.
 *
 * Interceptors can be provided through [Kakao][com.agoda.kakao.Kakao] runtime,
 * different [Screens][com.agoda.kakao.screen.Screen] as well as [KViews][com.agoda.kakao.common.views.KBaseView].
 *
 * Interceptors are stacked during the runtime for any Kakao-Espresso `check` and `perform` operations.
 * The stack ordering is following: KView interceptor -> Screen interceptor -> Kakao interceptor.
 *
 * Any of the interceptors in the chain can break the chain call, this will not only prevent underlying
 * interceptors from being invoked, but prevents Kakao from executing the operation. In that case,
 * responsibility for actually making Espresso call lies on developer.
 *
 * For each operation the interceptor invocation cycle will be as follows:
 * ```
 * // For check operation
 * onAll?.invoke()
 * onCheck?.invoke()
 *
 * // For perform operation
 * onAll?.invoke()
 * onPerform?.invoke()
 * ```
 *
 * @see com.agoda.kakao.Kakao
 * @see com.agoda.kakao.screen.Screen
 * @see com.agoda.kakao.common.views.KBaseView
 */
class Interceptor<T, C, P>(
        val onCheck: Pair<Boolean, (T, C) -> Unit>?,
        val onPerform: Pair<Boolean, (T, P) -> Unit>?,
        val onAll: Pair<Boolean, (T) -> Unit>?
) {
    /**
     * Builder class that is used to build a single instance of [Interceptor].
     *
     * @see Interceptor
     */
    class Builder<T, C, P> {
        private var onCheck: Pair<Boolean, (T, C) -> Unit>? = null
        private var onPerform: Pair<Boolean, (T, P) -> Unit>? = null
        private var onAll: Pair<Boolean, (T) -> Unit>? = null

        /**
         * Sets the interceptor for the `check` operation for a given interaction.
         * If overridden, breaks the call chain of operation and transfers the responsibility
         * to invoke the Espresso on the developer.
         *
         * @param isOverride if `true` - breaks the call chain, false otherwise
         * @param interceptor lambda with intercepting logic
         */
        fun onCheck(isOverride: Boolean = false, interceptor: (T, C) -> Unit) {
            onCheck = isOverride to interceptor
        }

        /**
         * Sets the interceptor for the `perform` operation for a given interaction.
         * If overridden, breaks the call chain of operation and transfers the responsibility
         * to invoke the Espresso on the developer.
         *
         * @param isOverride if `true` - breaks the call chain, false otherwise
         * @param interceptor lambda with intercepting logic
         */
        fun onPerform(isOverride: Boolean = false, interceptor: (T, P) -> Unit) {
            onPerform = isOverride to interceptor
        }

        /**
         * Sets the interceptor for the `check` and `perform` operations for a given interaction.
         * If overridden, breaks the call chain of operation and transfers the responsibility
         * to invoke the Espresso on the developer.
         *
         * This interceptor is prioritized and is being invoked first for both operations.
         *
         * @param isOverride if `true` - breaks the call chain, false otherwise
         * @param interceptor lambda with intercepting logic
         */
        fun onAll(isOverride: Boolean = false, interceptor: (T) -> Unit) {
            onAll = isOverride to interceptor
        }

        internal fun build(): Interceptor<T, C, P> = Interceptor(onCheck, onPerform, onAll)
    }

    /**
     * Configuration class that is used for building interceptors on the
     * [Kakao][com.agoda.kakao.Kakao] runtime and [Screen][com.agoda.kakao.screen.Screen] levels.
     *
     * @see com.agoda.kakao.Kakao
     * @see com.agoda.kakao.screen.Screen
     */
    class Configurator {
        private var vi: Interceptor<ViewInteraction, ViewAssertion, ViewAction>? = null
        private var di: Interceptor<DataInteraction, ViewAssertion, ViewAction>? = null
        private var wi: Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>? = null

        /**
         * Setups the interceptor for `check` and `perform` operations happening through [ViewInteraction]
         *
         * @param builder Builder of interceptor for [ViewInteraction]
         */
        fun onViewInteraction(builder: Builder<ViewInteraction, ViewAssertion, ViewAction>.() -> Unit) {
            vi = Builder<ViewInteraction, ViewAssertion, ViewAction>().apply(builder).build()
        }

        /**
         * Setups the interceptor for `check` and `perform` operations happening through [DataInteraction]
         *
         * @param builder Builder of interceptor for [DataInteraction]
         */
        fun onDataInteraction(builder: Builder<DataInteraction, ViewAssertion, ViewAction>.() -> Unit) {
            di = Builder<DataInteraction, ViewAssertion, ViewAction>().apply(builder).build()
        }

        /**
         * Setups the interceptor for `check` and `perform` operations happening through [Web.WebInteraction]
         *
         * @param builder Builder of interceptor for [Web.WebInteraction]
         */
        fun onWebInteraction(builder: Builder<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>.() -> Unit) {
            wi = Builder<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>().apply(builder).build()
        }

        internal fun configure(): Triple<
                Interceptor<ViewInteraction, ViewAssertion, ViewAction>?,
                Interceptor<DataInteraction, ViewAssertion, ViewAction>?,
                Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>?> {
            return Triple(vi, di, wi)
        }
    }
}
