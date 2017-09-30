[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [RootBuilder](.)

# RootBuilder

`class RootBuilder`

Class for building root matchers

This class helps to build matches for root.
Please note that any function invoking will add specific matcher to the list
and after that all of them will be combined with help of AllOf.allOf()

**See Also**

[AllOf.allOf](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RootBuilder()`<br>Class for building root matchers |

### Functions

| Name | Summary |
|---|---|
| [getRootMatcher](get-root-matcher.md) | `fun getRootMatcher(): Matcher<Root>`<br>Returns combined root matchers with AllOf.allOf() |
| [isDialog](is-dialog.md) | `fun isDialog(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is dialog |
| [isFocusable](is-focusable.md) | `fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is focusable |
| [isNotDialog](is-not-dialog.md) | `fun isNotDialog(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not dialog |
| [isNotFocusable](is-not-focusable.md) | `fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not focusable |
| [isNotPlatformPopup](is-not-platform-popup.md) | `fun isNotPlatformPopup(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not platform popup |
| [isNotTouchable](is-not-touchable.md) | `fun isNotTouchable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is not touchable |
| [isPlatformPopup](is-platform-popup.md) | `fun isPlatformPopup(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is platform popup |
| [isTouchable](is-touchable.md) | `fun isTouchable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that is touchable |
| [withDecorView](with-decor-view.md) | `fun withDecorView(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root that has decor view matching given matcher |
| [withMatcher](with-matcher.md) | `fun withMatcher(matcher: Matcher<Root>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches root with given custom matcher |
