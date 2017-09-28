---
title: KAdapterItemTypeBuilder - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KAdapterItemTypeBuilder](.)

# KAdapterItemTypeBuilder

`class KAdapterItemTypeBuilder`

Class that maps types to providing functions

To be able to support different item types in KListView, this class
adds support for mapping item type classes to functions that provide them.
KEmptyAdapterItem is added by default.

**See Also**

[itemType](item-type.html)

[KEmptyAdapterItem](../-k-empty-adapter-item/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `KAdapterItemTypeBuilder()`<br>Class that maps types to providing functions |

### Properties

| [itemTypes](item-types.html) | `val itemTypes: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>>, `[`KAdapterItemType`](../-k-adapter-item-type/index.html)`<`[`KAdapterItem`](../-k-adapter-item/index.html)`<*>>>` |

### Functions

| [itemType](item-type.html) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> itemType(provideItem: (DataInteraction) -> T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds entry that helps KListView to automatically build child views |

