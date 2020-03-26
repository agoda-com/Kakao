[kakao](../../index.md) / [com.agoda.kakao.pager2](../index.md) / [KViewPagerItemTypeBuilder](./index.md)

# KViewPagerItemTypeBuilder

`class KViewPagerItemTypeBuilder`

Class that maps types to providing functions

To be able to support different item types in KViewPager2, this class
adds support for mapping item type classes to functions that provide them.
KEmptyViewPagerItem is added by default.

**See Also**

[itemType](item-type.md)

[KEmptyViewPagerItem](../-k-empty-view-pager-item/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KViewPagerItemTypeBuilder()`<br>Class that maps types to providing functions |

### Properties

| Name | Summary |
|---|---|
| [itemTypes](item-types.md) | `val itemTypes: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KViewPagerItem`](../-k-view-pager-item/index.md)`<*>>, `[`KViewPagerItemType`](../-k-view-pager-item-type/index.md)`<`[`KViewPagerItem`](../-k-view-pager-item/index.md)`<*>>>` |

### Functions

| Name | Summary |
|---|---|
| [itemType](item-type.md) | `fun <T : `[`KViewPagerItem`](../-k-view-pager-item/index.md)`<*>> itemType(provideItem: (Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`T`](item-type.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds entry that helps KViewPager2 to automatically build child views |
