---
title: KRecyclerView.firstChild - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KRecyclerView](index.html) / [firstChild](.)

# firstChild

`inline fun <reified T : `[`KRecyclerItem`](../-k-recycler-item/index.html)`<*>> firstChild(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Performs given actions/assertion on first child in adapter

### Parameters

`T` - Type of item at first position. Must be registered via constructor.

`function` - Tail lambda which receiver will be matched item with given type T