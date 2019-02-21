[kakao](../../index.md) / [com.agoda.kakao.common.matchers](../index.md) / [ItemMatcher](./index.md)

# ItemMatcher

`class ItemMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches first RecyclerView descendant which matches specific matcher

### Parameters

`parent` - Matcher of the recycler view

`item` - Matcher of the item in adapter

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ItemMatcher(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, item: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>)`<br>Matches first RecyclerView descendant which matches specific matcher |

### Properties

| Name | Summary |
|---|---|
| [position](position.md) | `var position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
