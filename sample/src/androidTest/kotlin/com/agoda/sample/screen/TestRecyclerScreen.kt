package com.agoda.sample.screen

import android.view.View
import com.agoda.kakao.KRecyclerView
import com.agoda.kakao.KRecyclerItem
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.agoda.sample.R
import org.hamcrest.Matcher

open class TestRecyclerScreen : Screen<TestRecyclerScreen>() {
    val recycler: KRecyclerView = KRecyclerView({
        withId(R.id.recycler_view)
    }, itemTypeBuilder = {
        itemType(::Item)
    })

    class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.title) }
        val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
    }
}