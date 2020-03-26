[kakao](../../index.md) / [com.agoda.kakao.common.matchers](../index.md) / [SpinnerPopupMatcher](./index.md)

# SpinnerPopupMatcher

`class SpinnerPopupMatcher : TypeSafeMatcher<Root>`

Matches Root View is popup window and contains DropDownView

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SpinnerPopupMatcher()`<br>Matches Root View is popup window and contains DropDownView |

### Properties

| Name | Summary |
|---|---|
| [dropdownClassName](dropdown-class-name.md) | `var dropdownClassName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [popupClassName](popup-class-name.md) | `var popupClassName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: Root?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
