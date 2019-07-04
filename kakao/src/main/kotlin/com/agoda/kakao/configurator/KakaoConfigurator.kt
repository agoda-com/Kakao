package com.agoda.kakao.configurator

import java.util.*

object KakaoConfigurator {

    internal var configurator: ConfiguratorModel = ConfiguratorBuilder().getConfigurator()

    private val configuratorHistory: Deque<ConfiguratorModel> = ArrayDeque<ConfiguratorModel>()

    init {
        configuratorHistory.push(configurator)
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KakaoConfigurator.() -> Unit) {
        function(this)
    }

    fun configure(configuratorBuilderAction: ConfiguratorBuilder.() -> Unit) {
        val configuratorBuilder = ConfiguratorBuilder()
        configuratorBuilderAction.invoke(configuratorBuilder)
        configurator = configuratorBuilder.getConfigurator()
        configuratorHistory.push(configurator)
    }

    internal fun pushConfigurator(configurator: ConfiguratorModel) {
        KakaoConfigurator.configurator = configurator
        configuratorHistory.push(configurator)
    }

    internal fun dropLastConfigurator() {
        configuratorHistory.remove()
        configurator = configuratorHistory.peek()
    }

}