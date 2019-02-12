package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.TextViewActions
import com.agoda.kakao.assertions.TextViewAssertions
import com.agoda.kakao.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View with BaseActions and TextViewAssertions
 *
 * @see BaseActions
 * @see TextViewActions
 * @see TextViewAssertions
 */
class KTextView : KBaseView<KTextView>, TextViewActions, TextViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}