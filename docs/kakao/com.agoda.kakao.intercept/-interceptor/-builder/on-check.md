[kakao](../../../index.md) / [com.agoda.kakao.intercept](../../index.md) / [Interceptor](../index.md) / [Builder](index.md) / [onCheck](./on-check.md)

# onCheck

`fun onCheck(isOverride: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, interceptor: (`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Sets the interceptor for the `check` operation for a given interaction.
If overridden, breaks the call chain of operation and transfers the responsibility
to invoke the Espresso on the developer.

### Parameters

`isOverride` - if `true` - breaks the call chain, false otherwise

`interceptor` - lambda with intercepting logic