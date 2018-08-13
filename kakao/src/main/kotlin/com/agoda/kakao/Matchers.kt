package com.agoda.kakao

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.os.Build
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import com.google.android.material.navigation.NavigationView
import com.google.android.material.textfield.TextInputLayout
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.viewpager.widget.ViewPager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.*
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import kotlin.text.isNullOrEmpty

/**
 * Matches TextView views which contains any text
 *
 * @see TextView
 */
class AnyTextMatcher : BoundedMatcher<View, TextView>(TextView::class.java) {
    override fun describeTo(desc: Description) {
        desc.appendText("which has any text")
    }

    override fun matchesSafely(view: TextView?): Boolean =
            view?.text?.toString()?.isNotEmpty() ?: false
}

/**
 * Matches RecyclerView descendant at given position in adapter
 *
 * @param parent Matcher of the recycler view
 * @param position Position of item in adapter
 */
class PositionMatcher(private val parent: Matcher<View>, private val position: Int)
    : BoundedMatcher<View, View>(View::class.java) {

    override fun describeTo(desc: Description) {
        desc.appendText("view holder at $position position of recycler view: ")
                .appendDescriptionOf(parent)
    }

    override fun matchesSafely(view: View?): Boolean {
        view?.let {
            if (parent.matches(it.parent) && it.parent is RecyclerView) {
                val holder = (it.parent as RecyclerView).findViewHolderForAdapterPosition(position)
                return holder?.itemView === it
            }
        }

        return false
    }
}

/**
 * Matches first RecyclerView descendant which matches specific matcher
 *
 * @param parent Matcher of the recycler view
 * @param item Matcher of the item in adapter
 */
class ItemMatcher(private val parent: Matcher<View>, private val item: Matcher<View>)
    : BoundedMatcher<View, View>(View::class.java) {

    var position = -1

    override fun describeTo(desc: Description) {
        desc.appendText("view holder: ")
                .appendDescriptionOf(item)
                .appendText("of recycler view: ")
                .appendDescriptionOf(parent)
    }

    override fun matchesSafely(view: View?): Boolean {
        view?.let {
            if (parent.matches(it.parent) && it.parent is RecyclerView) {
                if (item.matches(it)) {
                    position = (it.parent as RecyclerView).getChildAdapterPosition(it)
                    return true
                }
            }
        }

        return false
    }
}

/**
 * Matches first view
 */
class FirstViewMatcher : BoundedMatcher<View, View>(View::class.java) {
    private var matched: Boolean = false

    override fun describeTo(desc: Description) {
        desc.appendText("first view")
    }

    override fun matchesSafely(view: View?): Boolean {
        return if (matched) {
            false
        } else {
            matched = true
            true
        }
    }
}

/**
 * Matches ViewPager which page index equals given
 *
 * @param index Index of page
 */
class PageMatcher(private val index: Int) : BoundedMatcher<View, ViewPager>(ViewPager::class.java) {
    override fun describeTo(desc: Description) {
        desc.appendText("with current page index = $index")
    }

    override fun matchesSafely(view: ViewPager?): Boolean =
            view?.let { it.currentItem == index } ?: false
}

/**
 * Matches index'th view that matches given matcher
 *
 * @param matcher Matcher that have several matching views
 * @param index index of view that must be matched
 */
class IndexMatcher(private val matcher: Matcher<View>, private val index: Int) : TypeSafeMatcher<View>() {
    private var currentIndex = 0

    override fun describeTo(desc: Description) {
        desc.appendText("${index}th view with: ")
                .appendDescriptionOf(matcher)
    }

    public override fun matchesSafely(view: View): Boolean =
            matcher.matches(view) && currentIndex++ == index
}

/**
 * Matches NavigationView with given item id checked
 *
 * @param id menu item id to be checked
 */
class NavigationItemMatcher(private val id: Int) : BoundedMatcher<View, NavigationView>(NavigationView::class.java) {
    override fun describeTo(desc: Description) {
        desc.appendText("Matches view with menu item checked: $id")
    }

    override fun matchesSafely(view: NavigationView)
            = view.menu.getItem(id)?.isChecked ?: false
}

/**
 * Matcher of value progress of given matcher
 *
 * @param value of progress that matched the view which is ProgressBar
 */
class ProgressMatcher(private val value: Int) : BoundedMatcher<View, ProgressBar>(ProgressBar::class.java) {
    override fun matchesSafely(view: ProgressBar?) = view?.let { it.progress == value } ?: false

    override fun describeTo(description: Description) {
        description.appendText("progress value is: $value")
    }
}

/**
 * Matcher of value rating of given matcher
 *
 * @param value of rating that matched the view which is RatingBar
 */
class RatingBarMatcher(private val value: Float) : BoundedMatcher<View, RatingBar>(RatingBar::class.java) {
    override fun matchesSafely(view: RatingBar?) = view?.let { it.rating == value } ?: false

    override fun describeTo(description: Description) {
        description.appendText("rating value is: $value")
    }
}

/**
 * Matches RecyclerView with count of children
 *
 * @param size of children count in RecyclerView
 */
class RecyclerViewAdapterSizeMatcher(private val size: Int) : BoundedMatcher<View, RecyclerView>(RecyclerView::class.java) {

    private var itemCount: Int = 0

    override fun matchesSafely(view: RecyclerView) = run {
        itemCount = view.adapter?.itemCount ?: 0
        itemCount == size
    }

