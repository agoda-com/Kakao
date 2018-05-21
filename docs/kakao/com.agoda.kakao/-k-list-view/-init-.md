[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KListView](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`KListView(builder: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KAdapterItemTypeBuilder`](../-k-adapter-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with view interaction from given ViewBuilder

### Parameters

`builder` - ViewBuilder which will result in view's interaction

`itemTypeBuilder` - Lambda with receiver where you pass your item providers

**See Also**

[ViewBuilder](../-view-builder/index.md)

`KListView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, builder: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KAdapterItemTypeBuilder`](../-k-adapter-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

`parent` - Matcher that will be used as parent in isDescendantOfA() matcher

`builder` - ViewBuilder which will result in view's interaction

`itemTypeBuilder` - Lambda with receiver where you pass your item providers

**See Also**

[ViewBuilder](../-view-builder/index.md)

`KListView(parent: DataInteraction, builder: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KAdapterItemTypeBuilder`](../-k-adapter-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

`parent` - DataInteraction that will be used as parent to ViewBuilder

`builder` - ViewBuilder which will result in view's interaction

`itemTypeBuilder` - Lambda with receiver where you pass your item providers

**See Also**

[ViewBuilder](../-view-builder/index.md)

