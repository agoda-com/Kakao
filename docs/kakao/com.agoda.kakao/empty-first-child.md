[kakao](../index.md) / [com.agoda.kakao](index.md) / [emptyFirstChild](.)

# emptyFirstChild

`fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyFirstChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls firstChild() on your view with base child

Calls firstChild() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`tail` - Lambda with KEmptyRecyclerItem receiver

**See Also**

[KEmptyRecyclerItem](-k-empty-recycler-item/index.md)

`fun `[`KListView`](-k-list-view/index.md)`.emptyFirstChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls firstChild() on your view with base child

Calls firstChild() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`tail` - Lambda with KEmptyAdapterItem receiver

**See Also**

[KEmptyAdapterItem](-k-empty-adapter-item/index.md)

