@file:Suppress("unused")

package com.agoda.kakao

import com.agoda.kakao.builders.DataBuilder
import com.agoda.kakao.builders.ViewBuilder

/**
 * Calls childAt() on your view with base child
 *
 * Calls childAt() on your KRecyclerView and casts received item to KEmptyRecyclerItem
 *
 * @param position Position of child in adapter
 * @param tail Lambda with KEmptyRecyclerItem receiver
 * @see KEmptyRecyclerItem
 */
fun KRecyclerView.emptyChildAt(position: Int, tail: KEmptyRecyclerItem.() -> Unit) {
    childAt(position, tail)
}

/**
 * Calls firstChild() on your view with base child
 *
 * Calls firstChild() on your KRecyclerView and casts received item to KEmptyRecyclerItem
 *
 * @param tail Lambda with KEmptyRecyclerItem receiver
 * @see KEmptyRecyclerItem
 */
fun KRecyclerView.emptyFirstChild(tail: KEmptyRecyclerItem.() -> Unit) {
    firstChild(tail)
}

/**
 * Calls lastChild() on your view with base child
 *
 * Calls lastChild() on your KRecyclerView and casts received item to KEmptyRecyclerItem
 *
 * @param tail Lambda with KEmptyRecyclerItem receiver
 * @see KEmptyRecyclerItem
 */
fun KRecyclerView.emptyLastChild(tail: KEmptyRecyclerItem.() -> Unit) {
    lastChild(tail)
}

/**
 * Calls childWith() on your view with base child
 *
 * Calls childWith() on your KRecyclerView and casts received item to KEmptyRecyclerItem
 *
 * @param builder View builder that will match the child view
 * @return Matched KEmptyRecyclerItem
 * @see KEmptyRecyclerItem
 */
fun KRecyclerView.emptyChildWith(builder: ViewBuilder.() -> Unit) = childWith<KEmptyRecyclerItem>(builder)

/**
 * Calls childAt() on your view with base child
 *
 * Calls childAt() on your KListView and casts received item to KEmptyAdapterItem
 *
 * @param position Position of child in adapter
 * @param tail Lambda with KEmptyAdapterItem receiver
 * @see KEmptyAdapterItem
 */
fun KListView.emptyChildAt(position: Int, tail: KEmptyAdapterItem.() -> Unit) {
    childAt(position, tail)
}

/**
 * Calls firstChild() on your view with base child
 *
 * Calls firstChild() on your KListView and casts received item to KEmptyAdapterItem
 *
 * @param tail Lambda with KEmptyAdapterItem receiver
 * @see KEmptyAdapterItem
 */
fun KListView.emptyFirstChild(tail: KEmptyAdapterItem.() -> Unit) {
    firstChild(tail)
}

/**
 * Calls lastChild() on your view with base child
 *
 * Calls lastChild() on your KListView and casts received item to KEmptyAdapterItem
 *
 * @param tail Lambda with KEmptyAdapterItem receiver
 * @see KEmptyAdapterItem
 */
fun KListView.emptyLastChild(tail: KEmptyAdapterItem.() -> Unit) {
    lastChild(tail)
}

/**
 * Calls childWith() on your view with base child
 *
 * Calls childWith() on your KListView and casts received item to KEmptyAdapterItem
 *
 * @param builder Data builder that will match the child view
 * @return Matched KEmptyAdapterItem
 * @see KEmptyAdapterItem
 */
fun KListView.emptyChildWith(builder: DataBuilder.() -> Unit) = childWith<KEmptyAdapterItem>(builder)