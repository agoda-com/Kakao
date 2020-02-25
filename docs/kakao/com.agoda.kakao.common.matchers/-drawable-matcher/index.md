[kakao](../../index.md) / [com.agoda.kakao.common.matchers](../index.md) / [DrawableMatcher](./index.md)

# DrawableMatcher

`class DrawableMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`

Matches given drawable with current one

### Parameters

`resId` - Drawable resource to be matched (default is -1)

`drawable` - Drawable instance to be matched (default is null)

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DrawableMatcher(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = -1, drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`? = null, tintColorId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, toBitmap: ((drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`)? = null)`<br>Matches given drawable with current one |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
