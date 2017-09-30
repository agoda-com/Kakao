[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KAdapterItemTypeBuilder](.)

# KAdapterItemTypeBuilder

`class KAdapterItemTypeBuilder`

Class that maps types to providing functions

To be able to support different item types in KListView, this class
adds support for mapping item type classes to functions that provide them.
KEmptyAdapterItem is added by default.

**See Also**

[itemType](item-type.md)

[KEmptyAdapterItem](../-k-empty-adapter-item/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KAdapterItemTypeBuilder()`<br>Class that maps types to providing functions |

### Properties

| Name | Summary |
|---|---|
| [itemTypes](item-types.md) | `val itemTypes: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>>, `[`KAdapterItemType`](../-k-adapter-item-type/index.md)`<`[`KAdapterItem`](../-k-adapter-item/index.md)`<*>>>` |

### Functions

| Name | Summary |
|---|---|
| [itemType](item-type.md) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> itemType(provideItem: (DataInteraction) -> T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds entry that helps KListView to automatically build child views |
