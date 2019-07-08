@file:Suppress("unused")

package com.agoda.kakao.common.assertions

import com.agoda.kakao.delegate.ViewInteractionDelegate

/**
 * Provides assertions for view with adapters
 *
 * @see com.agoda.kakao.recycler.RecyclerAdapterAssertions
 * @see com.agoda.kakao.list.AbsListViewAdapterAssertions
 */
interface AdapterAssertions {
    val view: ViewInteractionDelegate
}