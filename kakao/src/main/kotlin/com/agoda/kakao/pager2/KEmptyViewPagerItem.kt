@file:Suppress("unused")

package com.agoda.kakao.pager2

import android.view.View
import org.hamcrest.Matcher

/**
 * Empty implementation of KViewPagerItem
 *
 * Use this if you want to perform/assert on the root view of view holder
 *
 * @param parent Matcher of the root view of view holder
 * @see KViewPagerItem
 */
class KEmptyViewPagerItem(parent: Matcher<View>) : KViewPagerItem<KEmptyViewPagerItem>(parent)
