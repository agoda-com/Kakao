package com.agoda.kakao

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.web.assertion.WebViewAssertions
import android.support.test.espresso.web.model.Atom
import android.support.test.espresso.web.model.ElementReference
import android.support.test.espresso.web.sugar.Web
import android.support.test.espresso.web.webdriver.DriverAtoms
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers

/**
 * Base interface for asserting views
 *
 * Provides basic assertions that can be performed on any view
 *
 * @see TextViewAssertions
 * @see EditableAssertions
 * @see CheckableAssertions
 * @see ViewPagerAssertions
 * @see ImageViewAssertions
 */
interface BaseAssertions {
    val view: ViewInteraction

    /**
     * Checks if the view is displayed
     */
    fun isDisplayed() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isDisplayed()))
    }

    /**
     * Checks if the view is not displayed
     */
    fun isNotDisplayed() {
        view.check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isDisplayed())))
    }

    /**
     * Checks if the view is completely displayed
     */
    fun isCompletelyDisplayed() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isCompletelyDisplayed()))
    }

    /**
     * Checks if the view is not completely displayed
     */
    fun isNotCompletelyDisplayed() {
        view.check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isCompletelyDisplayed())))
    }

    /**
     * Checks if the view has VISIBLE visibility
     */
    fun isVisible() {
        view.check(ViewAssertions.matches(
                ViewMatchers.withEffectiveVisibility(
                        ViewMatchers.Visibility.VISIBLE)))
    }

    /**
     * Checks if the view has INVISIBLE visibility
     */
    fun isInvisible() {
        view.check(ViewAssertions.matches(
                ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.INVISIBLE)))
    }

    /**
     * Checks if the view has GONE visibility
     */
    fun isGone() {
        view.check(ViewAssertions.matches(
                ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE)))
    }

    /**
     * Checks if the view is selected
     */
    fun isSelected() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isSelected()))
    }

    /**
     * Checks if the view is not selected
     */
    fun isNotSelected() {
        view.check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isSelected())))
    }

    /**
     * Checks if the view is focused
     */
    fun isFocused() {
        view.check(ViewAssertions.matches(
                ViewMatchers.hasFocus()))
    }

    /**
     * Checks if the view is not focused
     */
    fun isNotFocused() {
        view.check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.hasFocus())))
    }

    /**
     * Checks if the view is focusable
     */
    fun isFocusable() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isFocusable()))
    }

    /**
     * Checks if the view is not focusable
     */
    fun isNotFocusable() {
        view.check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isFocusable())))
    }

    /**
     * Checks if the view is clickable
     */
    fun isClickable() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isClickable()))
    }

    /**
     * Checks if the view is not clickable
     */
    fun isNotClickable() {
        view.check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isClickable())))
    }

    /**
     * Checks if the view is enabled
     */
    fun isEnabled() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isEnabled()))
    }

    /**
     * Checks if the view is disabled
     */
    fun isDisabled() {
        view.check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isEnabled())))
    }

    /**
     * Checks if the view has given tag
     *
     * @param tag Tag that view must have
     */
    fun hasTag(tag: String) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withTagValue(Matchers.`is`(tag))))
    }

    /**
     * Checks if the view has at least one of the given tags
     *
     * @param tags Tags with at least one of them should be present in view
     */
    fun hasAnyTag(vararg tags: String) {
        val matchers = ArrayList<Matcher<Any>>(tags.size)

        tags.forEach {
            matchers.add(Matchers.`is`(it))
        }

        view.check(ViewAssertions.matches(
                ViewMatchers.withTagValue(Matchers.anyOf(matchers))))
    }

    /**
     * Checks if the matched view does not exists
     */
    fun doesNotExists() {
        view.check(ViewAssertions.doesNotExist())
    }

    /**
     * Checks if the view has given descendant
     *
     * @param function ViewBuilder that will result in descendant matcher
     *
     * @see ViewBuilder
     */
    fun hasDescendant(function: ViewBuilder.() -> Unit) {
        view.check(ViewAssertions.matches(ViewMatchers
                .hasDescendant(ViewBuilder().apply(function).getViewMatcher())))
    }

    /**
     * Checks if the view has not given descendant
     *
     * @param function ViewBuilder that will result in descendant matcher
     *
     * @see ViewBuilder
     */
    fun hasNotDescendant(function: ViewBuilder.() -> Unit) {
        view.check(ViewAssertions.matches(Matchers.not(ViewMatchers
                .hasDescendant(ViewBuilder().apply(function).getViewMatcher()))))
    }

    /**
     * Checks if the view has given sibling
     *
     * @param function ViewBuilder that will result in sibling matcher
     *
     * @see ViewBuilder
     */
    fun hasSibling(function: ViewBuilder.() -> Unit) {
        view.check(ViewAssertions.matches(ViewMatchers
                .hasSibling(ViewBuilder().apply(function).getViewMatcher())))
    }

    /**
     * Checks if the view has not given sibling
     *
     * @param function ViewBuilder that will result in sibling matcher
     *
     * @see ViewBuilder
     */
    fun hasNotSibling(function: ViewBuilder.() -> Unit) {
        view.check(ViewAssertions.matches(Matchers.not(ViewMatchers
                .hasSibling(ViewBuilder().apply(function).getViewMatcher()))))
    }

    /**
     * Check if the view matches given matcher
     *
     * @param function ViewBuilder that will result in matcher
     *
     * @see ViewBuilder
     */
    fun matches(function: ViewBuilder.() -> Unit) {
        view.check(ViewAssertions.matches(ViewBuilder().apply(function).getViewMatcher()))
    }

    /**
     * Check if the view does not match given matcher
     *
     * @param function ViewBuilder that will result in matcher
     *
     * @see ViewBuilder
     */
    fun notMatches(function: ViewBuilder.() -> Unit) {
        view.check(ViewAssertions.matches(Matchers.not(ViewBuilder().apply(function).getViewMatcher())))
    }

    /**
     * Check the view with the given custom assertion
     *
     * @param function Lambda that must return ViewAssertion
     */
    fun assert(function: () -> ViewAssertion) {
        view.check(function.invoke())
    }

    /**
     * Check if the view is in given root
     *
     * @param function RootBuilder that will result in root matcher
     *
     * @see RootBuilder
     */
    fun inRoot(function: RootBuilder.() -> Unit) {
        view.inRoot(RootBuilder().apply(function).getRootMatcher())
    }

    /**
     *  Checks if the view has given background color
     *
     * @param resId Color resource to be matched
     *
     */
    fun hasBackgroundColor(@ColorRes resId: Int) {
        view.check(ViewAssertions.matches(BackgroundColorMatcher(resId = resId)))
    }

    /**
     *  Checks if the view has given background color
     *
     * @param colorCode Color string code to be matched
     *
     */
    fun hasBackgroundColor(colorCode: String) {
        view.check(ViewAssertions.matches(BackgroundColorMatcher(colorCode = colorCode)))
    }
}

