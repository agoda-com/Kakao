[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [IndexMatcher](.)

# IndexMatcher

`class IndexMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches index'th view that matches given matcher

### Parameters

`matcher` - Matcher that have several matching views

`index` - index of view that must be matched

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IndexMatcher(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Matches index'th view that matches given matcher |

### Properties

| Name | Summary |
|---|---|
| [currentIndex](current-index.md) | `var currentIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
