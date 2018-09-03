package com.agoda.sample.screen

import android.support.test.espresso.DataInteraction
import android.widget.ListView
import com.agoda.kakao.KAdapterItem
import com.agoda.kakao.KEditText
import com.agoda.kakao.KListView
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.agoda.sample.R

class AutoCompleteActivityScreen : Screen<AutoCompleteActivityScreen>() {

    val input = KEditText {
        withId(R.id.auto_complete_view)
    }

    val list = KListView(
            builder = { isInstanceOf(ListView::class.java) },
            itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val text = KTextView(i) { withId(android.R.id.text1) }
    }
}
