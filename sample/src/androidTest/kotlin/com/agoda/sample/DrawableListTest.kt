package com.agoda.sample

import androidx.core.content.res.ResourcesCompat
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.DrawableListScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DrawableListTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(DrawableListActivity::class.java)

    private val appContext get() = rule.activity.applicationContext

    @Test
    fun matchDrawablesInList() {
        onScreen<DrawableListScreen> {
            list {
                isVisible()
                hasSize(2)

                firstChild<DrawableListScreen.Item> {
                    isVisible()
                    imageView {
                        hasDrawable(R.drawable.ic_android_black_24dp)
                    }
                }

                childAt<DrawableListScreen.Item>(1) {
                    imageView {
                        val drawable = ResourcesCompat.getDrawable(
                            appContext.resources,
                            R.drawable.ic_sentiment_very_satisfied_black_24dp,
                            appContext.theme
                        )
                        hasDrawable(drawable!!)
                    }
                }
            }
        }
    }
}
