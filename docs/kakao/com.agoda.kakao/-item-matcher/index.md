---
title: ItemMatcher - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [ItemMatcher](.)

# ItemMatcher

`class ItemMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches first RecyclerView descendant which matches specific matcher

### Parameters

`parent` - Matcher of the recycler view

`item` - Matcher of the item in adapter

### Constructors

| [&lt;init&gt;](-init-.html) | `ItemMatcher(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, item: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>)`<br>Matches first RecyclerView descendant which matches specific matcher |

### Properties

| [position](position.html) | `var position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

