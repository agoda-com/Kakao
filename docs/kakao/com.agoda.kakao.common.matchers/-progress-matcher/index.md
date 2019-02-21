[kakao](../../index.md) / [com.agoda.kakao.common.matchers](../index.md) / [ProgressMatcher](./index.md)

# ProgressMatcher

`class ProgressMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`ProgressBar`](https://developer.android.com/reference/android/widget/ProgressBar.html)`>`

Matcher of value progress of given matcher

### Parameters

`value` - of progress that matched the view which is ProgressBar

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ProgressMatcher(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Matcher of value progress of given matcher |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: `[`ProgressBar`](https://developer.android.com/reference/android/widget/ProgressBar.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
