package com.agoda.kakao.delegate

import android.view.View
import androidx.test.espresso.*
import androidx.test.espresso.action.AdapterViewProtocol
import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.Kakao
import com.agoda.kakao.intercept.Interceptor
import com.agoda.kakao.screen.Screen
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.jetbrains.annotations.Contract

/**
 * Delegation class for [DataInteraction].
 * Wraps all available public calls and intercepts [check] and [perform].
 *
 * @see Delegate
 * @see Interceptor
 */
class DataInteractionDelegate(override var interaction: DataInteraction) : Delegate<DataInteraction, ViewAssertion, ViewAction> {
    override var interceptor: Interceptor<DataInteraction, ViewAssertion, ViewAction>? = null

    @Contract("_->this")
    fun atPosition(atPosition: Int) = this.also {
        interaction.atPosition(atPosition)
    }

    fun check(viewAssert: ViewAssertion): ViewInteractionDelegate {
        return ViewInteractionDelegate(
                if (!interceptCheck(viewAssert)) {
                    interaction.check(viewAssert)
                } else {
                    interaction.check(ViewAssertions.matches(Matchers.anything()))
                }
        )
    }

    @Contract("_->this")
    fun inAdapterView(adapterMatcher: Matcher<View>) = this.also {
        interaction.inAdapterView(adapterMatcher)
    }

    @Contract("_->this")
    fun inRoot(rootMatcher: Matcher<Root>) = this.also {
        interaction.inRoot(rootMatcher)
    }

    @Contract("_->this")
    fun onChildView(childMatcher: Matcher<View>) = this.also {
        interaction.onChildView(childMatcher)
    }

    fun perform(vararg viewActions: ViewAction): ViewInteractionDelegate {
        return ViewInteractionDelegate(
                if (viewActions.none { interceptPerform(it) }) {
                    interaction.perform(*viewActions)
                } else {
                    interaction.check(ViewAssertions.matches(Matchers.anything()))
                }
        )
    }

    @Contract("_->this")
    fun usingAdapterViewProtocol(adapterViewProtocol: AdapterViewProtocol) = this.also {
        interaction.usingAdapterViewProtocol(adapterViewProtocol)
    }

    override fun screenInterceptor() = Screen.dis.takeIf { it.isNotEmpty() }?.peek()
    override fun kakaoInterceptor() = Kakao.dataInteraction
}
