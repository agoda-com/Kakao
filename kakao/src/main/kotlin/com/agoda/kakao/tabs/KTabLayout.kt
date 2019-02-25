@file:Suppress("unused")

package com.agoda.kakao.tabs

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with TabLayoutActions and TabLayoutAssertions
 *
 * @see TabLayoutActions
 * @see TabLayoutAssertions
 */
class KTabLayout : KBaseView<KTabLayout>, TabLayoutActions, TabLayoutAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}