package com.agoda.kakao.scroll

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
* View with ScrollViewActions and BaseAssertions
*
* @see ScrollViewActions
* @see BaseAssertions
*/
class KScrollView : KBaseView<KScrollView>, ScrollViewActions, BaseAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
