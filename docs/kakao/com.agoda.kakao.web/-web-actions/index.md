[kakao](../../index.md) / [com.agoda.kakao.web](../index.md) / [WebActions](./index.md)

# WebActions

`interface WebActions`

Provides action for interacting with WebViews

**See Also**

[WebView](#)

### Properties

| Name | Summary |
|---|---|
| [ref](ref.md) | `abstract val ref: Atom<ElementReference>` |
| [web](web.md) | `abstract val web: `[`WebInteractionDelegate`](../../com.agoda.kakao.delegate/-web-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | `open fun clear(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clears the element |
| [click](click.md) | `open fun click(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clicks on element |
| [keys](keys.md) | `open fun keys(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Input keys with element in focus |
| [scroll](scroll.md) | `open fun scroll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the element inside WebView |

### Inheritors

| Name | Summary |
|---|---|
| [KWebInteraction](../-web-element-builder/-k-web-interaction/index.md) | `inner class KWebInteraction : `[`WebActions`](./index.md)`, `[`WebAssertions`](../-web-assertions/index.md) |
