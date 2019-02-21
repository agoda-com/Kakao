[kakao](../../index.md) / [com.agoda.kakao.list](../index.md) / [KListView](index.md) / [lastChild](./last-child.md)

# lastChild

`inline fun <reified T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> lastChild(function: `[`T`](last-child.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Performs given actions/assertion on last child in adapter

### Parameters

`T` - Type of item at last position. Must be registered via constructor.

`function` - Tail lambda which receiver will be matched item with given type T