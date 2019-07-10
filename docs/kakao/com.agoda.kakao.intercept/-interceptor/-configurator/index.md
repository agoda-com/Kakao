[kakao](../../../index.md) / [com.agoda.kakao.intercept](../../index.md) / [Interceptor](../index.md) / [Configurator](./index.md)

# Configurator

`class Configurator`

Configuration class that is used for building interceptors on the
[Kakao](../../../com.agoda.kakao/-kakao/index.md) runtime and [Screen](../../../com.agoda.kakao.screen/-screen/index.md) levels.

**See Also**

[com.agoda.kakao.Kakao](../../../com.agoda.kakao/-kakao/index.md)

[com.agoda.kakao.screen.Screen](../../../com.agoda.kakao.screen/-screen/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Configurator()`<br>Configuration class that is used for building interceptors on the [Kakao](../../../com.agoda.kakao/-kakao/index.md) runtime and [Screen](../../../com.agoda.kakao.screen/-screen/index.md) levels. |

### Functions

| Name | Summary |
|---|---|
| [onDataInteraction](on-data-interaction.md) | `fun onDataInteraction(builder: `[`Interceptor.Builder`](../-builder/index.md)`<DataInteraction, ViewAssertion, ViewAction>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Setups the interceptor for `check` and `perform` operations happening through [DataInteraction](#) |
| [onViewInteraction](on-view-interaction.md) | `fun onViewInteraction(builder: `[`Interceptor.Builder`](../-builder/index.md)`<ViewInteraction, ViewAssertion, ViewAction>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Setups the interceptor for `check` and `perform` operations happening through [ViewInteraction](#) |
| [onWebInteraction](on-web-interaction.md) | `fun onWebInteraction(builder: `[`Interceptor.Builder`](../-builder/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Setups the interceptor for `check` and `perform` operations happening through [Web.WebInteraction](#) |
