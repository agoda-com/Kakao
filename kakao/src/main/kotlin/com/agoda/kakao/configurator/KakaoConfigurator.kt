package com.agoda.kakao.configurator

import java.lang.IllegalStateException

object KakaoConfigurator {

    var configurator: Configurator = Configurator.Builder().build()
        private set

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KakaoConfigurator.() -> Unit) {
        function(this)
    }

    fun configure(history: Configurator?, builderAction: Configurator.Builder.() -> Unit) {
        val configuratorBuilder = Configurator.Builder(history)
        builderAction.invoke(configuratorBuilder)
        configurator = configuratorBuilder.build()
    }

    fun revertParentConfigurator() {
        configurator = configurator.parentConfig
            ?: throw IllegalStateException("Your current configurator does not contain a parent." +
                "Your configurator=$configurator")
    }

}

