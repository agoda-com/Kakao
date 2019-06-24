@file:Suppress("unused")

package com.agoda.kakao.text

import com.agoda.kakao.common.views.KBaseView
import com.google.android.material.snackbar.Snackbar

/**
 * View with internal TextView and a Button
 *
 * @see Snackbar
 */
class KSnackbar : KBaseView<KSnackbar>({ isInstanceOf(Snackbar.SnackbarLayout::class.java) }) {
    val text = KTextView {
        isDescendantOfA { isInstanceOf(Snackbar.SnackbarLayout::class.java) }
        withId(com.google.android.material.R.id.snackbar_text)
    }

    val action = KButton {
        isDescendantOfA { isInstanceOf(Snackbar.SnackbarLayout::class.java) }
        withId(com.google.android.material.R.id.snackbar_action)
    }
}
