[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KRecyclerItemTypeBuilder](index.md) / [itemType](./item-type.md)

# itemType

`inline fun <reified T : `[`KRecyclerItem`](../-k-recycler-item/index.md)`<*>> itemType(noinline provideItem: (Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`T`](item-type.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Adds entry that helps KRecyclerView to automatically build child views

To make it work, you need to pass here function (lambda, constructor), that takes matcher and returns
instance of your item type. In this case, matcher actually matches root view of your adapter item.

### Parameters

`provideItem` - Function that takes matcher of item's root view and returns instance of item view