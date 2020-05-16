package com.agoda.sample.screen

import androidx.test.espresso.matcher.ViewMatchers.withId
import com.agoda.kakao.common.views.KView
import com.agoda.kakao.progress.KSeekBar
import com.agoda.kakao.rating.KRatingBar
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.switch.KSwitch
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KSnackbar
import com.agoda.kakao.text.KTextView
import com.agoda.kakao.toolbar.KToolbar
import com.agoda.sample.R

open class TestActivityScreen : Screen<TestActivityScreen>() {
    val content: KView = KView { withId(R.id.content) }
    val map: KView = KView { withId(R.id.map) }
    val multiTypeRecycler: KButton = KButton { withId(R.id.multi_type_recycler) }
    val singleTypeRecycler: KButton = KButton { withId(R.id.single_type_recycler) }
    val autoComplete: KButton = KButton { withId(R.id.auto_complete) }
    val snackbarButton: KButton = KButton { withId(R.id.snackbar_button) }
    val toolbar: KToolbar = KToolbar(rootBuilder = { withId(R.id.action_bar) }, navigateUpBuilder = { withContentDescription("Navigate up")})

    val textViewLarge: KTextView = KTextView {
        withId(R.id.text_view_large)
    }

    val textViewSmall: KTextView = KTextView {
        withId(R.id.text_view_small)
    }

    val buttonViewLeft: KButton = KButton {
        withId(R.id.button_view_left)
    }

    val buttonViewRight: KButton = KButton {
        withId(R.id.button_view_right)
    }

    val textViewColored: KTextView = KTextView {
        withId(R.id.text_view_colored)
    }

    val ratingbar: KRatingBar = KRatingBar { withId(R.id.rating_bar) }
    val seekbar: KSeekBar = KSeekBar { withId(R.id.seek_bar) }
    val switch: KSwitch = KSwitch { withId(R.id.switch_view) }
    val switchCompat: KSwitch = KSwitch { withId(R.id.switch_compat) }
    val nestedTextView: KTextView = KTextView { withId(R.id.nested_scroll_text_view) }

    val snackbar: KSnackbar = KSnackbar()
}
