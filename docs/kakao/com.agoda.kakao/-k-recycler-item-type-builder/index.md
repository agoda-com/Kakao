---
title: KRecyclerItemTypeBuilder - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KRecyclerItemTypeBuilder](.)

# KRecyclerItemTypeBuilder

`class KRecyclerItemTypeBuilder`

Class that maps types to providing functions

To be able to support different item types in KRecyclerView, this class
adds support for mapping item type classes to functions that provide them.
KEmptyRecyclerItem is added by default.

**See Also**

[itemType](item-type.html)

[KEmptyRecyclerItem](../-k-empty-recycler-item/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `KRecyclerItemTypeBuilder()`<br>Class that maps types to providing functions |

### Properties

| [itemTypes](item-types.html) | `val itemTypes: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KRecyclerItem`](../-k-recycler-item/index.html)`<*>>, `[`KRecyclerItemType`](../-k-recycler-item-type/index.html)`<`[`KRecyclerItem`](../-k-recycler-item/index.html)`<*>>>` |

### Functions

| [itemType](item-type.html) | `fun <T : `[`KRecyclerItem`](../-k-recycler-item/index.html)`<*>> itemType(provideItem: (Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds entry that helps KRecyclerView to automatically build child views |

