[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [Kakao](./index.md)

# Kakao

`object Kakao`

### Functions

| Name | Summary |
|---|---|
| [intercept](intercept.md) | `fun intercept(configurator: `[`Interceptor.Configurator`](../../com.agoda.kakao.intercept/-interceptor/-configurator/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptors for the whole Kakao runtime. Interceptors will be invoked on all of the interactions with the KView instances. |
| [invoke](invoke.md) | `operator fun invoke(function: `[`Kakao`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [reset](reset.md) | `fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes the interceptors from the Kakao runtime. |
