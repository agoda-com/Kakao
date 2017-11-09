package com.agoda.kakao

import android.net.Uri
import android.support.test.espresso.UiController
import android.support.test.espresso.ViewAction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.*
import android.support.test.espresso.contrib.DrawerActions
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.web.model.Atom
import android.support.test.espresso.web.model.ElementReference
import android.support.test.espresso.web.sugar.Web
import android.support.test.espresso.web.webdriver.DriverAtoms
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.InputDevice
import android.view.MotionEvent
import android.view.View
import android.widget.AdapterView
import android.widget.Checkable
import android.widget.RatingBar
import android.widget.ScrollView
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

/**
 * Interface with common actions for all screens
 *
 * Provides basic actions that can be performed on each and every screen
 *
 * @property view ViewInteraction on which all actions are performed (root view by default)
 */
interface ScreenActions {
    val view: ViewInteraction

    /**
     * Performs click on device's back button
     */
    fun pressBack() {
        view.perform(ViewActions.pressBack())
    }

    /**
     * Closes soft keyboard, if opened
     */
    fun closeSoftKeyboard() {
        view.perform(ViewActions.closeSoftKeyboard())
    }

    /**
     * Presses IME action, if supported view is in focus
     */
    fun pressImeAction() {
        view.perform(ViewActions.pressImeActionButton())
    }

    /**
     * Presses a key with corresponding KeyCode
     */
    fun pressKey(keyCode: Int) {
        view.perform(ViewActions.pressKey(keyCode))
    }

    /**
     * Presses a key with correspondingKeyCode and modifiers
     */
    fun pressKey(key: EspressoKey) {
        view.perform(ViewActions.pressKey(key))
    }

    /**
     * Presses the hardware menu key
     */
    fun pressMenuKey() {
        view.perform(ViewActions.pressMenuKey())
    }

    /**
     * Idles for given amount of time
     *
     * @param duration Time to idle in milliseconds (1 second by default)
     */
    fun idle(duration: Long = 1000L) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Idle for $duration milliseconds"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(View::class.java)

            override fun perform(uiController: UiController?, view: View?) {
                uiController?.loopMainThreadForAtLeast(duration)
            }
        })
    }
}

/**
 * Base interface for performing actions on view
 *
 * Provides a lot of basic action methods, such as click(), scrollTo(), etc.
 *
 * @see EditableActions
 * @see SwipeableActions
 * @see ScrollableActions
 * @see CheckableActions
 */
interface BaseActions {
    val view: ViewInteraction

    /**
     * Performs click on view
     *
     * @param location Location of view where it should be clicked (VISIBLE_CENTER by default)
     */
    fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER) {
        view.perform(GeneralClickAction(Tap.SINGLE, location, Press.FINGER,
                InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY))
    }

    /**
     * Performs double click on view
     *
     * @param location Location of view where it should be clicked (VISIBLE_CENTER by default)
     */
    fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER) {
        view.perform(GeneralClickAction(Tap.DOUBLE, location, Press.FINGER,
                InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY))
    }

    /**
     * Performs long click on view
     *
     * @param location Location of view where it should be clicked (VISIBLE_CENTER by default)
     */
    fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER) {
        view.perform(GeneralClickAction(Tap.LONG, location, Press.FINGER,
                InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY))
    }

    /**
     * Scrolls to the view, if possible
     */
    fun scrollTo() {
        view.perform(ViewActions.scrollTo())
    }

    /**
     * Performs custom action on a view
     *
     * @param function Lambda that must return ViewAction which will be performed
     */
    fun act(function: () -> ViewAction) {
        view.perform(function.invoke())
    }

    /**
     * Adds failure handler to the view
     *
     * @param function Lambda that handles this view's errors
     */
    fun onFailure(function: (error: Throwable, matcher: Matcher<View>) -> Unit) {
        view.withFailureHandler(function)
    }

    /**
     * Repeats given action on the view until this view will match the given matcher
     *
     * @param maxAttempts Maximum repeat count of the action
     * @param action Action to be performed
     * @param matcher ViewBuilder that will be used as matcher
     *
     * @see ViewActions.repeatedlyUntil
     */
    fun repeatUntil(maxAttempts: Int = 1, action: () -> ViewAction, matcher: ViewBuilder.() -> Unit) {
        view.perform(ViewActions.repeatedlyUntil(action(),
                ViewBuilder().apply(matcher).getViewMatcher(), maxAttempts))
    }
}

/**
 * Provides actions for TextViews
 */
