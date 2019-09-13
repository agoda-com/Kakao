package com.agoda.sample.screen

import androidx.test.espresso.DataInteraction
import com.agoda.kakao.image.KImageView
import com.agoda.kakao.list.KAbsListView
import com.agoda.kakao.list.KAdapterItem
import com.agoda.kakao.screen.Screen
import com.agoda.sample.R

class DrawableListScreen : Screen<DrawableListScreen>() {
    val list = KAbsListView(
        builder = { withId(R.id.drawableList) },
        itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val imageView = KImageView(i) { withId(R.id.imgView) }
    }
}
