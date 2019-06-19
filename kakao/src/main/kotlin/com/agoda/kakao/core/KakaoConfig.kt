package com.agoda.kakao.core

import com.agoda.kakao.common.interceptors.Interceptor

object Kakao{
    internal val viewInteractionInterceptor = Interceptor()

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: Kakao.() -> Unit) {
        function(this)
    }

    fun onViewInteraction(onInteractionInterceptor: Interceptor.() -> Unit){
        this.viewInteractionInterceptor.apply(onInteractionInterceptor)
    }
}
