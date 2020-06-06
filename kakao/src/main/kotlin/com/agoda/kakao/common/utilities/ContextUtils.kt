package com.agoda.kakao.common.utilities

import android.content.Context
import androidx.annotation.StringRes
import androidx.test.platform.app.InstrumentationRegistry

fun getResourceString(@StringRes resId: Int): String {
    val targetContext: Context = InstrumentationRegistry.getInstrumentation().targetContext
    return targetContext.resources.getString(resId)
}