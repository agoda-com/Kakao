---
title: RecyclerActions.scrollTo - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [RecyclerActions](index.html) / [scrollTo](.)

# scrollTo

`open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Overrides [ScrollableActions.scrollTo](../-scrollable-actions/scroll-to.html)

Scrolls to the specific position of the view

### Parameters

`position` - Scrolling destination`open fun scrollTo(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Scrolls to specific view holder that matches given matcher

### Parameters

`matcher` - Matcher for view holder, which is scroll destination`open fun scrollTo(viewBuilder: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Scrolls to specific view holder that matches given matcher

### Parameters

`viewBuilder` - Builder that will be used to match view to scroll