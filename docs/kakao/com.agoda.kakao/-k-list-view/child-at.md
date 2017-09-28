---
title: KListView.childAt - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KListView](index.html) / [childAt](.)

# childAt

`inline fun <reified T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> childAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Performs given actions/assertion on child at given position

### Parameters

`T` - Type of item at given position. Must be registered via constructor.

`position` - Position of item in adapter

`function` - Tail lambda which receiver will be matched item with given type T