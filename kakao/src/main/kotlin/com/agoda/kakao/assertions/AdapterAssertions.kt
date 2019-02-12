package com.agoda.kakao.assertions

import android.support.test.espresso.ViewInteraction

/**
 * Provides assertions for view with adapters
 *
 * @see RecyclerAdapterAssertions
 */
interface AdapterAssertions {
    val view: ViewInteraction
}