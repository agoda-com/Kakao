package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.NavigationViewActions
import com.agoda.kakao.assertions.NavigationViewAssertions
import com.agoda.kakao.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View with NavigationViewActions and NavigationViewAssertions
 *
 * @see NavigationViewActions
 * @see NavigationViewAssertions
 */
class KNavigationView : KBaseView<KNavigationView>, NavigationViewActions, NavigationViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}