package com.agoda.sample.screen

import android.view.View
import com.agoda.kakao.image.KImageView
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.sample.R
import org.hamcrest.Matcher

class DrawableRecyclerScreen : Screen<DrawableRecyclerScreen>() {
    val list = KRecyclerView(
        builder = { withId(R.id.drawableRecycler) },
        itemTypeBuilder = { itemType(::Item) })

    class Item(parent: Matcher<View>) :
        KRecyclerItem<Item>(parent) {
        val imageView = KImageView(parent, { withId(R.id.imgView) })
    }

}
