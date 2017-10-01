[kakao](../../../index.md) / [com.agoda.kakao](../../index.md) / [WebElementBuilder](../index.md) / [KWebInteraction](.)

# KWebInteraction

`inner class KWebInteraction : `[`WebActions`](../../-web-actions/index.md)`, `[`WebAssertions`](../../-web-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KWebInteraction(web: WebInteraction<*>, ref: Atom<ElementReference>)` |

### Properties

| Name | Summary |
|---|---|
| [ref](ref.md) | `val ref: Atom<ElementReference>` |
| [web](web.md) | `val web: WebInteraction<*>` |

### Inherited Functions

| Name | Summary |
|---|---|
| [clear](../../-web-actions/clear.md) | `open fun clear(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clears the element |
| [click](../../-web-actions/click.md) | `open fun click(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clicks on element |
| [containsText](../../-web-assertions/contains-text.md) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element contains given text |
| [hasText](../../-web-assertions/has-text.md) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element has given text |
| [keys](../../-web-actions/keys.md) | `open fun keys(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Input keys with element in focus |
| [matches](../../-web-assertions/matches.md) | `open fun <T> matches(value: Atom<T>, matcher: Matcher<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element matches given matcher |
| [scroll](../../-web-actions/scroll.md) | `open fun scroll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the element inside WebView |
