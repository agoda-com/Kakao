package com.agoda.sample.screen

import androidx.test.espresso.DataInteraction
import com.agoda.kakao.*
import com.agoda.sample.R

class TestListScreen : Screen<TestListScreen>() {
    val list = KListView(
            builder = { withId(R.id.list) },
            itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val title = KTextView(i) { withId(R.id.title) }
        val subtitle = KTextView(i) { withId(R.id.subtitle) }
        val button = KButton(i) { withId(R.id.button) }
    }
}