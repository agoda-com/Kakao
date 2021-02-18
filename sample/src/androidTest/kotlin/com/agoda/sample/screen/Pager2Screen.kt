package com.agoda.sample.screen

import android.view.View
import com.agoda.kakao.pager2.KViewPager2
import com.agoda.kakao.pager2.KViewPagerItem
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.agoda.sample.R
import org.hamcrest.Matcher

open class Pager2Screen : Screen<Pager2Screen>() {
    val pager: KViewPager2 = KViewPager2({
                                             withId(R.id.pager)
                                         }, itemTypeBuilder = {
        itemType(Pager2Screen::SimpleItem)
    })

    class SimpleItem(parent: Matcher<View>) : KViewPagerItem<SimpleItem>(parent) {
        val text: KTextView = KTextView(parent) { withId(R.id.text) }
    }
}
