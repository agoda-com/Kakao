[kakao](../../index.md) / [com.agoda.kakao.pager2](../index.md) / [KViewPager2](index.md) / [childAt](./child-at.md)

# childAt

`inline fun <reified T : `[`KViewPagerItem`](../-k-view-pager-item/index.md)`<*>> childAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, function: `[`T`](child-at.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Performs given actions/assertion on child at given position

### Parameters

`T` - Type of item at given position. Must be registered via constructor.

`position` - Position of item in adapter

`function` - Tail lambda which receiver will be matched item with given type T