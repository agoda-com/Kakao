---
title: PositionMatcher - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [PositionMatcher](.)

# PositionMatcher

`class PositionMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches RecyclerView descendant at given position in adapter

### Parameters

`parent` - Matcher of the recycler view

`position` - Position of item in adapter

### Constructors

| [&lt;init&gt;](-init-.html) | `PositionMatcher(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Matches RecyclerView descendant at given position in adapter |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

