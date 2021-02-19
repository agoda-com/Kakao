package com.agoda.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.agoda.kakao.screen.Screen
import com.agoda.sample.screen.Pager2Screen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class Pager2Test {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ViewPager2Activity::class.java)

    @Test
    fun testViewPager2() {
        Screen.onScreen<Pager2Screen> {
          pager {
              isVisible()
              hasSize(6)

              childAt<Pager2Screen.SimpleItem>(0){
                  text{
                      hasText("0")
                  }
              }

              childAt<Pager2Screen.SimpleItem>(5){
                  text{
                      hasText("5")
                  }
              }
          }
        }
    }
}
