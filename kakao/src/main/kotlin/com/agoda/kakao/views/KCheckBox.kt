package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.CheckableActions
import com.agoda.kakao.assertions.CheckableAssertions
import com.agoda.kakao.assertions.TextViewAssertions
import com.agoda.kakao.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View with CheckableActions, CheckableAssertions and TextViewAssertions
 *
 * @see CheckableActions
 * @see CheckableAssertions
 * @see TextViewAssertions
 */
class KCheckBox : KBaseView<KCheckBox>, CheckableActions, TextViewAssertions, CheckableAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}