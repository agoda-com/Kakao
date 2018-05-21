package com.agoda.sample.screen

import android.app.Activity
import android.content.Intent
import com.agoda.kakao.KButton
import com.agoda.kakao.KIntent
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.agoda.sample.R

class IntentActivityScreen : Screen<IntentActivityScreen>() {
    val resultText = KTextView { withId(R.id.result_text) }
    val startActivityButton = KButton { withId(R.id.intent_button) }
    val startActivityForResultButton = KButton { withId(R.id.intent_result_button) }

    val normalIntent = KIntent {
        hasAction("ACTION_TEST")
        hasCategories("TEST")
        hasFlag(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        hasExtra("test", "test")
    }

    val okResultIntent = KIntent {
        hasAction("ACTION_TEST_RESULT")
        hasCategories("TEST_RESULT")
        hasFlag(Intent.FLAG_ACTIVITY_NO_ANIMATION)

        hasExtras {
            hasEntry("test", "test")
            hasEntry("test2", "test2")
        }

        withResult {
            withCode(Activity.RESULT_OK)
            withData(Intent().apply { putExtra("text", "SUCCESS") })
        }
    }

    val errorResultIntent = KIntent {
        hasAction("ACTION_TEST_RESULT")
        hasCategories("TEST_RESULT")
        hasFlag(Intent.FLAG_ACTIVITY_NO_ANIMATION)

        hasExtras {
            hasEntry("test", "test")
            hasEntry("test2", "test2")
        }

        withResult {
            withCode(Activity.RESULT_CANCELED)
        }
    }
}