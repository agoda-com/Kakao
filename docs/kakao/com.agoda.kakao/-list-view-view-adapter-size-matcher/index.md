[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [ListViewViewAdapterSizeMatcher](./index.md)

# ListViewViewAdapterSizeMatcher

`class ListViewViewAdapterSizeMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`ListView`](https://developer.android.com/reference/android/widget/ListView.html)`>`

Matches ListView with count of children

### Parameters

`size` - of children count in ListView

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ListViewViewAdapterSizeMatcher(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Matches ListView with count of children |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: `[`ListView`](https://developer.android.com/reference/android/widget/ListView.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
