package com.agoda.sample.screen

import android.support.test.espresso.DataInteraction
import android.widget.ListView
import com.agoda.kakao.list.KAdapterItem
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.list.KListView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.agoda.sample.R

class AutoCompleteActivityScreen : Screen<AutoCompleteActivityScreen>() {
    val input = KEditText {
        withId(R.id.auto_complete_view)
    }

    val list = KListView(
            builder = { isInstanceOf(ListView::class.java) },
            itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val text = KTextView(i) { withId(R.id.text) }
    }
}
