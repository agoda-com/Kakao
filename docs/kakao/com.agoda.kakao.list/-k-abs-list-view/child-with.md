[kakao](../../index.md) / [com.agoda.kakao.list](../index.md) / [KAbsListView](index.md) / [childWith](./child-with.md)

# childWith

`inline fun <reified T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> childWith(childMatcher: `[`DataBuilder`](../-data-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](child-with.md#T)

Performs given actions/assertion on child that matches given matcher

### Parameters

`T` - Type of item at given position. Must be registered via constructor.

`childMatcher` - Matcher for item in adapter

**Return**
Item with type T. To make actions/assertions on it immediately, use perform() infix function.

