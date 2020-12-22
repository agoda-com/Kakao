package com.agoda.kakao.searchview

import android.view.View
import androidx.test.espresso.DataInteraction
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

class KSearchView : KBaseView<KSearchView>, SearchViewActions, SearchViewAssertions {

	constructor(function: ViewBuilder.() -> Unit) : super(function)
	constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
	constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
