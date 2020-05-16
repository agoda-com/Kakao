@file:Suppress("unused")

package com.agoda.kakao.toolbar

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.test.espresso.assertion.ViewAssertions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.matchers.ToolbarSubtitleMatcher
import com.agoda.kakao.common.matchers.ToolbarTitleMatcher
import com.agoda.kakao.image.ImageViewAssertions
import com.agoda.kakao.image.KImageView

/**
 * Provides assertion for Toolbar
 */
interface ToolbarViewAssertions : BaseAssertions, ImageViewAssertions {
    val navigationIcon: KImageView?
        get() = null

    /**
     * Checks if Toolbar has title
     *
     * @param title expected title string
     */
    fun hasTitle(title: String) {
        view.check(ViewAssertions.matches(ToolbarTitleMatcher(title)))
    }

    /**
     * Checks if Toolbar has subtitle
     *
     * @param subtitle expected subtitle string
     */
    fun hasSubtitle(subtitle: String) {
        view.check(ViewAssertions.matches(ToolbarSubtitleMatcher(subtitle)))
    }

    /**
     * Checks if Toolbar has title
     *
     * @param resId expected title resource id
     */
    fun hasTitle(resId: Int) {
        view.check(ViewAssertions.matches(ToolbarTitleMatcher(resId)))
    }

    /**
     * Checks if Toolbar has subtitle
     *
     * @param resId expected subtitle resource id
     */
    fun hasSubtitle(resId: Int) {
        view.check(ViewAssertions.matches(ToolbarSubtitleMatcher(resId)))
    }

    /**
     * Checks if Toolbar has navigation drawable
     *
     * @param resId expected drawable resource id
     */
    fun hasNavigationIconDrawable(@DrawableRes resId: Int, toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        navigationIcon?.hasDrawable(resId = resId, toBitmap = toBitmap) ?: throw AssertionError(
            "Unable to match navigationIconDrawable, did you forget to provide its view builder?"
        )
    }
}
