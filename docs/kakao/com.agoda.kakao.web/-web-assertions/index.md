[kakao](../../index.md) / [com.agoda.kakao.web](../index.md) / [WebAssertions](./index.md)

# WebAssertions

`interface WebAssertions`

Interface that provides assertions for WebViews

### Properties

| Name | Summary |
|---|---|
| [ref](ref.md) | `abstract val ref: Atom<ElementReference>` |
| [web](web.md) | `abstract val web: `[`WebInteractionDelegate`](../../com.agoda.kakao.delegate/-web-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [containsText](contains-text.md) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element contains given text |
| [hasText](has-text.md) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element has given text |
| [matches](matches.md) | `open fun <T> matches(value: Atom<`[`T`](matches.md#T)`>, matcher: Matcher<`[`T`](matches.md#T)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element matches given matcher |

### Inheritors

| Name | Summary |
|---|---|
| [KWebInteraction](../-web-element-builder/-k-web-interaction/index.md) | `inner class KWebInteraction : `[`WebActions`](../-web-actions/index.md)`, `[`WebAssertions`](./index.md) |
