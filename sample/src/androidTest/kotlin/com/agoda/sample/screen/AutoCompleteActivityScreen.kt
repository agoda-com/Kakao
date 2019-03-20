package com.agoda.sample.screen

import android.widget.ListView
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.list.KAbsListView
import com.agoda.kakao.list.KAdapterItem
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.agoda.sample.R

class AutoCompleteActivityScreen : Screen<AutoCompleteActivityScreen>() {
    val input = KEditText {
        withId(R.id.auto_complete_view)
    }

    val list = KAbsListView(
            builder = { isInstanceOf(ListView::class.java) },
            itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val text = KTextView(i) { withId(R.id.text) }
    }
}
