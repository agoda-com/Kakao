---
title: emptyFirstChild - kakao
---

[kakao](../index.html) / [com.agoda.kakao](index.html) / [emptyFirstChild](.)

# emptyFirstChild

`fun `[`KRecyclerView`](-k-recycler-view/index.html)`.emptyFirstChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls firstChild() on your view with base child

Calls firstChild() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`tail` - Lambda with KEmptyRecyclerItem receiver

**See Also**

[KEmptyRecyclerItem](-k-empty-recycler-item/index.html)

`fun `[`KListView`](-k-list-view/index.html)`.emptyFirstChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls firstChild() on your view with base child

Calls firstChild() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`tail` - Lambda with KEmptyAdapterItem receiver

**See Also**

[KEmptyAdapterItem](-k-empty-adapter-item/index.html)

