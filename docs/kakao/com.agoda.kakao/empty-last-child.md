---
title: emptyLastChild - kakao
---

[kakao](../index.html) / [com.agoda.kakao](index.html) / [emptyLastChild](.)

# emptyLastChild

`fun `[`KRecyclerView`](-k-recycler-view/index.html)`.emptyLastChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls lastChild() on your view with base child

Calls lastChild() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`tail` - Lambda with KEmptyRecyclerItem receiver

**See Also**

[KEmptyRecyclerItem](-k-empty-recycler-item/index.html)

`fun `[`KListView`](-k-list-view/index.html)`.emptyLastChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls lastChild() on your view with base child

Calls lastChild() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`tail` - Lambda with KEmptyAdapterItem receiver

**See Also**

[KEmptyAdapterItem](-k-empty-adapter-item/index.html)

