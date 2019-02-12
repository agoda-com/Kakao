package com.agoda.kakao.views

import android.view.View
import org.hamcrest.Matcher

/**
 * For internal use. Don't use manually.
 *
 * Holds type and corresponding provider function
 */
class KRecyclerItemType<out T : KRecyclerItem<*>>(val provideItem: (Matcher<View>) -> T)