/**
 * Provides text based assertions for views
 */
interface TextViewAssertions : BaseAssertions {
    /**
     * Checks if the view have not any text
     */
    fun hasEmptyText() {
        view.check(ViewAssertions.matches(
                ViewMatchers.withText("")))
    }

    /**
     * Checks if the view has any text
     */
    fun hasAnyText() {
        view.check(ViewAssertions.matches(
                AnyTextMatcher()))
    }

    /**
     * Checks if the view has given text
     *
     * @param text Text to be matched
     */
    fun hasText(text: String) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withText(text)))
    }

    /**
     * Checks if the view has given text
     *
     * @param resId String resource to be matched
     */
    fun hasText(@StringRes resId: Int) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withText(resId)))
    }

    /**
     * Checks if the view has text that matches given matcher
     */
    fun hasText(matcher: Matcher<String>) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withText(matcher)))
    }

    /**
     * Checks if the view does not have a given text
     *
     * @param text Text to be matched
     */
    fun hasNoText(text: String) {
        view.check(ViewAssertions.matches(CoreMatchers.not(
                ViewMatchers.withText(text))))
    }

    /**
     * Checks if the view does not have a given text
     *
     * @param resId String resource to be matched
     */
    fun hasNoText(@StringRes resId: Int) {
        view.check(ViewAssertions.matches(CoreMatchers.not(
                ViewMatchers.withText(resId))))
    }

    /**
     * Checks if the view has given content description
     *
     * @param text Content description to be matched
     */
    fun hasContentDescription(text: String) {
        view.check(ViewAssertions.matches(ViewMatchers.withContentDescription(text)))
    }

    /**
     * Checks if the view contains given text
     *
     * @param text Text to be searched
     */
    fun containsText(text: String) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withText(Matchers.containsString(text))))
    }

    /**
     * Checks if the view text start with given substring
     *
     * @param text Text to be searched
     */
    fun startsWithText(text: String) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withText(Matchers.startsWith(text))))
    }
}

