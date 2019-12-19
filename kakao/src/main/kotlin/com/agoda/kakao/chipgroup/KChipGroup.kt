package com.agoda.kakao.chipgroup

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with ChipGroupActions and ChipGroupAssertions
 *
 * @see ChipGroupActions
 * @see ChipGroupAssertions
 */
class KChipGroup : KBaseView<KChipGroup>, ChipGroupActions, ChipGroupAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