interface TextViewActions : BaseActions {
    /**
     * @see ViewActions.openLinkWithText
     */
    fun openLinkWithText(text: String) {
        view.perform(ViewActions.openLinkWithText(text))
    }

    /**
     * @see ViewActions.openLinkWithText
     */
    fun openLinkWithText(text: Matcher<String>) {
        view.perform(ViewActions.openLinkWithText(text))
    }

    /**
     * @see ViewActions.openLinkWithUri
     */
    fun openLinkWithUri(uri: String) {
        view.perform(ViewActions.openLinkWithUri(uri))
    }

    /**
     * @see ViewActions.openLinkWithUri
     */
    fun openLinkWithUri(uri: Matcher<Uri>) {
        view.perform(ViewActions.openLinkWithUri(uri))
    }

    /**
     * @see ViewActions.openLink
     */
    fun openLink(text: Matcher<String>, uri: Matcher<Uri>) {
        view.perform(ViewActions.openLink(text, uri))
    }
}

/**
 * Provides editable actions for views
 */
interface EditableActions : BaseActions {
    /**
     * Types the given text into the view
     *
     * @param text Text to input
     */
    fun typeText(text: String) {
        view.perform(ViewActions.typeText(text))
    }

    /**
     * Replaces the current view text with given
     *
     * @param text Text to input instead of current
     */
    fun replaceText(text: String) {
        view.perform(ViewActions.replaceText(text))
    }

    /**
     * Clears current text in the view
     */
    fun clearText() {
        replaceText("")
    }
}

/**
 * Provides swipe actions for views
 */
interface SwipeableActions : BaseActions {
    /**
     * Swipes left on the view
     */
    fun swipeLeft() {
        view.perform(ViewActions.swipeLeft())
    }

    /**
     * Swipes right on the view
     */
    fun swipeRight() {
        view.perform(ViewActions.swipeRight())
    }

    /**
     * Swipes up on the view
     */
    fun swipeUp() {
        view.perform(ViewActions.swipeUp())
    }

    /**
     * Swipes down on the view
     */
    fun swipeDown() {
        view.perform(ViewActions.swipeDown())
    }
}

/**
 * Provides scrolling actions for view
 *
 * Important: does not hold any implementation
 *
 * @see RecyclerActions
 * @see ScrollViewActions
 */
interface ScrollableActions : BaseActions {
    /**
     * Scrolls to the starting position of the view
     */
    fun scrollToStart()

    /**
     * Scrolls to the last position of the view
     */
    fun scrollToEnd()

    /**
     * Scrolls to the specific position of the view
     *
     * @param position Scrolling destination
     */
    fun scrollTo(position: Int)
}

/**
 * Provides ScrollableActions implementation for RecyclerView
 *
 * @see ScrollableActions
 * @see RecyclerView
 */
interface RecyclerActions : ScrollableActions {
    override fun scrollToStart() {
        view.perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(0))
    }

    override fun scrollToEnd() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll RecyclerView to the bottom"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(RecyclerView::class.java)

            override fun perform(controller: UiController, view: View) {
                if (view is RecyclerView) {
                    val position = view.adapter.itemCount - 1
                    view.scrollToPosition(position)
                    controller.loopMainThreadUntilIdle()
                    val lastView = view.findViewHolderForLayoutPosition(position).itemView
                    view.scrollBy(0, lastView.height)
                    controller.loopMainThreadUntilIdle()
                }
            }
        })
    }

    override fun scrollTo(position: Int) {
        view.perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(position))
    }

    /**
     * Scrolls to specific view holder that matches given matcher
     *
     * @param matcher Matcher for view holder, which is scroll destination
     */
    fun scrollTo(matcher: Matcher<View>) {
        view.perform(RecyclerViewActions.scrollTo<RecyclerView.ViewHolder>(matcher))
    }

    /**
     * Scrolls to specific view holder that matches given matcher
     *
     * @param viewBuilder Builder that will be used to match view to scroll
     */
    fun scrollTo(viewBuilder: ViewBuilder.() -> Unit) {
        scrollTo(ViewBuilder().apply { withIndex(0, viewBuilder) }.getViewMatcher())
    }

    /**
     * Returns the size of RecyclerView
     *
     * @return size of adapter
     *
     * @see RecyclerView
     */
    fun getSize(): Int {
        var size = 0

        view.perform(object : ViewAction {
            override fun getDescription() = "Get RecyclerView adapter size"

            override fun getConstraints() = Matchers.allOf(ViewMatchers
                    .isAssignableFrom(RecyclerView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is RecyclerView) {
                    size = view.adapter?.itemCount!!
                }
            }
        })

        return size
    }
}

