[kakao](../../index.md) / [com.agoda.kakao.recycler](../index.md) / [KRecyclerItemTypeBuilder](./index.md)

# KRecyclerItemTypeBuilder

`class KRecyclerItemTypeBuilder`

Class that maps types to providing functions

To be able to support different item types in KRecyclerView, this class
adds support for mapping item type classes to functions that provide them.
KEmptyRecyclerItem is added by default.

**See Also**

[itemType](item-type.md)

[KEmptyRecyclerItem](../-k-empty-recycler-item/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KRecyclerItemTypeBuilder()`<br>Class that maps types to providing functions |

### Properties

| Name | Summary |
|---|---|
| [itemTypes](item-types.md) | `val itemTypes: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KRecyclerItem`](../-k-recycler-item/index.md)`<*>>, `[`KRecyclerItemType`](../-k-recycler-item-type/index.md)`<`[`KRecyclerItem`](../-k-recycler-item/index.md)`<*>>>` |

### Functions

| Name | Summary |
|---|---|
| [itemType](item-type.md) | `fun <T : `[`KRecyclerItem`](../-k-recycler-item/index.md)`<*>> itemType(provideItem: (Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`T`](item-type.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds entry that helps KRecyclerView to automatically build child views |
