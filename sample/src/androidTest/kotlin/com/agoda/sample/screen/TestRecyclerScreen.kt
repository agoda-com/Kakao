package com.agoda.sample.screen

import android.view.View
import com.agoda.kakao.check.KCheckBox
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.agoda.sample.R
import org.hamcrest.Matcher

open class TestRecyclerScreen : Screen<TestRecyclerScreen>() {
    val recycler: KRecyclerView = KRecyclerView({
                                                    withId(R.id.recycler_view)
                                                }, itemTypeBuilder = {
        itemType(::MainItem)
        itemType(::CheckBoxItem)
        itemType(::ItemWithSubtitle)
    })

    class MainItem(parent: Matcher<View>) : KRecyclerItem<MainItem>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.title) }
    }

    class CheckBoxItem(parent: Matcher<View>) : KRecyclerItem<CheckBoxItem>(parent) {
        val checkbox: KCheckBox = KCheckBox(parent) { withId(R.id.checkbox) }
    }

    class ItemWithSubtitle(parent: Matcher<View>) : KRecyclerItem<ItemWithSubtitle>(parent) {
        val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
    }
}