/**
 * Provides ScrollableActions implementation for ScrollView
 *
 * @see ScrollableActions
 * @see ScrollView
 */
interface ScrollViewActions : ScrollableActions {
    override fun scrollToStart() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to start"

            override fun getConstraints() = Matchers.allOf(ViewMatchers
                    .isAssignableFrom(ScrollView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ScrollView) {
                    view.fullScroll(View.FOCUS_UP)
                }
            }
        })
    }

    override fun scrollToEnd() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to end"

            override fun getConstraints() = Matchers.allOf(ViewMatchers
                    .isAssignableFrom(ScrollView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ScrollView) {
                    view.fullScroll(View.FOCUS_DOWN)
                }
            }
        })
    }

    override fun scrollTo(position: Int) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to $position Y position"

            override fun getConstraints() = Matchers.allOf(ViewMatchers
                    .isAssignableFrom(ScrollView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ScrollView) {
                    view.scrollTo(0, position)
                }
            }
        })
    }

    /**
     * Returns the size of ScrollView
     *
     * @return size of adapter
     *
     * @see ScrollView
     * @see AdapterView
     */
    fun getSize(): Int {
        var size = 0

        view.perform(object : ViewAction {
            override fun getDescription() = "Get AdapterView adapter size"

            override fun getConstraints() = Matchers.allOf(ViewMatchers
                    .isAssignableFrom(AdapterView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is AdapterView<*>) {
                    size = view.count
                }
            }
        })

        return size
    }
}

/**
 * Provides action for checking views
 */
interface CheckableActions : BaseActions {
    /**
     * Sets checked state of the view
     *
     * @param checked True if checked, false otherwise
     */
    fun setChecked(checked: Boolean) {
        view.perform(object : ViewAction {
            override fun getDescription() = "performing CheckableViewAction: $checked"

            override fun getConstraints() = Matchers.allOf(ViewMatchers.isAssignableFrom(View::class.java),
                    object : TypeSafeMatcher<View>() {
                        override fun describeTo(description: Description) {
                            description.appendText("is assignable from class: " + Checkable::class.java)
                        }

                        override fun matchesSafely(view: View) = Checkable::class.java.isAssignableFrom(view.javaClass)
                    })

            override fun perform(uiController: UiController, view: View) {
                if (view is Checkable) view.isChecked = checked
            }
        })
    }
}

/**
 * Provides actions for navigation drawer
 */
interface DrawerActions : BaseActions {
    /**
     * Opens the navigation drawer
     *
     * @param gravity Gravity to use (Gravity.START by default)
     * @see Gravity.START
     */
    fun open(gravity: Int = Gravity.START) {
        view.perform(DrawerActions.open(gravity))
    }

    /**
     * Closes the navigation drawer
     *
     * @param gravity Gravity to use (Gravity.START by default)
     * @see Gravity.START
     */
    fun close(gravity: Int = Gravity.START) {
        view.perform(DrawerActions.close(gravity))
    }
}

/**
 * Provides action for RatingBar
 */
interface RatingBarActions : BaseActions {
    /**
     * Set rating for RatingBar
     *
     * @param number of rating to set for the RatingBar
     */
    fun setRatingAt(number: Float) {
        view.perform(object : ViewAction {
            override fun getDescription() = "set rating value of rating bar as: $number"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(RatingBar::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is RatingBar) {
                    view.rating = number
                }
            }
        })
    }
}

/**
 * Provides action for interacting with WebViews
 *
 * @see WebView
 */
interface WebActions {
    val web: Web.WebInteraction<*>
    val ref: Atom<ElementReference>

    /**
     * Clicks on element
     */
    fun click() {
        perform(DriverAtoms.webClick())
    }

    /**
     * Input keys with element in focus
     *
     * @param text Text to input
     */
    fun keys(text: String) {
        perform(DriverAtoms.webKeys(text))
    }

    /**
     * Scrolls to the element inside WebView
     */
    fun scroll() {
        perform(DriverAtoms.webScrollIntoView())
    }

    /**
     * Clears the element
     */
    fun clear() {
        perform(DriverAtoms.clearElement())
    }

    /**
     * Performs custom action on element
     *
     * @param action Action to be performed
     */
    private fun perform(action: Atom<*>) {
        web.withElement(ref).perform(action)
    }
}