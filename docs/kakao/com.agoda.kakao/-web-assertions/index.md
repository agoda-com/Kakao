[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [WebAssertions](.)

# WebAssertions

`interface WebAssertions`

Interface that provides assertions for WebViews

### Properties

| Name | Summary |
|---|---|
| [ref](ref.md) | `abstract val ref: Atom<ElementReference>` |
| [web](web.md) | `abstract val web: WebInteraction<*>` |

### Functions

| Name | Summary |
|---|---|
| [containsText](contains-text.md) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element contains given text |
| [hasText](has-text.md) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element has given text |
| [matches](matches.md) | `open fun <T> matches(value: Atom<T>, matcher: Matcher<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element matches given matcher |

### Inheritors

| Name | Summary |
|---|---|
| [KWebInteraction](../-web-element-builder/-k-web-interaction/index.md) | `inner class KWebInteraction : `[`WebActions`](../-web-actions/index.md)`, WebAssertions` |
