[kakao](../../index.md) / [com.agoda.kakao.common.matchers](../index.md) / [RecyclerViewAdapterSizeMatcher](./index.md)

# RecyclerViewAdapterSizeMatcher

`class RecyclerViewAdapterSizeMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, RecyclerView>`

Matches RecyclerView with count of children

### Parameters

`size` - of children count in RecyclerView

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RecyclerViewAdapterSizeMatcher(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Matches RecyclerView with count of children |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: RecyclerView): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
