[kakao](../../index.md) / [com.agoda.kakao.recycler](../index.md) / [KRecyclerView](index.md) / [emptyChildWith](./empty-child-with.md)

# emptyChildWith

`fun emptyChildWith(builder: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyRecyclerItem`](../-k-empty-recycler-item/index.md)

Calls childWith() on your view with base child

Calls childWith() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

`builder` - View builder that will match the child view

**Return**
Matched KEmptyRecyclerItem

**See Also**

[KEmptyRecyclerItem](../-k-empty-recycler-item/index.md)

