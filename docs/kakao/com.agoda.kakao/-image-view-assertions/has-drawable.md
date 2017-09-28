---
title: ImageViewAssertions.hasDrawable - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [ImageViewAssertions](index.html) / [hasDrawable](.)

# hasDrawable

`open fun hasDrawable(@DrawableRes resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the view displays given drawable

### Parameters

`resId` - Drawable resource to be matched

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)`open fun hasDrawable(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the view displays given drawable

### Parameters

`drawable` - Drawable to be matched

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)