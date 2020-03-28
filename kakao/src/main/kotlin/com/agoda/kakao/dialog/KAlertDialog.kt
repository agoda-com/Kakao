package com.agoda.kakao.dialog

import android.app.AlertDialog
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView

/**
 * View for interact with default alert dialog
 *
 * @see AlertDialog
 */
class KAlertDialog : KBaseView<KAlertDialog>({ isRoot() }) {

    init {
        inRoot { isDialog() }
    }

    val positiveButton = KButton { withId(android.R.id.button1) }
        .also { it.inRoot { isDialog() } }

    val negativeButton = KButton { withId(android.R.id.button2) }
        .also { it.inRoot { isDialog() } }

    val neutralButton = KButton { withId(android.R.id.button3) }
        .also { it.inRoot { isDialog() } }

    val title = KTextView { withResourceName("alertTitle")}
        .also { it.inRoot { isDialog() } }

    val message = KTextView { withId(android.R.id.message) }
        .also { it.inRoot { isDialog() } }

    val icon = KImageView { withId(android.R.id.icon) }
        .also { it.inRoot { isDialog() } }
}
