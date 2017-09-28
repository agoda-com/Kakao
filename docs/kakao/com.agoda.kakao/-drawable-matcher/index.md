---
title: DrawableMatcher - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [DrawableMatcher](.)

# DrawableMatcher

`class DrawableMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches given drawable with current one

### Parameters

`resId` - Drawable resource to be matched (default is -1)

`drawable` - Drawable instance to be matched (default is null)

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)

### Constructors

| [&lt;init&gt;](-init-.html) | `DrawableMatcher(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = -1, drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`? = null, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null)`<br>Matches given drawable with current one |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [drawableToBitmap](drawable-to-bitmap.html) | `fun drawableToBitmap(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`): `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

