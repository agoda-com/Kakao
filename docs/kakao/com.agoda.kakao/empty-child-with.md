[kakao](../index.md) / [com.agoda.kakao](index.md) / [emptyChildWith](./empty-child-with.md)

# emptyChildWith

`fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyChildWith(builder: `[`ViewBuilder`](-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)

Calls childWith() on your view with base child

Calls childWith() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`builder` - View builder that will match the child view

**Return**
Matched KEmptyRecyclerItem

**See Also**

[KEmptyRecyclerItem](-k-empty-recycler-item/index.md)

`fun `[`KListView`](-k-list-view/index.md)`.emptyChildWith(builder: `[`DataBuilder`](-data-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)

Calls childWith() on your view with base child

Calls childWith() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`builder` - Data builder that will match the child view

**Return**
Matched KEmptyAdapterItem

**See Also**

[KEmptyAdapterItem](-k-empty-adapter-item/index.md)

