[kakao](../../index.md) / [com.agoda.kakao.recycler](../index.md) / [KRecyclerView](index.md) / [emptyChildAt](./empty-child-at.md)

# emptyChildAt

`fun emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyRecyclerItem`](../-k-empty-recycler-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls childAt() on your view with base child

Calls childAt() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`position` - Position of child in adapter

`tail` - Lambda with KEmptyRecyclerItem receiver

**See Also**

[KEmptyRecyclerItem](../-k-empty-recycler-item/index.md)

