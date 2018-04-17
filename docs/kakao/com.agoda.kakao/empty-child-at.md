[kakao](../index.md) / [com.agoda.kakao](index.md) / [emptyChildAt](./empty-child-at.md)

# emptyChildAt

`fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls childAt() on your view with base child

Calls childAt() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`position` - Position of child in adapter

`tail` - Lambda with KEmptyRecyclerItem receiver

**See Also**

[KEmptyRecyclerItem](-k-empty-recycler-item/index.md)

`fun `[`KListView`](-k-list-view/index.md)`.emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls childAt() on your view with base child

Calls childAt() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`position` - Position of child in adapter

`tail` - Lambda with KEmptyAdapterItem receiver

**See Also**

[KEmptyAdapterItem](-k-empty-adapter-item/index.md)

