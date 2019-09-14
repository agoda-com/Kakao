@file:Suppress("unused")

package com.agoda.kakao.edit

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.TextViewAssertions
import org.hamcrest.Matcher

/**
 * View with EditableActions and TextViewAssertions
 *
 * @see EditableActions
 * @see TextViewAssertions
 */
class KEditText : KBaseView<KEditText>, EditableActions, TextViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
