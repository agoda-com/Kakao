[kakao](../../index.md) / [com.agoda.kakao.image](../index.md) / [ImageViewAssertions](index.md) / [hasDrawableWithTint](./has-drawable-with-tint.md)

# hasDrawableWithTint

`open fun hasDrawableWithTint(@DrawableRes resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @ColorRes tintColorId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toBitmap: ((drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the view displays given drawable

### Parameters

`resId` - Drawable resource to be matched

`tintColorId` - Tint color  resource id

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)`open fun hasDrawableWithTint(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`, @ColorRes tintColorId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toBitmap: ((drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the view displays given drawable

### Parameters

`drawable` - Drawable to be matched

`tintColorId` - Tint color  resource id

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)