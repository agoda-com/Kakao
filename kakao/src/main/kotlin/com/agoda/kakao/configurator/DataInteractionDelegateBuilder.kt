package com.agoda.kakao.configurator

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.ViewInteraction
import android.view.View
import com.agoda.kakao.delegates.DataInteractionDelegate
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.factory.InteractionDelegatesFactory
import org.hamcrest.Matcher

class DataInteractionDelegateBuilder(
    private val dataInteractionForBuilder: DataInteraction,
    private val parentDataInteractionDelegate: DataInteractionDelegate?
) {

    internal val dataInteractionDelegate = object : DataInteractionDelegate {
        override val dataInteraction: DataInteraction
            get() = dataInteractionForBuilder

        override fun onChildView(childMatcher: Matcher<View>): DataInteractionDelegate {
            onChildView?.invoke(childMatcher)
                ?: parentDataInteractionDelegate?.onChildView(childMatcher)
                ?: dataInteraction.onChildView(childMatcher)
            return this
        }

        override fun check(viewAssertion: ViewAssertion): ViewInteractionDelegate {
            return InteractionDelegatesFactory().createViewInteractionDelegate(
                check?.invoke(viewAssertion)
                    ?: parentDataInteractionDelegate?.check(viewAssertion)?.viewInteraction
                    ?: dataInteraction.check(viewAssertion)
            )
        }

    }

    private var onChildView: ((Matcher<View>) -> Unit)? = null
    private var check: ((ViewAssertion) -> ViewInteraction)? = null

    fun onOnChildView(onChildView: (childMatcher: Matcher<View>) -> Unit) {
        this.onChildView = onChildView
    }

    fun onCheck(check: (viewAssertion: ViewAssertion) -> ViewInteraction) {
        this.check = check
    }

}