---
title: IndexMatcher - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [IndexMatcher](.)

# IndexMatcher

`class IndexMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches index'th view that matches given matcher

### Parameters

`matcher` - Matcher that have several matching views

`index` - index of view that must be matched

### Constructors

| [&lt;init&gt;](-init-.html) | `IndexMatcher(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Matches index'th view that matches given matcher |

### Properties

| [currentIndex](current-index.html) | `var currentIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

