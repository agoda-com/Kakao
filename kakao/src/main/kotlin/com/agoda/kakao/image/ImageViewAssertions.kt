@file:Suppress("unused")

package com.agoda.kakao.image

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.DrawableMatcher

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
     * @param resId Drawable resource to be matched
     * @param tintColorId Tint color  resource id
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableWithTint(@DrawableRes resId: Int, @ColorRes tintColorId: Int, toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        view.check(ViewAssertions.matches(DrawableMatcher(resId = resId, tintColorId = tintColorId, toBitmap = toBitmap)))
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

    /**
     * Checks if the view displays given drawable
     *
     * @param drawable Drawable to be matched
     * @param tintColorId Tint color  resource id
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableWithTint(drawable: Drawable, @ColorRes tintColorId: Int, toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        view.check(ViewAssertions.matches(DrawableMatcher(drawable = drawable, tintColorId = tintColorId , toBitmap = toBitmap)))
    }
}
