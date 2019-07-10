[kakao](../../index.md) / [com.agoda.kakao.screen](../index.md) / [Screen](index.md) / [onScreen](./on-screen.md)

# onScreen

`inline fun <reified T : `[`Screen`](index.md)`<`[`T`](on-screen.md#T)`>> onScreen(noinline function: `[`T`](on-screen.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](on-screen.md#T)

Initializes instance of the screen class provided and invokes given tail lambda on it.

This approach helps to reduce boilerplate code and avoid have a screen instance stored in
a properties of you tests classes.

In order to use this function, your [Screen](index.md) class must have an empty primary constructor.

### Parameters

`function` - Tail lambda to be invoked on the created instance of screen.