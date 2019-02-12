package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.TabLayoutActions
import com.agoda.kakao.assertions.TabLayoutAssertions
import com.agoda.kakao.builders.ViewBuilder
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