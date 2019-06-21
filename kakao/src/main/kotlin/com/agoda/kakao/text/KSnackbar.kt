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
        withResourceName("snackbar_text")
    }

    val action = KButton {
        isDescendantOfA { isInstanceOf(Snackbar.SnackbarLayout::class.java) }
        withResourceName("snackbar_action")
    }
}
