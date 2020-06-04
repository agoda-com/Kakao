@file:Suppress("unused")

package com.agoda.kakao.common.matchers

import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.PorterDuff
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.os.Build
import android.view.View
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.agoda.kakao.common.extentions.toBitmap
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher


/**
 * Matches given drawable with current one
 *
 * @param resId Drawable resource to be matched (default is -1)
 * @param drawable Drawable instance to be matched (default is null)
 * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
 */
class DrawableMatcher(
    @DrawableRes private val resId: Int = -1,
    private val drawable: Drawable? = null,
    @ColorRes private val tintColorId: Int? = null,
    private val toBitmap: ((drawable: Drawable) -> Bitmap)? = null
) : TypeSafeMatcher<View>(View::class.java) {

    override fun describeTo(desc: Description) {
        desc.appendText("with drawable id $resId or provided instance")
    }

    override fun matchesSafely(view: View?): Boolean {
        if (view !is ImageView && drawable == null) {
            return false
        }

        if (resId < 0 && drawable == null) {
            return (view as ImageView).drawable == null
        }

        return view?.let { imageView ->
            var expectedDrawable: Drawable? = drawable ?: ContextCompat.getDrawable(imageView.context, resId)

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP && expectedDrawable != null) {
                expectedDrawable = DrawableCompat.wrap(expectedDrawable).mutate()
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                tintColorId?.let { tintColorId ->
                    val tintColor = ContextCompat.getColor(imageView.context, tintColorId)
                    expectedDrawable?.apply {
                        setTintList(ColorStateList.valueOf(tintColor))
                        setTintMode(PorterDuff.Mode.SRC_IN)
                    }
                }
            }

            if (expectedDrawable == null) {
                return false
            }

            val convertDrawable = (imageView as ImageView).drawable
            val bitmap = toBitmap?.invoke(convertDrawable) ?: convertDrawable.toBitmap()

            val otherBitmap = toBitmap?.invoke(expectedDrawable) ?: expectedDrawable.toBitmap()

            return bitmap.sameAs(otherBitmap)
        } ?: false
    }
}
