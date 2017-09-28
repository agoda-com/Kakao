---
title: KListView.childWith - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KListView](index.html) / [childWith](.)

# childWith

`inline fun <reified T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> childWith(childMatcher: `[`DataBuilder`](../-data-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): T`

Performs given actions/assertion on child that matches given matcher

### Parameters

`T` - Type of item at given position. Must be registered via constructor.

`childMatcher` - Matcher for item in adapter

**Return**
Item with type T. To make actions/assertions on it immediately, use perform() infix function.

