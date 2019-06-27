package com.agoda.kakao.core

import android.view.View
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.Root
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import org.hamcrest.Matcher

interface ViewInteractionDelegate {
    fun perform(vararg viewActions: ViewAction)
    fun withFailureHandler(function: (error: Throwable, matcher: Matcher<View>) -> Unit)
    fun check(viewAssertion: ViewAssertion)
    fun check(function: (view: View, noViewFoundException: NoMatchingViewException) -> Unit)
    fun inRoot(matcher: Matcher<Root>)
}
