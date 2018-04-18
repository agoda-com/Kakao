[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KAdapterItemTypeBuilder](index.md) / [itemType](./item-type.md)

# itemType

`inline fun <reified T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> itemType(noinline provideItem: (DataInteraction) -> `[`T`](item-type.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Adds entry that helps KListView to automatically build child views

To make it work, you need to pass here function (lambda, constructor), that takes matcher and returns
instance of your item type. In this case, matcher actually matches your KListView and additional
matchers that were used (in firstChild(), childAt(), etc.)

### Parameters

`provideItem` - Function that takes data interaction of list view and returns instance of item view