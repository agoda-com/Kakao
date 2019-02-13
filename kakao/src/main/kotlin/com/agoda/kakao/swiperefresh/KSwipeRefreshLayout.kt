@file:Suppress("unused")

package com.agoda.kakao.swiperefresh

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with SwipeRefreshLayoutActions and SwipeRefreshLayoutAssertions
 *
 * @see SwipeRefreshLayoutActions
 * @see SwipeRefreshLayoutAssertions
 */
class KSwipeRefreshLayout : KBaseView<KSwipeRefreshLayout>, SwipeRefreshLayoutActions, SwipeRefreshLayoutAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}