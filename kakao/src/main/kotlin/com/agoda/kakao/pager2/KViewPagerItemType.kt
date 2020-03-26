@file:Suppress("unused")

package com.agoda.kakao.pager2

import android.view.View
import org.hamcrest.Matcher

/**
 * For internal use. Don't use manually.
 *
 * Holds type and corresponding provider function
 */
class KViewPagerItemType<out T : KViewPagerItem<*>>(val provideItem: (Matcher<View>) -> T)
