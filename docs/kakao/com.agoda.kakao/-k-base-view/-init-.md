---
title: KBaseView.<init> - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KBaseView](index.html) / [&lt;init&gt;](.)

# &lt;init&gt;

`KBaseView(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with view interaction from given ViewBuilder

### Parameters

`function` - ViewBuilder which will result in view's interaction

**See Also**

[ViewBuilder](../-view-builder/index.html)

`KBaseView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

`parent` - Matcher that will be used as parent in isDescendantOfA() matcher

`function` - ViewBuilder which will result in view's interaction

**See Also**

[ViewBuilder](../-view-builder/index.html)

`KBaseView(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

`parent` - DataInteraction that will be used as parent to ViewBuilder

`function` - ViewBuilder which will result in view's interaction

**See Also**

[ViewBuilder](../-view-builder/index.html)

