[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [PositionMatcher](.)

# PositionMatcher

`class PositionMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches RecyclerView descendant at given position in adapter

### Parameters

`parent` - Matcher of the recycler view

`position` - Position of item in adapter

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PositionMatcher(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Matches RecyclerView descendant at given position in adapter |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
