[kakao](../../../index.md) / [com.agoda.kakao.intercept](../../index.md) / [Interceptor](../index.md) / [Builder](./index.md)

# Builder

`class Builder<INTERACTION, ASSERTION, ACTION>`

Builder class that is used to build a single instance of [Interceptor](../index.md).

**See Also**

[Interceptor](../index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Builder()`<br>Builder class that is used to build a single instance of [Interceptor](../index.md). |

### Functions

| Name | Summary |
|---|---|
| [onAll](on-all.md) | `fun onAll(isOverride: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, interceptor: (`[`INTERACTION`](index.md#INTERACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptor for the `check` and `perform` operations for a given interaction. If overridden, breaks the call chain of operation and transfers the responsibility to invoke the Espresso on the developer. |
| [onCheck](on-check.md) | `fun onCheck(isOverride: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, interceptor: (`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptor for the `check` operation for a given interaction. If overridden, breaks the call chain of operation and transfers the responsibility to invoke the Espresso on the developer. |
| [onPerform](on-perform.md) | `fun onPerform(isOverride: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, interceptor: (`[`INTERACTION`](index.md#INTERACTION)`, `[`ACTION`](index.md#ACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptor for the `perform` operation for a given interaction. If overridden, breaks the call chain of operation and transfers the responsibility to invoke the Espresso on the developer. |
