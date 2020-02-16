@file:Suppress("unused")

package com.agoda.kakao.pager2

import android.view.View
import com.agoda.kakao.common.KakaoDslMarker
import org.hamcrest.Matcher
import kotlin.reflect.KClass

/**
 * Class that maps types to providing functions
 *
 * To be able to support different item types in KViewPager2, this class
 * adds support for mapping item type classes to functions that provide them.
 * KEmptyViewPagerItem is added by default.
 *
 * @see itemType
 * @see KEmptyViewPagerItem
 */
@KakaoDslMarker
class KViewPagerItemTypeBuilder {
    val itemTypes = mutableMapOf<KClass<out KViewPagerItem<*>>, KViewPagerItemType<KViewPagerItem<*>>>()

    init {
        itemTypes[KViewPagerItem::class] = KViewPagerItemType { matcher -> KEmptyViewPagerItem(matcher) }
        itemTypes[KEmptyViewPagerItem::class] = KViewPagerItemType { matcher -> KEmptyViewPagerItem(matcher) }
    }

    /**
     * Adds entry that helps KViewPager2 to automatically build child views
     *
     * To make it work, you need to pass here function (lambda, constructor), that takes matcher and returns
     * instance of your item type. In this case, matcher actually matches root view of your adapter item.
     *
     * @param provideItem Function that takes matcher of item's root view and returns instance of item view
     */
    inline fun <reified T : KViewPagerItem<*>> itemType(noinline provideItem: (Matcher<View>) -> T) {
        itemTypes[T::class] = KViewPagerItemType(provideItem)
    }
}
