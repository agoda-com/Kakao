package com.agoda.kakao

import android.support.test.espresso.*
import android.support.test.espresso.action.AdapterViewProtocol
import android.view.View
import com.agoda.kakao.KakaoInterceptors.dataInteractionInterceptor
import org.hamcrest.Matcher

interface DataInteractionWrapper {
    fun atPosition(atPosition: Int): DataInteractionWrapper
    fun check(viewAssertion: ViewAssertion): ViewInteractionWrapper
    fun inAdapterView(adapterMatcher: Matcher<View>): DataInteractionWrapper
    fun inRoot(rootMatcher: Matcher<Root>): DataInteractionWrapper
    fun onChildView(childMatcher: Matcher<View>): DataInteractionWrapper
    fun perform(viewAction: ViewAction): ViewInteractionWrapper
    fun usingAdapterViewProtocol(adapterViewProtocol: AdapterViewProtocol): DataInteractionWrapper
}

fun DataInteraction.wrap(): DataInteractionWrapper = InterceptingDataInteractionWrapper(this)

private class InterceptingDataInteractionWrapper(private val dataInteraction: DataInteraction) : DataInteractionWrapper, MutableDataInteractionInterceptor by BaseDataInteractionInterceptor() {
    override fun atPosition(atPosition: Int): DataInteractionWrapper {
        dataInteraction.atPosition(atPosition)
        return this
    }

    override fun inAdapterView(adapterMatcher: Matcher<View>): DataInteractionWrapper {
        dataInteraction.inAdapterView(adapterMatcher)
        return this
    }

    override fun onChildView(childMatcher: Matcher<View>): DataInteractionWrapper {
        dataInteraction.onChildView(childMatcher)
        return this
    }

    override fun usingAdapterViewProtocol(adapterViewProtocol: AdapterViewProtocol): DataInteractionWrapper {
        dataInteraction.usingAdapterViewProtocol(adapterViewProtocol)
        return this
    }

    override fun check(viewAssertion: ViewAssertion): ViewInteractionWrapper {
        val intercepted = checkInterceptor?.check(dataInteraction, viewAssertion) ?: dataInteractionInterceptor.checkInterceptor?.check(dataInteraction, viewAssertion)
        return (intercepted ?: dataInteraction.check(viewAssertion)).wrap()
    }

    override fun inRoot(rootMatcher: Matcher<Root>): DataInteractionWrapper {
        dataInteraction.inRoot(rootMatcher)
        return this
    }

    override fun perform(viewAction: ViewAction): ViewInteractionWrapper {
        val intercepted = performInterceptor?.perform(dataInteraction, viewAction) ?: dataInteractionInterceptor.performInterceptor?.perform(dataInteraction, viewAction)
        return (intercepted ?: dataInteraction.perform(viewAction)).wrap()
    }
}
