@file:Suppress("unused")

package com.agoda.kakao.text

import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
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
        isInstanceOf(AppCompatTextView::class.java)
    }

    val action = KButton {
        isDescendantOfA { isInstanceOf(Snackbar.SnackbarLayout::class.java) }
        isInstanceOf(AppCompatButton::class.java)
    }
}