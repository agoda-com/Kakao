---
title: KImageView - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KImageView](.)

# KImageView

`class KImageView : `[`KBaseView`](../-k-base-view/index.html)`<KImageView>, `[`ImageViewAssertions`](../-image-view-assertions/index.html)

View with BaseActions and ImageViewAssertions

**See Also**

[BaseActions](../-base-actions/index.html)

[ImageViewAssertions](../-image-view-assertions/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `KImageView(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KImageView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KImageView(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| [view](../-k-base-view/view.html) | `open val view: ViewInteraction` |

### Inherited Functions

| [hasDrawable](../-image-view-assertions/has-drawable.html) | `open fun hasDrawable(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasDrawable(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displays given drawable |

