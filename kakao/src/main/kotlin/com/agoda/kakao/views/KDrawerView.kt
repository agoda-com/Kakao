package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.DrawerActions
import com.agoda.kakao.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View with DrawerActions and BaseAssertions
 *
 * @see DrawerActions
 * @see BaseAssertions
 */
class KDrawerView : KBaseView<KDrawerView>, DrawerActions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}