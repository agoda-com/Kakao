[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [WebElementBuilder](.)

# WebElementBuilder

`class WebElementBuilder`

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
| [&lt;init&gt;](-init-.md) | `WebElementBuilder(web: WebInteraction<*>)`<br>Class for building WebView element matchers |

### Functions

| Name | Summary |
|---|---|
| [withElement](with-element.md) | `fun withElement(locator: Locator, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, interaction: `[`KWebInteraction`](-k-web-interaction/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Looks up web view element and performs actions/assertions on it |
