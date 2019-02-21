[kakao](../../index.md) / [com.agoda.kakao.list](../index.md) / [KListView](index.md) / [emptyChildAt](./empty-child-at.md)

# emptyChildAt

`fun emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Calls childAt() on your view with base child

Calls childAt() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

`position` - Position of child in adapter

`tail` - Lambda with KEmptyAdapterItem receiver

**See Also**

[KEmptyAdapterItem](../-k-empty-adapter-item/index.md)

