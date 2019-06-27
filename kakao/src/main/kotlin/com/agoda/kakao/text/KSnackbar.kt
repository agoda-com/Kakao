@file:Suppress("unused")

package com.agoda.kakao.text
import androidx.appcompat.widget.AppCompatButton
import com.agoda.kakao.R
import com.agoda.kakao.common.views.KBaseView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout

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
        isInstanceOf(AppCompatButton::class.java)
    }
}
