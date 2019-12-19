package com.agoda.sample.screen

import com.agoda.kakao.chipgroup.KChipGroup
import com.agoda.kakao.screen.Screen
import com.agoda.sample.R

class ChipGroupActivityScreen : Screen<ChipGroupActivityScreen>() {
    val chipGroup = KChipGroup { withId(R.id.chip_group) }
}
