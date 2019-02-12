package com.agoda.kakao.views

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.actions.RatingBarActions
import com.agoda.kakao.assertions.RatingBarAssertions
import com.agoda.kakao.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View with RatingBarActions and RatingBarAssertions
 *
 * @see RatingBarActions
 * @see RatingBarAssertions
 */
class KRatingBar : KBaseView<KRatingBar>, RatingBarActions, RatingBarAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}