    override fun describeTo(description: Description) {
        description
                .appendText("RecyclerView with ")
                .appendValue(size)
                .appendText(" item(s), but got with ")
                .appendValue(itemCount)
    }
}

/**
 * Matches ListView with count of children
 *
 * @param size of children count in ListView
 */
class ListViewViewAdapterSizeMatcher(private val size: Int) : BoundedMatcher<View, ListView>(ListView::class.java) {

    private var itemCount: Int = 0

    override fun matchesSafely(view: ListView) = run {
        itemCount = view.adapter?.count ?: 0
        itemCount == size
    }

    override fun describeTo(description: Description) {
        description
                .appendText("ListView with ")
                .appendValue(size)
                .appendText(" item(s), but got with ")
                .appendValue(itemCount)
    }
}

/**
 * Matches given drawable with current one
 *
 * @param resId Drawable resource to be matched (default is -1)
 * @param drawable Drawable instance to be matched (default is null)
 * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
 */
class DrawableMatcher(@DrawableRes private val resId: Int = -1, private val drawable: Drawable? = null,
                      private val toBitmap: ((drawable: Drawable) -> Bitmap)? = null)
    : TypeSafeMatcher<View>(View::class.java) {

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

        return view?.let {
            var expectedDrawable: Drawable? = ContextCompat.getDrawable(it.context, resId)

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP && expectedDrawable != null) {
                expectedDrawable = DrawableCompat.wrap(expectedDrawable).mutate()
            }

            if (expectedDrawable == null) {
                return false
            }

            val convertDrawable = drawable ?: (it as ImageView).drawable
            val bitmap = toBitmap?.invoke(convertDrawable) ?: drawableToBitmap(convertDrawable)
            val otherBitmap = toBitmap?.invoke(expectedDrawable) ?: drawableToBitmap(expectedDrawable)

            return bitmap.sameAs(otherBitmap)
        } ?: false
    }

    private fun drawableToBitmap(drawable: Drawable): Bitmap {
        if (drawable is BitmapDrawable) {
            if (drawable.bitmap != null) {
                return drawable.bitmap
            }
        }

        if (drawable is StateListDrawable) {
            if (drawable.getCurrent() is BitmapDrawable) {
                val bitmapDrawable = drawable.getCurrent() as BitmapDrawable
                if (bitmapDrawable.bitmap != null) {
                    return bitmapDrawable.bitmap
                }
            }
        }

        val bitmap = if (drawable.intrinsicWidth <= 0 || drawable.intrinsicHeight <= 0) {
            Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) // Single color bitmap will be created of 1x1 pixel
        } else {
            Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
        }

        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, canvas.width, canvas.height)
        drawable.draw(canvas)
        return bitmap
    }
}

class TextInputLayoutHintEnabledMatcher(private val enabled: Boolean) : TypeSafeMatcher<View>() {
    override fun matchesSafely(item: View?): Boolean {
        return item?.let {
            if (item is TextInputLayout) {
                item.isHintEnabled == enabled
            } else false
        } ?: false
    }

    override fun describeTo(desc: Description) {
        desc.appendText("with hint state: ")
                .appendValue(enabled)
    }
}

class TextInputLayoutErrorEnabledMatcher(private val enabled: Boolean) : TypeSafeMatcher<View>() {
    override fun matchesSafely(item: View?): Boolean {
        return item?.let {
            if (item is TextInputLayout) {
                item.isErrorEnabled == enabled
            } else false
        } ?: false
    }

    override fun describeTo(desc: Description) {
        desc.appendText("with error state: ")
                .appendValue(enabled)
    }
}

class TextInputLayoutCounterEnabledMatcher(private val enabled: Boolean) : TypeSafeMatcher<View>() {
    override fun matchesSafely(item: View?): Boolean {
        return item?.let {
            if (item is TextInputLayout) {
                item.isCounterEnabled == enabled
            } else false
        } ?: false
    }

    override fun describeTo(desc: Description) {
        desc.appendText("with counter state: ")
                .appendValue(enabled)
    }
}

/**
 * Matches given background color with the current one
 *
 * @param resId Background color resource to be matched (default is -1)
 * @param colorCode Background color string code to be matched (default is null)
 */
class BackgroundColorMatcher(@ColorRes private val resId: Int = -1,
                             private val colorCode: String? = null) : TypeSafeMatcher<View>() {

    override fun matchesSafely(item: View?): Boolean {
        if (resId == -1 && colorCode.isNullOrEmpty()) {
            return item?.background == null
        }

        return item?.let{
            val expectedColor = if (resId != -1) {
                ContextCompat.getColor(it.context, resId)
            } else {
                Color.parseColor(colorCode)
            }

            it.background != null &&
            it.background.current is ColorDrawable &&
            (it.background.current as ColorDrawable).color == expectedColor
        }?: false
    }

    override fun describeTo(description: Description) {
        description.appendText("with background color: $resId or $colorCode")
    }
}

class SwipeRefreshLayoutMatcher(private val refreshing: Boolean) : TypeSafeMatcher<View>() {
    override fun matchesSafely(item: View?): Boolean {
        return item?.let {
            if (item is SwipeRefreshLayout) {
                item.isRefreshing == refreshing
            } else false
        } ?: false
    }

    override fun describeTo(desc: Description) {
        desc.appendText("with refreshing state: ")
                .appendValue(refreshing)
    }
}
