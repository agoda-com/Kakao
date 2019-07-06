package com.agoda.kakao.configurator

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.WebInteractionDelegate

class Configurator private constructor(
    val parentConfig: Configurator?,
    val viewInteractionDelegateFactory: ((ViewInteraction) -> ViewInteractionDelegate),
    val dataInteractionDelegateFactory: ((DataInteraction) -> DataInteractionDelegate),
    val webInteractionDelegateFactory: ((Web.WebInteraction<*>) -> WebInteractionDelegate)
) {

    class Builder(
        private var history: Configurator? = null
    ) {

        private lateinit var viewInteractionDelegateFactory: ((ViewInteraction) -> ViewInteractionDelegate)
        private lateinit var dataInteractionDelegateFactory: ((DataInteraction) -> DataInteractionDelegate)
        private lateinit var webInteractionDelegateFactory: ((Web.WebInteraction<*>) -> WebInteractionDelegate)

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
        operator fun invoke(function: Configurator.Builder.() -> Unit) {
            function(this)
        }

        fun onViewInteraction(
            doOverride: Boolean = false,
            onViewInteractionDelegateBuilder: ViewInteractionDelegateBuilder.(ViewInteraction) -> Unit
        ) {
            viewInteractionDelegateFactory = { viewInteraction ->
                val viewInteractionDelegateBuilder = ViewInteractionDelegateBuilder(
                    viewInteractionForBuilder = viewInteraction,
                    parentViewInteractionDelegate =
                    if (doOverride) history?.viewInteractionDelegateFactory?.invoke(viewInteraction)
                    else null
                )
                onViewInteractionDelegateBuilder.invoke(viewInteractionDelegateBuilder, viewInteraction)
                viewInteractionDelegateBuilder.viewInteractionDelegate
            }
        }

        fun onDataInteraction(
            doOverride: Boolean = false,
            onDataInteractionDelegateBuilder: DataInteractionDelegateBuilder.(DataInteraction) -> Unit
        ) {
            dataInteractionDelegateFactory = { dataInteraction ->
                val dataInteractionDelegateBuilder = DataInteractionDelegateBuilder(
                    dataInteractionForBuilder = dataInteraction,
                    parentDataInteractionDelegate =
                    if (doOverride) history?.dataInteractionDelegateFactory?.invoke(dataInteraction)
                    else null
                )
                onDataInteractionDelegateBuilder.invoke(dataInteractionDelegateBuilder, dataInteraction)
                dataInteractionDelegateBuilder.dataInteractionDelegate
            }
        }

        fun onWebInteraction(
            doOverride: Boolean = false,
            onWebInteractionDelegateBuilder: WebInteractionDelegateBuilder.(Web.WebInteraction<*>) -> Unit
        ) {
            webInteractionDelegateFactory = { webInteraction ->
                val webInteractionDelegateBuilder = WebInteractionDelegateBuilder(
                    webInteractionForBuilder = webInteraction,
                    parentWebInteractionDelegate =
                    if (doOverride) history?.webInteractionDelegateFactory?.invoke(webInteraction)
                    else null
                )
                onWebInteractionDelegateBuilder.invoke(webInteractionDelegateBuilder, webInteraction)
                webInteractionDelegateBuilder.webInteractionDelegate
            }
        }

        fun build(): Configurator =
            Configurator(
                history,
                viewInteractionDelegateFactory,
                dataInteractionDelegateFactory,
                webInteractionDelegateFactory
            )

    }

}