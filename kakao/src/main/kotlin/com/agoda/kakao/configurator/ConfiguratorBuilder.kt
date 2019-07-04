package com.agoda.kakao.configurator

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.WebInteractionDelegate

class ConfiguratorBuilder private constructor(
    private val parentConfig: ConfigModel? = null
) {

    companion object {
        fun clearCreate(): ConfiguratorBuilder = ConfiguratorBuilder()
        fun createWithHistory(parent: ConfigModel): ConfiguratorBuilder = ConfiguratorBuilder(parent)
    }

    private lateinit var viewInteractionDelegateFactory:
        ((ViewInteraction) -> ViewInteractionDelegate)
    private lateinit var dataInteractionDelegateFactory:
        ((DataInteraction) -> DataInteractionDelegate)
    private lateinit var webInteractionDelegateFactory:
        ((Web.WebInteraction<*>) -> WebInteractionDelegate)

    init {
        onViewInteraction { }
        onDataInteraction { }
        onWebInteraction { }
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: ConfiguratorBuilder.() -> Unit) {
        function(this)
    }

    fun onViewInteraction(
        override: Boolean = false,
        onViewInteractionDelegateBuilder: ViewInteractionDelegateBuilder.(ViewInteraction) -> Unit
    ) {
        viewInteractionDelegateFactory = { viewInteraction ->
            val viewInteractionDelegateBuilder = ViewInteractionDelegateBuilder(
                viewInteractionForBuilder = viewInteraction,
                parentViewInteractionDelegate =
                    if (override) parentConfig?.viewInteractionDelegateFactory?.invoke(viewInteraction)
                    else null
            )
            onViewInteractionDelegateBuilder.invoke(viewInteractionDelegateBuilder, viewInteraction)
            viewInteractionDelegateBuilder.viewInteractionDelegate
        }
    }

    fun onDataInteraction(
        override: Boolean = false,
        onDataInteractionDelegateBuilder: DataInteractionDelegateBuilder.(DataInteraction) -> Unit
    ) {
        dataInteractionDelegateFactory = { dataInteraction ->
            val dataInteractionDelegateBuilder = DataInteractionDelegateBuilder(
                dataInteractionForBuilder = dataInteraction,
                parentDataInteractionDelegate =
                    if (override) parentConfig?.dataInteractionDelegateFactory?.invoke(dataInteraction)
                    else null
            )
            onDataInteractionDelegateBuilder.invoke(dataInteractionDelegateBuilder, dataInteraction)
            dataInteractionDelegateBuilder.dataInteractionDelegate
        }
    }

    fun onWebInteraction(
        override: Boolean = false,
        onWebInteractionDelegateBuilder: WebInteractionDelegateBuilder.(Web.WebInteraction<*>) -> Unit
    ) {
        webInteractionDelegateFactory = { webInteraction ->
            val webInteractionDelegateBuilder = WebInteractionDelegateBuilder(
                webInteractionForBuilder = webInteraction,
                parentWebInteractionDelegate =
                    if (override) parentConfig?.webInteractionDelegateFactory?.invoke(webInteraction)
                    else null
            )
            onWebInteractionDelegateBuilder.invoke(webInteractionDelegateBuilder, webInteraction)
            webInteractionDelegateBuilder.webInteractionDelegate
        }
    }

    fun getConfigurator(): ConfigModel {
        return ConfigModel(
            parentConfig,
            viewInteractionDelegateFactory,
            dataInteractionDelegateFactory,
            webInteractionDelegateFactory
        )
    }

}