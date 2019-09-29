package com.agoda.sample.screen

import android.view.View
import com.agoda.kakao.check.KCheckBox
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.sample.R
import org.hamcrest.Matcher

open class RecyclerComplexScreen : Screen<RecyclerComplexScreen>() {
    val recycler: KRecyclerView = KRecyclerView({
                                                    withId(R.id.recycler_view)
                                                }, itemTypeBuilder = {
        itemType(::CheckRow)
    })

    class CheckRow(parent: Matcher<View>) : KRecyclerItem<CheckRow>(parent) {
        val checkRow: KCheckBox = KCheckBox { withMatcher(parent) }
    }
}
