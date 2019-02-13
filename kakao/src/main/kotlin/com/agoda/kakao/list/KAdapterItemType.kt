@file:Suppress("unused")

package com.agoda.kakao.list

import android.support.test.espresso.DataInteraction

/**
 * For internal use. Don't use manually.
 *
 * Holds type and corresponding provider function
 */
class KAdapterItemType<out T : KAdapterItem<*>>(val provideItem: (DataInteraction) -> T)