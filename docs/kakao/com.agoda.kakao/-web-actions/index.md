---
title: WebActions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [WebActions](.)

# WebActions

`interface WebActions`

Provides action for interacting with WebViews

**See Also**

[WebView](#)

### Properties

| [ref](ref.html) | `abstract val ref: Atom<ElementReference>` |
| [web](web.html) | `abstract val web: WebInteraction<*>` |

### Functions

| [clear](clear.html) | `open fun clear(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clears the element |
| [click](click.html) | `open fun click(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clicks on element |
| [keys](keys.html) | `open fun keys(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Input keys with element in focus |
| [scroll](scroll.html) | `open fun scroll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the element inside WebView |

### Inheritors

| [KWebInteraction](../-web-element-builder/-k-web-interaction/index.html) | `inner class KWebInteraction : WebActions, `[`WebAssertions`](../-web-assertions/index.html) |

