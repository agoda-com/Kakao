@file:Suppress("unused")

package com.agoda.kakao.screen

import android.view.View
import androidx.test.espresso.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.web.assertion.WebAssertion
import androidx.test.espresso.web.model.Atom
import androidx.test.espresso.web.sugar.Web
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.delegate.ViewInteractionDelegate
import com.agoda.kakao.intercept.Interceptor
import java.util.*

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
@KakaoDslMarker
open class Screen<out T: Screen<T>>: ScreenActions {
    private var vi: Interceptor<ViewInteraction, ViewAssertion, ViewAction>? = null
    private var di: Interceptor<DataInteraction, ViewAssertion, ViewAction>? = null
    private var wi: Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>? = null

    override val view: ViewInteractionDelegate = ViewInteractionDelegate(Espresso.onView(ViewMatchers.isRoot()))

    private var isPushed = false

    /**
     * The visibility of rootView will be checked when entering the screen
     * @rootView.isVisible() Will be called after land onScreen<>() and after invoking screen directly.
     */
    open var rootView: KBaseView<*>? = null

    /**
     * Sets the interceptors for the screen.
     * Interceptors will be invoked on all interactions while the screen is active.
     *
     * The screen is considered `active` when it is invoked in one of the following ways:
     * ```
     * val screen = SomeScreen()
     *
     * screen { // Active
     *     view { click() }
     *     ...
     * } // Inactive
     *
     * // OR
     *
     * onScreen<SomeScreen>() { // Active
     *     view { click() }
     *     ...
     * } // Inactive
     * ```
     *
     * If you use nesting, interceptors of the latest screen that became active will be invoked.
     * All active screen's interceptors are being stored in a stack, so that you won't.
     *
     * @param configurator Configuration of the interceptors
     *
     * @see Interceptor
     */
    fun intercept(configurator: Interceptor.Configurator.() -> Unit) {
        var push = false

        if (isPushed) {
            push = true
            pop()
        }

        Interceptor.Configurator().apply(configurator).configure().also {
            vi = it.first
            di = it.second
            wi = it.third
        }

        if (push) push()
    }

    /**
     * Removes the interceptors from the screen.
     *
     * @see intercept
     * @see Interceptor
     */
    fun reset() {
        if (isPushed) pop()
        vi = null
        di = null
        wi = null
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your screen
     */
    operator fun invoke(function: T.() -> Unit) {
        if (!isPushed) push()
        rootView?.isVisible()
        function.invoke(this as T)
        if (isPushed) pop()
    }

    private fun push() {
        vi?.let { if (vis.isEmpty() || vis.peek() != it) vis.push(it) }
        di?.let { if (dis.isEmpty() || dis.peek() != it) dis.push(it) }
        wi?.let { if (wis.isEmpty() || wis.peek() != it) wis.push(it) }
        isPushed = true
    }

    private fun pop() {
        vi?.let { if (vis.isNotEmpty() && vis.peek() == it) vis.pop() }
        di?.let { if (dis.isNotEmpty() && dis.peek() == it) dis.pop() }
        wi?.let { if (wis.isNotEmpty() && wis.peek() == it) wis.pop() }
        isPushed = false
    }

    companion object {
        /**
         * Idles for given amount of time
         *
         * @param duration Time to idle in milliseconds (1 second by default)
         */
        fun idle(duration: Long = 1000L) {
            Espresso.onView(ViewMatchers.isRoot()).perform(object : ViewAction {
                override fun getDescription() = "Idle for $duration milliseconds"

                override fun getConstraints() = ViewMatchers.isAssignableFrom(View::class.java)

                override fun perform(uiController: UiController?, view: View?) {
                    uiController?.loopMainThreadForAtLeast(duration)
                }
            })
        }

        /**
         * Initializes instance of the screen class provided and invokes given tail lambda on it.
         *
         * This approach helps to reduce boilerplate code and avoid have a screen instance stored in
         * a properties of you tests classes.
         *
         * In order to use this function, your [Screen] class must have an empty primary constructor.
         *
         * @param function Tail lambda to be invoked on the created instance of screen.
         */
        inline fun <reified T : Screen<T>> onScreen(noinline function: T.() -> Unit): T {
            return T::class.java
                    .newInstance()
                    .apply { this(function) }
        }

        internal val vis: Stack<Interceptor<ViewInteraction, ViewAssertion, ViewAction>?> = Stack()
        internal val dis: Stack<Interceptor<DataInteraction, ViewAssertion, ViewAction>?> = Stack()
        internal val wis: Stack<Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>?> = Stack()
    }
}
