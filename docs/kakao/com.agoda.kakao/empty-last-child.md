[kakao](../index.md) / [com.agoda.kakao](index.md) / [emptyLastChild](.)

# emptyLastChild

`fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyLastChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls lastChild() on your view with base child

Calls lastChild() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`tail` - Lambda with KEmptyRecyclerItem receiver

**See Also**

[KEmptyRecyclerItem](-k-empty-recycler-item/index.md)

`fun `[`KListView`](-k-list-view/index.md)`.emptyLastChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls lastChild() on your view with base child

Calls lastChild() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`tail` - Lambda with KEmptyAdapterItem receiver

**See Also**

[KEmptyAdapterItem](-k-empty-adapter-item/index.md)

