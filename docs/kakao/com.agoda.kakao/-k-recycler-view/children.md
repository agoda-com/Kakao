[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KRecyclerView](index.md) / [children](.)

# children

`inline fun <reified T : `[`KRecyclerItem`](../-k-recycler-item/index.md)`<*>> children(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Performs given actions/assertion on all children in adapter

### Parameters

`T` - Type of all items. Must be registered via constructor.

`function` - Tail lambda which receiver will be matched item with given type T