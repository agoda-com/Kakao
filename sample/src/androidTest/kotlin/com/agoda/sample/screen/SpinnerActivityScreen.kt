package com.agoda.sample.screen

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.spinner.KSpinner
import com.agoda.kakao.spinner.KSpinnerItem
import com.agoda.sample.R

class SpinnerActivityScreen : Screen<SpinnerActivityScreen>() {
    val spinner = KSpinner(
        builder = { withId(R.id.spinner) },
        itemTypeBuilder = { itemType(::KSpinnerItem) }
    )

}
