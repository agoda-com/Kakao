[kakao](../../index.md) / [com.agoda.kakao.common.matchers](../index.md) / [ToolbarNavigationMatcher](./index.md)

# ToolbarNavigationMatcher

`class ToolbarNavigationMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, Toolbar>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ToolbarNavigationMatcher(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`)`<br>`ToolbarNavigationMatcher(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`ToolbarNavigationMatcher(toBitmap: ((drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`)? = null)` |

### Properties

| Name | Summary |
|---|---|
| [drawable](drawable.md) | `var drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`?` |
| [resId](res-id.md) | `var resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(desc: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(view: Toolbar): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
