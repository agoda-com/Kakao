package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.SeekBarActions
import com.agoda.kakao.assertions.ProgressBarAssertions
import com.agoda.kakao.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View with SeekBarActions and ProgressBarAssertions
 *
 * @see SeekBarActions
 * @see ProgressBarAssertions
 */
class KSeekBar : KBaseView<KSeekBar>, SeekBarActions, ProgressBarAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}