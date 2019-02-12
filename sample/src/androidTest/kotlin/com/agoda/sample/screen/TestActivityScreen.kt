package com.agoda.sample.screen

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.progress.KSeekBar
import com.agoda.kakao.rating.KRatingBar
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KSnackbar
import com.agoda.kakao.text.KTextView
import com.agoda.sample.R

open class TestActivityScreen : Screen<TestActivityScreen>() {
    val content: KView = KView { withId(R.id.content) }
    val map: KView = KView { withId(R.id.map) }
    val recycler: KButton = KButton { withId(R.id.recycler) }
    val autoComplete: KButton = KButton { withId(R.id.auto_complete) }
    val snackbarButton: KButton = KButton { withId(R.id.snackbar_button) }

    val textViewLarge: KTextView = KTextView {
        withId(R.id.text_view_large)
    }

    val textViewSmall: KTextView = KTextView {
        withId(R.id.text_view_small)
    }

    val textViewColored: KTextView = KTextView {
        withId(R.id.text_view_colored)
    }

    val ratingbar: KRatingBar = KRatingBar { withId(R.id.rating_bar) }
    val seekbar: KSeekBar = KSeekBar { withId(R.id.seek_bar) }

    val snackbar: KSnackbar = KSnackbar()
}
