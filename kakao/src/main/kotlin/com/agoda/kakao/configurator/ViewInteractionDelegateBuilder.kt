package com.agoda.kakao.configurator

import android.support.test.espresso.*
import android.view.View
import com.agoda.kakao.delegates.ViewInteractionDelegate
import org.hamcrest.Matcher

class ViewInteractionDelegateBuilder(
    private val viewInteractionForBuilder: ViewInteraction,
    private val parentViewInteractionDelegate: ViewInteractionDelegate?
) {

    internal val viewInteractionDelegate = object : ViewInteractionDelegate {
        override val viewInteraction: ViewInteraction
            get() = viewInteractionForBuilder

        override fun perform(viewAction: ViewAction): ViewInteractionDelegate {
            perform?.invoke(viewAction)
                ?: parentViewInteractionDelegate?.perform(viewAction)
                ?: viewInteraction.perform(viewAction)
            return this
        }

        override fun check(viewAssertion: ViewAssertion): ViewInteractionDelegate {
            check?.invoke(viewAssertion)
                ?: parentViewInteractionDelegate?.check(viewAssertion)
                ?: viewInteraction.check(viewAssertion)
            return this
        }

        override fun check(function: (View, NoMatchingViewException?) -> Unit): ViewInteractionDelegate {
            checkByFunction?.invoke(function)
                ?: parentViewInteractionDelegate?.check(function)
                ?: viewInteraction.check(function)
            return this
        }

        override fun withFailureHandler(function: (Throwable, Matcher<View>) -> Unit): ViewInteractionDelegate {
            withFailureHandler?.invoke(function)
                ?: parentViewInteractionDelegate?.withFailureHandler(function)
                ?: viewInteraction.withFailureHandler(function)
            return this
        }

        override fun inRoot(rootMatcher: Matcher<Root>): ViewInteractionDelegate {
            inRoot?.invoke(rootMatcher)
                ?: parentViewInteractionDelegate?.inRoot(rootMatcher)
                ?: viewInteraction.inRoot(rootMatcher)
            return this
        }
    }

    private var perform: ((ViewAction) -> Unit)? = null
    private var check: ((ViewAssertion) -> Unit)? = null
    private var checkByFunction: (((View, NoMatchingViewException?) -> Unit) -> Unit)? = null
    private var withFailureHandler: (((Throwable, Matcher<View>) -> Unit) -> Unit)? = null
    private var inRoot: ((Matcher<Root>) -> Unit)? = null

    fun onPerform(perform: (ViewAction) -> Unit) {
        this.perform = perform
    }

    fun onCheck(check: (ViewAssertion) -> Unit) {
        this.check = check
    }

    fun onCheckByFunction(function: ((View, NoMatchingViewException?) -> Unit) -> Unit) {
        checkByFunction = function
    }

    fun onWithFailureHandler(function: ((Throwable, Matcher<View>) -> Unit) -> Unit) {
        withFailureHandler = function
    }

    fun onInRoot(inRoot: (Matcher<Root>) -> Unit) {
        this.inRoot = inRoot
    }

}