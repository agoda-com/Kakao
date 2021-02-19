package com.agoda.sample

import android.app.Activity
import android.content.Context
import androidx.core.content.res.ResourcesCompat
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.sample.screen.DrawableRecyclerScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DrawableRecyclerTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(DrawableRecyclerActivity::class.java)

    private val appContext : Context
        get() {
        var activity: Activity? = null
        rule.scenario.onActivity {
            activity = it
        }
        return activity!!.applicationContext
    }

    @Test
    fun matchDrawablesInRecyclerView() {
        onScreen<DrawableRecyclerScreen> {
            list {
                isVisible()
                hasSize(3)

                firstChild<DrawableRecyclerScreen.Item> {
                    isVisible()
                    imageView {
                        hasDrawable(R.drawable.ic_android_black_24dp)
                    }
                }

                childAt<DrawableRecyclerScreen.Item>(1) {
                    imageView {
                        val drawable = ResourcesCompat.getDrawable(
                            appContext.resources,
                            R.drawable.ic_sentiment_very_satisfied_black_24dp,
                            appContext.theme
                        )
                        hasDrawable(drawable!!)
                    }
                }

                childAt<DrawableRecyclerScreen.Item>(2) {
                    imageView {
                        isVisible()
                        hasDrawableWithTint(R.drawable.ic_android_black_24dp, android.R.color.holo_red_dark)
                    }
                }
            }
        }
    }
}
