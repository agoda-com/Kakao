[kakao](../../index.md) / [com.agoda.kakao.web](../index.md) / [WebElementBuilder](./index.md)

# WebElementBuilder

`class WebElementBuilder : `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>`

Class for building WebView element matchers

### Parameters

`web` - WebInteraction where elements should be matched

### Types

| Name | Summary |
|---|---|
| [KWebInteraction](-k-web-interaction/index.md) | `inner class KWebInteraction : `[`WebActions`](../-web-actions/index.md)`, `[`WebAssertions`](../-web-assertions/index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WebElementBuilder(view: `[`WebInteractionDelegate`](../../com.agoda.kakao.delegate/-web-interaction-delegate/index.md)`)`<br>Class for building WebView element matchers |

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `val view: `[`WebInteractionDelegate`](../../com.agoda.kakao.delegate/-web-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [withElement](with-element.md) | `fun withElement(locator: Locator, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, interaction: `[`WebElementBuilder.KWebInteraction`](-k-web-interaction/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Looks up web view element and performs actions/assertions on it |

### Inherited Functions

| Name | Summary |
|---|---|
| [intercept](../../com.agoda.kakao.intercept/-interceptable/intercept.md) | `open fun intercept(builder: `[`Interceptor.Builder`](../../com.agoda.kakao.intercept/-interceptor/-builder/index.md)`<`[`INTERACTION`](../../com.agoda.kakao.intercept/-interceptable/index.md#INTERACTION)`, `[`ASSERTION`](../../com.agoda.kakao.intercept/-interceptable/index.md#ASSERTION)`, `[`ACTION`](../../com.agoda.kakao.intercept/-interceptable/index.md#ACTION)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptors for the instance. Interceptors will be invoked on the interaction with the KView. |
| [reset](../../com.agoda.kakao.intercept/-interceptable/reset.md) | `open fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes the interceptors from the instance. |
