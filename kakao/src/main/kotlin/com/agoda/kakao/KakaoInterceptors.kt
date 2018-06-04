package com.agoda.kakao

import android.support.test.espresso.*
import android.view.View

interface ViewInteractionPerformInterceptor {
    fun perform(viewInteraction: ViewInteraction, vararg viewActions: ViewAction): ViewInteraction
}

interface DataInteractionPerformInterceptor {
    fun perform(dataInteraction: DataInteraction, vararg viewActions: ViewAction): ViewInteraction
}

interface ViewInteractionCheckInterceptor {
    fun check(viewInteraction: ViewInteraction, viewAssert: ViewAssertion): ViewInteraction
}

interface DataInteractionCheckInterceptor {
    fun check(dataInteraction: DataInteraction, viewAssert: ViewAssertion): ViewInteraction
}

object KakaoInterceptors {
    @Volatile
    internal var viewInteractionPerformInterceptor: ViewInteractionPerformInterceptor? = null
    @Volatile
    internal var viewInteractionCheckInterceptor: ViewInteractionCheckInterceptor? = null
    @Volatile
    internal var dataInteractionPerformInterceptor: DataInteractionPerformInterceptor? = null
    @Volatile
    internal var dataInteractionCheckInterceptor: DataInteractionCheckInterceptor? = null

    fun setViewInteractionPerformInterceptor(performInterceptor: ViewInteractionPerformInterceptor?) {
        viewInteractionPerformInterceptor = performInterceptor
    }

    fun setViewInteractionCheckInterceptor(checkInterceptor: ViewInteractionCheckInterceptor?) {
        viewInteractionCheckInterceptor = checkInterceptor
    }

    fun setDataInteractionPerformInterceptor(performInterceptor: DataInteractionPerformInterceptor?) {
        dataInteractionPerformInterceptor = performInterceptor
    }

    fun setDataInteractionCheckInterceptor(checkInterceptor: DataInteractionCheckInterceptor?) {
        dataInteractionCheckInterceptor = checkInterceptor
    }

    fun reset() {
        viewInteractionPerformInterceptor = null
        viewInteractionCheckInterceptor = null
        dataInteractionCheckInterceptor = null
        dataInteractionPerformInterceptor = null
    }
}

fun ViewInteraction.wrappedPerform(vararg viewActions: ViewAction): ViewInteraction {
    return KakaoInterceptors.viewInteractionPerformInterceptor?.perform(this, *viewActions) ?: perform(*viewActions)
}

inline fun ViewInteraction.wrappedCheck(crossinline viewAssert: (View, NoMatchingViewException?) -> Unit) {
    wrappedCheck(ViewAssertion { view, noViewFoundException -> viewAssert(view, noViewFoundException) })
}

fun ViewInteraction.wrappedCheck(viewAssert: ViewAssertion): ViewInteraction {
    return KakaoInterceptors.viewInteractionCheckInterceptor?.check(this, viewAssert) ?: check(viewAssert)
}

fun DataInteraction.wrappedPerform(vararg viewActions: ViewAction): ViewInteraction {
    return KakaoInterceptors.dataInteractionPerformInterceptor?.perform(this, *viewActions) ?: perform(*viewActions)
}

inline fun DataInteraction.wrappedCheck(crossinline viewAssert: (View, NoMatchingViewException?) -> Unit) {
    wrappedCheck(ViewAssertion { view, noViewFoundException -> viewAssert(view, noViewFoundException) })
}

fun DataInteraction.wrappedCheck(viewAssert: ViewAssertion): ViewInteraction {
    return KakaoInterceptors.dataInteractionCheckInterceptor?.check(this, viewAssert) ?: check(viewAssert)
}

