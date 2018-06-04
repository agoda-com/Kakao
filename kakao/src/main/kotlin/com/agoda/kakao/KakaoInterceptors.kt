package com.agoda.kakao

import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewAction
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.ViewInteraction

/**
 * Interface for intercepting `perform` call on `ViewInteraction`
 * @return `true` if call was intercepted by this interceptor, `false` otherwise.
 */
interface ViewInteractionPerformInterceptor {
    fun perform(interaction: ViewInteraction, action: ViewAction): Boolean
}

/**
 * Interface for intercepting `check` call on `ViewInteraction`
 * @return `true` if call was intercepted by this interceptor, `false` otherwise.
 */
interface ViewInteractionCheckInterceptor {
    fun check(interaction: ViewInteraction, assertion: ViewAssertion): Boolean
}

/**
 * Interface for intercepting `perform` call on `DataInteraction`
 * @return `ViewInteraction` returned by `DataInteraction.perform`
 */
interface DataInteractionPerformInterceptor {
    fun perform(interaction: DataInteraction, action: ViewAction): ViewInteraction
}

/**
 * Interface for intercepting `check` call on `DataInteraction`
 * @return `ViewInteraction` returned by `DataInteraction.check`
 */
interface DataInteractionCheckInterceptor {
    fun check(interaction: DataInteraction, assertion: ViewAssertion): ViewInteraction
}

/**
 * Global interceptors registry
 */
object KakaoInterceptors {
    internal val viewInteractionInterceptor = BaseViewInteractionInterceptor()
    internal val dataInteractionInterceptor = BaseDataInteractionInterceptor()

    /**
     * Sets global `ViewInteractionPerformInterceptor`
     */
    fun setViewInteractionPerformInterceptor(interceptor: ViewInteractionPerformInterceptor?) {
        viewInteractionInterceptor.performInterceptor = interceptor
    }

    /**
     * Sets global `ViewInteractionCheckInterceptor`
     */
    fun setViewInteractionCheckInterceptor(interceptor: ViewInteractionCheckInterceptor?) {
        viewInteractionInterceptor.checkInterceptor = interceptor
    }

    /**
     * Sets global `DataInteractionPerformInterceptor`
     */
    fun setDataInteractionPerformInterceptor(interceptor: DataInteractionPerformInterceptor?) {
        dataInteractionInterceptor.performInterceptor = interceptor
    }

    /**
     * Sets global `DataInteractionCheckInterceptor`
     */
    fun setDataInteractionCheckInterceptor(interceptor: DataInteractionCheckInterceptor?) {
        dataInteractionInterceptor.checkInterceptor = interceptor
    }

    /**
     * Clears all global interceptors
     */
    fun reset() {
        viewInteractionInterceptor.reset()
        dataInteractionInterceptor.reset()
    }
}

interface ViewInteractionInterceptor {
    fun onPerform(action: (ViewInteraction, ViewAction) -> Boolean)
    fun onCheck(action: (ViewInteraction, ViewAssertion) -> Boolean)
    fun reset()
}

interface DataInteractionInterceptor {
    fun onPerform(action: (DataInteraction, ViewAction) -> ViewInteraction)
    fun onCheck(action: (DataInteraction, ViewAssertion) -> ViewInteraction)
    fun reset()
}

internal interface MutableViewInteractionInterceptor : ViewInteractionInterceptor {
    var performInterceptor: ViewInteractionPerformInterceptor?
    var checkInterceptor: ViewInteractionCheckInterceptor?
}

internal class BaseViewInteractionInterceptor : MutableViewInteractionInterceptor {
    override var performInterceptor: ViewInteractionPerformInterceptor? = null
    override var checkInterceptor: ViewInteractionCheckInterceptor? = null

    override fun onPerform(action: (ViewInteraction, ViewAction) -> Boolean) {
        performInterceptor = object : ViewInteractionPerformInterceptor {
            override fun perform(interaction: ViewInteraction, action: ViewAction): Boolean {
                return action(interaction, action)
            }
        }
    }

    override fun onCheck(action: (ViewInteraction, ViewAssertion) -> Boolean) {
        checkInterceptor = object : ViewInteractionCheckInterceptor {
            override fun check(interaction: ViewInteraction, assertion: ViewAssertion): Boolean {
                return action(interaction, assertion)
            }
        }
    }

    override fun reset() {
        performInterceptor = null
        checkInterceptor = null
    }
}

internal interface MutableDataInteractionInterceptor : DataInteractionInterceptor {
    var performInterceptor: DataInteractionPerformInterceptor?
    var checkInterceptor: DataInteractionCheckInterceptor?
}

internal class BaseDataInteractionInterceptor : MutableDataInteractionInterceptor {
    override var performInterceptor: DataInteractionPerformInterceptor? = null
    override var checkInterceptor: DataInteractionCheckInterceptor? = null

    override fun onPerform(action: (interaction: DataInteraction, action: ViewAction) -> ViewInteraction) {
        performInterceptor = object : DataInteractionPerformInterceptor {
            override fun perform(interaction: DataInteraction, action: ViewAction): ViewInteraction {
                return action(interaction, action)
            }
        }
    }

    override fun onCheck(action: (DataInteraction, ViewAssertion) -> ViewInteraction) {
        checkInterceptor = object : DataInteractionCheckInterceptor {
            override fun check(interaction: DataInteraction, assertion: ViewAssertion): ViewInteraction {
                return action(interaction, assertion)
            }
        }
    }

    override fun reset() {
        performInterceptor = null
        checkInterceptor = null
    }
}
