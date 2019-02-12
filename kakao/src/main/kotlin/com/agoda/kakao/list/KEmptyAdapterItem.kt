package com.agoda.kakao.list

import android.support.test.espresso.DataInteraction

/**
 * Empty implementation of KAdapterItem
 *
 * Use this if you want to perform/assert on the root view of adapter item
 *
 * @param parent Matcher of the root view of adapter item
 * @see KAdapterItem
 */
class KEmptyAdapterItem(parent: DataInteraction) : KAdapterItem<KEmptyAdapterItem>(parent)