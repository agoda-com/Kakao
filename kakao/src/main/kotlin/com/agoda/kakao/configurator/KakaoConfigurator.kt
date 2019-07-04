package com.agoda.kakao.configurator

import java.lang.IllegalStateException

object KakaoConfigurator {

    var configurator: ConfigModel = ConfiguratorBuilder.clearCreate().getConfigurator()
        private set

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KakaoConfigurator.() -> Unit) {
        function(this)
    }

    fun clearConfigure(configuratorBuilderAction: ConfiguratorBuilder.() -> Unit) {
        val configuratorBuilder = ConfiguratorBuilder.clearCreate()
        configuratorBuilderAction.invoke(configuratorBuilder)
        configurator = configuratorBuilder.getConfigurator()
    }

    fun clearConfigure(config: ConfigModel) {
        if (config.parentConfig != null) {
            throw IllegalStateException("For clean configure you must set config that is with parent == null. " +
                "Your config=$config")
        }
        configurator = config
    }

    fun configureWithHistory(configuratorBuilderAction: ConfiguratorBuilder.() -> Unit) {
        val configuratorBuilder = ConfiguratorBuilder.createWithHistory(configurator)
        configuratorBuilderAction.invoke(configuratorBuilder)
        configurator = configuratorBuilder.getConfigurator()
    }

    fun configureWithHistory(config: ConfigModel) {
        if (config.parentConfig == null) {
            throw IllegalStateException("For configure with history you must set config that is with parent != null. " +
                "Your config=$config")
        }
        configurator = config
    }

    fun revertParentConfigurator() {
        configurator = configurator.parentConfig
            ?: throw IllegalStateException("Your current configurator does not contain a parent." +
                "Your configurator=$configurator")
    }

}

