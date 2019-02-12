package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.BottomNavigationViewActions
import com.agoda.kakao.assertions.BottomNavigationViewAssertions
import com.agoda.kakao.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View for acting and asserting on BottomNavigationView
 *
 * @see BottomNavigationViewActions
 * @see BottomNavigationViewAssertions
 */
class KBottomNavigationView : KBaseView<KBottomNavigationView>,
        BottomNavigationViewActions, BottomNavigationViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}