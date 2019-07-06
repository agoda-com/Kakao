package com.agoda.kakao.configurator

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.web.sugar.Web
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.WebInteractionDelegate

class Configurator private constructor(
    val parentConfig: Configurator?,
    val viewInteractionDelegateSource: ((ViewInteraction) -> ViewInteractionDelegate),
    val dataInteractionDelegateSource: ((DataInteraction) -> DataInteractionDelegate),
    val webInteractionDelegateSource: ((Web.WebInteraction<*>) -> WebInteractionDelegate)
) {

    class Builder(
        private var history: Configurator? = null
    ) {

        private lateinit var viewInteractionDelegateSource: ((ViewInteraction) -> ViewInteractionDelegate)
        private lateinit var dataInteractionDelegateSource: ((DataInteraction) -> DataInteractionDelegate)
        private lateinit var webInteractionDelegateSource: ((Web.WebInteraction<*>) -> WebInteractionDelegate)

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
            viewInteractionDelegateSource = { viewInteraction ->
                val viewInteractionDelegateBuilder = ViewInteractionDelegateBuilder(
                    viewInteractionForBuilder = viewInteraction,
                    parentViewInteractionDelegate =
                    if (doOverride) history?.viewInteractionDelegateSource?.invoke(viewInteraction)
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
            dataInteractionDelegateSource = { dataInteraction ->
                val dataInteractionDelegateBuilder = DataInteractionDelegateBuilder(
                    dataInteractionForBuilder = dataInteraction,
                    parentDataInteractionDelegate =
                    if (doOverride) history?.dataInteractionDelegateSource?.invoke(dataInteraction)
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
            webInteractionDelegateSource = { webInteraction ->
                val webInteractionDelegateBuilder = WebInteractionDelegateBuilder(
                    webInteractionForBuilder = webInteraction,
                    parentWebInteractionDelegate =
                    if (doOverride) history?.webInteractionDelegateSource?.invoke(webInteraction)
                    else null
                )
                onWebInteractionDelegateBuilder.invoke(webInteractionDelegateBuilder, webInteraction)
                webInteractionDelegateBuilder.webInteractionDelegate
            }
        }

        fun build(): Configurator =
            Configurator(
                history,
                viewInteractionDelegateSource,
                dataInteractionDelegateSource,
                webInteractionDelegateSource
            )

    }

}