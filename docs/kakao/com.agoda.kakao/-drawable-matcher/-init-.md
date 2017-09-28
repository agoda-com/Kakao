---
title: DrawableMatcher.<init> - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [DrawableMatcher](index.html) / [&lt;init&gt;](.)

# &lt;init&gt;

`DrawableMatcher(@DrawableRes resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = -1, drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`? = null, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null)`

Matches given drawable with current one

### Parameters

`resId` - Drawable resource to be matched (default is -1)

`drawable` - Drawable instance to be matched (default is null)

`toBitmap` - Lambda with custom Drawable -&gt; Bitmap converter (default is null)