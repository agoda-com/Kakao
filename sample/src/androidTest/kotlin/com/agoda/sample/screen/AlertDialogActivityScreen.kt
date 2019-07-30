package com.agoda.sample.screen

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.dialog.KAlertDialog
import com.agoda.kakao.screen.Screen
import com.agoda.sample.R

open class AlertDialogActivityScreen : Screen<AlertDialogActivityScreen>() {
    val showAlertDialogButton = KView { withId(R.id.show_alert_dialog) }

    val alertDialog = KAlertDialog()
}
