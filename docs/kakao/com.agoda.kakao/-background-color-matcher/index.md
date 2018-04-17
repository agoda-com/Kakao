[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [BackgroundColorMatcher](./index.md)

# BackgroundColorMatcher

`class BackgroundColorMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches given background color with the current one

### Parameters

`resId` - Background color resource to be matched (default is -1)

`colorCode` - Background color string code to be matched (default is null)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BackgroundColorMatcher(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = -1, colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>Matches given background color with the current one |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
