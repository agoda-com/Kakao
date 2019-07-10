[kakao](../../index.md) / [com.agoda.kakao.delegate](../index.md) / [Delegate](index.md) / [interceptPerform](./intercept-perform.md)

# interceptPerform

`open fun interceptPerform(action: `[`ACTION`](index.md#ACTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Runs the interceptors available for the given delegate during the `perform` operation.

**Return**
`true` if the call chain has been interrupted and there is no need to do Espresso call,
    false otherwise.