/**
 * Provides editable based assertions for views
 */
interface EditableAssertions : TextViewAssertions {
    /**
     * Checks if the view has given hint
     *
     * @param hint Text to be matched
     */
    fun hasHint(hint: String) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withHint(hint)))
    }

    /**
     * Checks if the view has given hint
     *
     * @param resId String resource to be matched
     */
    fun hasHint(@StringRes resId: Int) {
        view.check(ViewAssertions.matches(
                ViewMatchers.withHint(resId)))
    }
}

/**
 * Provides checkable based assertions for views
 */
interface CheckableAssertions : BaseAssertions {
    /**
     * Checks if the view is checked
     */
    fun isChecked() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isChecked()))
    }

    /**
     * Checks if the view is not checked
     */
    fun isNotChecked() {
        view.check(ViewAssertions.matches(
                ViewMatchers.isNotChecked()))
    }
}

/**
 * Provides assertions for view pagers
 */
interface ViewPagerAssertions : BaseAssertions {
    /**
     * Checks if the view is currently at given page
     *
     * @param index Page index to be matched
     */
    fun isAtPage(index: Int) {
        view.check(ViewAssertions.matches(PageMatcher(index)))
    }
}

/**
 * Provides assertion for image views
 */
interface ImageViewAssertions : BaseAssertions {
    /**
     * Checks if the view displays given drawable
     *
     * @param resId Drawable resource to be matched
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawable(@DrawableRes resId: Int, toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        view.check(ViewAssertions.matches(DrawableMatcher(resId = resId, toBitmap = toBitmap)))
    }

    /**
     * Checks if the view displays given drawable
     *
     * @param drawable Drawable to be matched
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawable(drawable: Drawable, toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        view.check(ViewAssertions.matches(DrawableMatcher(drawable = drawable, toBitmap = toBitmap)))
    }
}

/**
 * Interface that provides assertions for WebViews
 */
interface WebAssertions {
    val web: Web.WebInteraction<*>
    val ref: Atom<ElementReference>

    /**
     * Checks if element has given text
     *
     * @param text Text to be matched
     */
    fun hasText(text: String) {
        matches(DriverAtoms.getText(), Matchers.`is`(text))
    }

    /**
     * Checks if element contains given text
     *
     * @param text Text to be searched
     */
    fun containsText(text: String) {
        matches(DriverAtoms.getText(), CoreMatchers.containsString(text))
    }

    /**
     * Checks if element matches given matcher
     *
     * @param T Type of value to be matched
     * @param value Actual value to be matched
     * @param matcher Matcher that matches given value
     */
    fun <T> matches(value: Atom<T>, matcher: Matcher<T>) {
        web.withElement(ref)
                .check(WebViewAssertions.webMatches(value, matcher))
    }
}