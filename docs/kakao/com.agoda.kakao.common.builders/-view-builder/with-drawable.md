[kakao](../../index.md) / [com.agoda.kakao.common.builders](../index.md) / [ViewBuilder](index.md) / [withDrawable](./with-drawable.md)

# withDrawable

`fun withDrawable(@DrawableRes resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toBitmap: ((drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches the view with given drawable

### Parameters

`resId` - Drawable resource to match

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)`fun withDrawable(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`, toBitmap: ((drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches the view with given drawable

### Parameters

`drawable` - Drawable to match

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)