@file:Suppress("unused")

package com.agoda.kakao.common.views

import android.support.test.espresso.Root
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.RootMatchers
import android.view.View
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.common.actions.BaseActions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.configurator.Configurator
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.factory.InteractionDelegatesFactory
import org.hamcrest.Matcher
import org.hamcrest.Matchers

/**
 * Base class for all Kakao views
 *
 * This base class allows create new custom view with ease. All you
 * have to do is to extend this class, implement all necessarily additional
 * actions/assertions interfaces and override necessary constructors
 *
 * @param T Type of your custom view. Needs to be defined to enable invoke() and perform() for descendants
 */
@Suppress("UNCHECKED_CAST")
@KakaoDslMarker
open class KBaseView<out T> : BaseActions, BaseAssertions {
    override var view: ViewInteractionDelegate
    override var root: Matcher<Root> = RootMatchers.DEFAULT

    /**
     * Constructs view class with view interaction from given ViewBuilder
     *
     * @param function ViewBuilder which will result in view's interaction
     *
     * @see ViewBuilder
     */
    constructor(function: ViewBuilder.() -> Unit) {
        view = ViewBuilder().apply(function).getViewInteractionDelegate()
    }

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent Matcher that will be used as parent in isDescendantOfA() matcher
     * @param function ViewBuilder which will result in view's interaction
     *
     * @see ViewBuilder
     */
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : this({
        isDescendantOfA { withMatcher(parent) }
        function(this)
    })

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent DataInteractionDelegate that will be used as parent to ViewBuilder
     * @param function ViewBuilder which will result in view's interaction
     *
     * @see ViewBuilder
     */
    constructor(parent: DataInteractionDelegate, function: ViewBuilder.() -> Unit) {
        view = parent.onChildView(ViewBuilder().apply(function).getViewMatcher())
                .check(ViewAssertions.matches(Matchers.anything()))
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: T.() -> Unit) {
        function(this as T)
    }

    fun configure(configuratorBuilderAction: Configurator.Builder.() -> Unit) {
        val configuratorBuilder = Configurator.Builder(history = KakaoConfigurator.configurator)
        configuratorBuilderAction.invoke(configuratorBuilder)
        view = configuratorBuilder.build().viewInteractionDelegateFactory
            .invoke(view.viewInteraction)
    }

    fun resetCustomConfigurator() {
        view = InteractionDelegatesFactory().createViewInteractionDelegate(view.viewInteraction)
    }

    /**
     * Infix function for invoking lambda on your view
     *
     * Sometimes instance of view is a result of a function or constructor.
     * In this specific case you can't call invoke() since it will be considered as
     * tail lambda of your fun/constructor. In such cases please use this function.
     *
     * @param function Tail lambda with receiver which is your view
     * @return This object
     */
    infix fun perform(function: T.() -> Unit): T {
        function(this as T)
        return this
    }
}