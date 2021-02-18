package com.agoda.kakao.toolbar

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.Toolbar
import androidx.core.graphics.drawable.DrawableCompat
import androidx.test.espresso.matcher.BoundedMatcher
import com.agoda.kakao.common.extentions.toBitmap
import com.agoda.kakao.common.utilities.getResourceDrawable
import org.hamcrest.Description

class ToolbarNavigationMatcher(
    private val toBitmap: ((drawable: Drawable) -> Bitmap)? = null
) : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {
    @DrawableRes
    var resId: Int = -1
    var drawable: Drawable? = null

    constructor(drawable: Drawable) : this() {
        this.drawable = drawable
    }

    constructor(@DrawableRes resId: Int) : this() {
        this.resId = resId
    }

    override fun describeTo(desc: Description) {
        desc.appendText("Drawable is not equal")
    }

    override fun matchesSafely(view: Toolbar): Boolean {
        if (resId < 0 && drawable == null) {
            return false
        }

        var expectedDrawable: Drawable? = drawable ?: getResourceDrawable(resId)

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP && expectedDrawable != null) {
            expectedDrawable = DrawableCompat.wrap(expectedDrawable).mutate()
        }

        if (expectedDrawable == null) {
            return false
        }

        val convertDrawable = view.navigationIcon ?: return false

        val bitmap = toBitmap?.invoke(convertDrawable) ?: convertDrawable.toBitmap()

        val otherBitmap = toBitmap?.invoke(expectedDrawable) ?: expectedDrawable.toBitmap()

        return bitmap.sameAs(otherBitmap)
    }
}
