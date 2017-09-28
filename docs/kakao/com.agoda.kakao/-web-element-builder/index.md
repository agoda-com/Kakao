---
title: WebElementBuilder - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [WebElementBuilder](.)

# WebElementBuilder

`class WebElementBuilder`

Class for building WebView element matchers

### Parameters

`web` - WebInteraction where elements should be matched

### Types

| [KWebInteraction](-k-web-interaction/index.html) | `inner class KWebInteraction : `[`WebActions`](../-web-actions/index.html)`, `[`WebAssertions`](../-web-assertions/index.html) |

### Constructors

| [&lt;init&gt;](-init-.html) | `WebElementBuilder(web: WebInteraction<*>)`<br>Class for building WebView element matchers |

### Properties

| [web](web.html) | `val web: WebInteraction<*>` |

### Functions

| [withElement](with-element.html) | `fun withElement(locator: Locator, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, interaction: `[`KWebInteraction`](-k-web-interaction/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Looks up web view element and performs actions/assertions on it |

