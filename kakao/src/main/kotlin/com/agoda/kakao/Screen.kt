package com.agoda.kakao

import android.support.test.espresso.Espresso
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.matcher.ViewMatchers

/**
 * Container class for UI elements.
 *
 * This class groups UI elements and grants access to basic actions,
 * such as tapBack() and closeSoftKeyboard()
 *
 * @param T type of your screen, done to enable invoke() for its children
 *
 * @see ScreenActions
 */
@Suppress("UNCHECKED_CAST")
@ScreenMarker
open class Screen<out T: Screen<T>>: ScreenActions {
    override val view: ViewInteraction = Espresso.onView(ViewMatchers.isRoot())
    operator fun invoke(function: T.() -> Unit) = function.invoke(this as T)
}