[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KRecyclerView](index.md) / [firstChild](.)

# firstChild

`inline fun <reified T : `[`KRecyclerItem`](../-k-recycler-item/index.md)`<*>> firstChild(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Performs given actions/assertion on first child in adapter

### Parameters

`T` - Type of item at first position. Must be registered via constructor.

`function` - Tail lambda which receiver will be matched item with given type T