[kakao](../../../index.md) / [com.agoda.kakao.intercept](../../index.md) / [Interceptor](../index.md) / [Builder](index.md) / [onAll](./on-all.md)

# onAll

`fun onAll(isOverride: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, interceptor: (`[`INTERACTION`](index.md#INTERACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Sets the interceptor for the `check` and `perform` operations for a given interaction.
If overridden, breaks the call chain of operation and transfers the responsibility
to invoke the Espresso on the developer.

This interceptor is prioritized and is being invoked first for both operations.

### Parameters

`isOverride` - if `true` - breaks the call chain, false otherwise

`interceptor` - lambda with intercepting logic