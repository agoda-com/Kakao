---
title: emptyChildWith - kakao
---

[kakao](../index.html) / [com.agoda.kakao](index.html) / [emptyChildWith](.)

# emptyChildWith

`fun `[`KRecyclerView`](-k-recycler-view/index.html)`.emptyChildWith(builder: `[`ViewBuilder`](-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)

Calls childWith() on your view with base child

Calls childWith() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`builder` - View builder that will match the child view

**Return**
Matched KEmptyRecyclerItem

**See Also**

[KEmptyRecyclerItem](-k-empty-recycler-item/index.html)

`fun `[`KListView`](-k-list-view/index.html)`.emptyChildWith(builder: `[`DataBuilder`](-data-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)

Calls childWith() on your view with base child

Calls childWith() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`builder` - Data builder that will match the child view

**Return**
Matched KEmptyAdapterItem

**See Also**

[KEmptyAdapterItem](-k-empty-adapter-item/index.html)

