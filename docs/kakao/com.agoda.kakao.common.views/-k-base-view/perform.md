[kakao](../../index.md) / [com.agoda.kakao.common.views](../index.md) / [KBaseView](index.md) / [perform](./perform.md)

# perform

`infix fun perform(function: `[`T`](index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](index.md#T)

Infix function for invoking lambda on your view

Sometimes instance of view is a result of a function or constructor.
In this specific case you can't call invoke() since it will be considered as
tail lambda of your fun/constructor. In such cases please use this function.

### Parameters

`function` - Tail lambda with receiver which is your view

**Return**
This object

