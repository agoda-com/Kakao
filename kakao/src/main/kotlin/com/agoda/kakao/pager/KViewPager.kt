@file:Suppress("unused")

package com.agoda.kakao.pager

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.common.actions.SwipeableActions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with SwipeableActions and ViewPagerAssertions
 *
 * @see SwipeableActions
 * @see ViewPagerAssertions
 */
class KViewPager : KBaseView<KViewPager>, SwipeableActions, ViewPagerAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}