@file:Suppress("unused")

package com.agoda.kakao.drawer

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with DrawerActions and BaseAssertions
 *
 * @see DrawerActions
 * @see com.agoda.kakao.common.assertions.BaseAssertions
 */
class KDrawerView : KBaseView<KDrawerView>, DrawerActions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
