package com.agoda.sample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.image.KImageView
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DrawableMatcherIssueTest {

    @get:Rule
    var rule: ActivityTestRule<DrawableMatcherIssueActivity> = ActivityTestRule(DrawableMatcherIssueActivity::class.java)

    @Test
    fun myTest() {
        KImageView {
            withId(R.id.image)
        }.hasDrawable(R.drawable.ic_menu)
    }
}
