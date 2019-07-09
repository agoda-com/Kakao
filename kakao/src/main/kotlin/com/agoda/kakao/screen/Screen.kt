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
open class Screen<out T : Screen<T>> : ScreenActions {
    private var viewInterceptor: Interceptor<ViewInteraction, ViewAssertion, ViewAction>? = null
    private var dataInterceptor: Interceptor<DataInteraction, ViewAssertion, ViewAction>? = null
    private var webInterceptor: Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>? = null

    override val view: ViewInteractionDelegate = ViewInteractionDelegate(Espresso.onView(ViewMatchers.isRoot()))

    private var isActive = false

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
     * If you use nesting screens, all interceptors of the screens that became active will be invoked
     * in LIFO order (using Deque).
     *
     * @param configurator Configuration of the interceptors
     *
     * @see Interceptor
     */
    fun intercept(configurator: Interceptor.Configurator.() -> Unit) {
        if (isActive) {
            deactivate(true)
        }

        Interceptor.Configurator().apply(configurator).configure().also { (viewInterceptor, dataInterceptor, webInterceptor) ->
            this.viewInterceptor = viewInterceptor
            this.dataInterceptor = dataInterceptor
            this.webInterceptor = webInterceptor
        }

        if (isActive) {
            activate()
        }
    }

    /**
     * Removes the interceptors from the screen.
     *
     * @see intercept
     * @see Interceptor
     */
    fun reset() {
        if (isActive) {
            deactivate(true)
        }

        viewInterceptor = null
        dataInterceptor = null
        webInterceptor = null
    }

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your screen
     */
    operator fun invoke(function: T.() -> Unit) {
        activate()
        rootView?.isVisible()
        function.invoke(this as T)
        deactivate()
    }

    private fun activate() {
        viewInterceptor?.let { viewInterceptors.offerFirst(it) }
        dataInterceptor?.let { dataInterceptors.offerFirst(it) }
        webInterceptor?.let { webInterceptors.offerFirst(it) }

        isActive = true
    }

    private fun deactivate(isReset: Boolean = false) {
        viewInterceptor?.let { viewInterceptors.removeFirstOccurrence(it) }
        dataInterceptor?.let { dataInterceptors.removeFirstOccurrence(it) }
        webInterceptor?.let { webInterceptors.removeFirstOccurrence(it) }

        if (!isReset) {
            isActive = false
        }
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

        internal val viewInterceptors: Deque<Interceptor<ViewInteraction, ViewAssertion, ViewAction>> = LinkedList()
        internal val dataInterceptors: Deque<Interceptor<DataInteraction, ViewAssertion, ViewAction>> = LinkedList()
        internal val webInterceptors: Deque<Interceptor<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>> = LinkedList()
    }
}
