package com.agoda.sample.screen

import android.view.View
import com.agoda.kakao.*
import com.agoda.sample.R
import org.hamcrest.Matcher

class TestNestedRecyclerScreen : Screen<TestNestedRecyclerScreen>() {
    val recycler = KRecyclerView({
        withId(R.id.recycler_view)
    }, {
        itemType(::RecyclerItem)
    })

    class RecyclerItem(parent: Matcher<View>) : KRecyclerItem<RecyclerItem>(parent) {
        val nested = KRecyclerView({
            withMatcher(parent)
        }, {
            itemType(::NestedItem)
        })
    }

    class NestedItem(parent: Matcher<View>) : KRecyclerItem<NestedItem>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.title) }
        val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
        val button: KButton = KButton(parent) { withId(R.id.button) }
    }
}