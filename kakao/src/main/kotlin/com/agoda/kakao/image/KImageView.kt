@file:Suppress("unused")

package com.agoda.kakao.image

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with BaseActions and ImageViewAssertions
 *
 * @see com.agoda.kakao.common.actions.BaseActions
 * @see ImageViewAssertions
 */
class KImageView : KBaseView<KImageView>, ImageViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
