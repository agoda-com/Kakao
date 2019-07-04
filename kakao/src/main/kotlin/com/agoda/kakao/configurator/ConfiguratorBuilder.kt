package com.agoda.kakao.configurator

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.WebInteractionDelegate

class ConfiguratorBuilder {

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
            val viewInteractionDelegateBuilder = ViewInteractionDelegateBuilder(viewInteraction, override)
            onViewInteractionDelegateBuilder.invoke(viewInteractionDelegateBuilder, viewInteraction)
            viewInteractionDelegateBuilder.viewInteractionDelegate
        }
    }

    fun onDataInteraction(
            override: Boolean = false,
            onDataInteractionDelegateBuilder: DataInteractionDelegateBuilder.(DataInteraction) -> Unit
    ) {
        dataInteractionDelegateFactory = { dataInteraction ->
            val dataInteractionDelegateBuilder = DataInteractionDelegateBuilder(dataInteraction, override)
            onDataInteractionDelegateBuilder.invoke(dataInteractionDelegateBuilder, dataInteraction)
            dataInteractionDelegateBuilder.dataInteractionDelegate
        }
    }

    fun onWebInteraction(
            override: Boolean = false,
            onWebInteractionDelegateBuilder: WebInteractionDelegateBuilder.(Web.WebInteraction<*>) -> Unit
    ) {
        webInteractionDelegateFactory = { webInteraction ->
            val webInteractionDelegateBuilder = WebInteractionDelegateBuilder(webInteraction, override)
            onWebInteractionDelegateBuilder.invoke(webInteractionDelegateBuilder, webInteraction)
            webInteractionDelegateBuilder.webInteractionDelegate
        }
    }

    fun getConfigurator(): ConfiguratorModel {
        return ConfiguratorModel(
                viewInteractionDelegateFactory,
                dataInteractionDelegateFactory,
                webInteractionDelegateFactory
        )
    }

}