package com.agoda.sample.screen

import android.util.Log
import com.agoda.kakao.common.views.KView
import com.agoda.kakao.progress.KSeekBar
import com.agoda.kakao.rating.KRatingBar
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KSnackbar
import com.agoda.kakao.text.KTextView
import com.agoda.sample.R

open class ConfiguratorTestActivityScreen : Screen<ConfiguratorTestActivityScreen>() {
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

    init {
        configure {
            onViewInteraction(override = true) { viewInteraction ->
                onPerform { viewAction ->
                    Log.i("Intercept__", "action=${viewAction.description}")
                    viewInteraction.perform(viewAction)
                }
            }
        }
        content.configure {
            onViewInteraction(override = true) { viewInteraction ->
                onCheck { viewAssertion ->
                    Log.i("Intercept___", "check=$viewAssertion")
                    viewInteraction.check(viewAssertion)
                }
            }
        }
    }

}