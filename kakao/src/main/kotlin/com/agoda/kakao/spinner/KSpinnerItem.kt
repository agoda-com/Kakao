@file:Suppress("unused")

package com.agoda.kakao.spinner

import androidx.test.espresso.DataInteraction
import com.agoda.kakao.list.KAdapterItem
import com.agoda.kakao.text.KTextView
import com.agoda.kakao.text.TextViewAssertions

/**
 * KTextView implementation of KAdapterItem
 *
 * Use this if you want to perform/assert on the root view of adapter item
 *
 * @param parent Matcher of the root view of adapter item
 * @see KAdapterItem
 */
class KSpinnerItem(parent: DataInteraction) : KAdapterItem<KTextView>(parent), TextViewAssertions
