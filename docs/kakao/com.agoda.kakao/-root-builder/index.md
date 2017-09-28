---
title: RootBuilder - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [RootBuilder](.)

# RootBuilder

`class RootBuilder`

Class for building root matchers

This class helps to build matches for root.
Please note that any function invoking will add specific matcher to the list
and after that all of them will be combined with help of AllOf.allOf()

**See Also**

[AllOf.allOf](#)

### Constructors

| [&lt;init&gt;](-init-.html) | `RootBuilder()`<br>Class for building root matchers |

### Functions

| [getRootMatcher](get-root-matcher.html) | `fun getRootMatcher(): Matcher<Root>`<br>Returns combined root matchers with AllOf.allOf() |
| [isDialog](is-dialog.html) | `fun isDialog(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is dialog |
| [isFocusable](is-focusable.html) | `fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is focusable |
| [isNotDialog](is-not-dialog.html) | `fun isNotDialog(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not dialog |
| [isNotFocusable](is-not-focusable.html) | `fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not focusable |
| [isNotPlatformPopup](is-not-platform-popup.html) | `fun isNotPlatformPopup(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not platform popup |
| [isNotTouchable](is-not-touchable.html) | `fun isNotTouchable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not touchable |
| [isPlatformPopup](is-platform-popup.html) | `fun isPlatformPopup(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is platform popup |
| [isTouchable](is-touchable.html) | `fun isTouchable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is touchable |
| [withDecorView](with-decor-view.html) | `fun withDecorView(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that has decor view matching given matcher |
| [withMatcher](with-matcher.html) | `fun withMatcher(matcher: Matcher<Root>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root with given custom matcher |

