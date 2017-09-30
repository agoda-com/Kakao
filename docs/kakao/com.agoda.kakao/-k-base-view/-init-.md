[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KBaseView](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`KBaseView(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with view interaction from given ViewBuilder

### Parameters

`function` - ViewBuilder which will result in view's interaction

**See Also**

[ViewBuilder](../-view-builder/index.md)

`KBaseView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

`parent` - Matcher that will be used as parent in isDescendantOfA() matcher

`function` - ViewBuilder which will result in view's interaction

**See Also**

[ViewBuilder](../-view-builder/index.md)

`KBaseView(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

`parent` - DataInteraction that will be used as parent to ViewBuilder

`function` - ViewBuilder which will result in view's interaction

**See Also**

[ViewBuilder](../-view-builder/index.md)

