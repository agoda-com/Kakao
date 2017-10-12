package com.agoda.sample.screen

import com.agoda.sample.R
import com.agoda.kakao.*

open class TestActivityScreen: Screen<TestActivityScreen>() {
    val content: KView = KView { withId(R.id.content) }
    val map: KView = KView { withId(R.id.map) }
    val button: KButton = KButton { withId(R.id.button) }

    val textViewLarge: KTextView = KTextView {
        withId(R.id.text_view_small)
    }

    val textViewSmall: KTextView = KTextView {
        withId(R.id.text_view_large)
    }

    val ratingbar: KRatingBar = KRatingBar { withId(R.id.rating_bar) }
}