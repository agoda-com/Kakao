---
title: WebAssertions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [WebAssertions](.)

# WebAssertions

`interface WebAssertions`

Interface that provides assertions for WebViews

### Properties

| [ref](ref.html) | `abstract val ref: Atom<ElementReference>` |
| [web](web.html) | `abstract val web: WebInteraction<*>` |

### Functions

| [containsText](contains-text.html) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element contains given text |
| [hasText](has-text.html) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element has given text |
| [matches](matches.html) | `open fun <T> matches(value: Atom<T>, matcher: Matcher<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if element matches given matcher |

### Inheritors

| [KWebInteraction](../-web-element-builder/-k-web-interaction/index.html) | `inner class KWebInteraction : `[`WebActions`](../-web-actions/index.html)`, WebAssertions` |

