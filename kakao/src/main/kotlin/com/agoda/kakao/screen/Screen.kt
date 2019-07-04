@file:Suppress("unused")

package com.agoda.kakao.screen

import android.support.test.espresso.Espresso
import android.support.test.espresso.UiController
import android.support.test.espresso.ViewAction
import android.support.test.espresso.matcher.ViewMatchers
import android.view.View
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.configurator.ConfiguratorBuilder
import com.agoda.kakao.configurator.KakaoConfigurator
import com.agoda.kakao.delegates.ViewInteractionDelegate
import com.agoda.kakao.delegates.factory.InteractionDelegatesFactory

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
    override val view: ViewInteractionDelegate = InteractionDelegatesFactory().createViewInteractionDelegate(
            Espresso.onView(ViewMatchers.isRoot())
    )

    private var configuratorBuilderAction: (ConfiguratorBuilder.() -> Unit)? = null

    operator fun invoke(function: T.() -> Unit) {
        configuratorBuilderAction?.let {
            val configuratorBuilder = ConfiguratorBuilder.createWithHistory(KakaoConfigurator.configurator)
            configuratorBuilderAction?.invoke(configuratorBuilder)
            KakaoConfigurator.configureWithHistory(
                configuratorBuilder.getConfigurator()
            )
            function.invoke(this as T)
            KakaoConfigurator.revertParentConfigurator()
            return
        }
        function.invoke(this as T)
    }

    fun configure(configuratorBuilderAction: ConfiguratorBuilder.() -> Unit) {
        this.configuratorBuilderAction = configuratorBuilderAction
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

        inline fun <reified T : Screen<T>> onScreen(function: T.() -> Unit): T =
                T::class.java.newInstance().apply { function.invoke(this) }
    }

}