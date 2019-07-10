[kakao](../../index.md) / [com.agoda.kakao.delegate](../index.md) / [Delegate](index.md) / [interceptCheck](./intercept-check.md)

# interceptCheck

`open fun interceptCheck(assertion: `[`ASSERTION`](index.md#ASSERTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Runs the interceptors available for the given delegate during the `check` operation.

**Return**
`true` if the call chain has been interrupted and there is no need to do Espresso call,
    false otherwise.

