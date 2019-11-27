@file:Suppress("unused")

package com.agoda.kakao.actionbar

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View for acting and asserting on BottomNavigationView
 *
 * @see ActionBarViewActions
 * @see ActionBarViewAssertions
 */
class KActionBar : KBaseView<KActionBar>,
    ActionBarViewActions, ActionBarViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
