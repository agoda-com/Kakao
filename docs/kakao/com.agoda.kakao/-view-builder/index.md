---
title: ViewBuilder - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [ViewBuilder](.)

# ViewBuilder

`class ViewBuilder`

Class for building view matchers and interactions

This class helps to build matches for views and get their interactions.
Please note that any function invoking will add specific matcher to the list
and after that all of them will be combined with help of AllOf.allOf()

**See Also**

[AllOf.allOf](#)

### Constructors

| [&lt;init&gt;](-init-.html) | `ViewBuilder()`<br>Class for building view matchers and interactions |

### Functions

| [containsText](contains-text.html) | `fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view which contain given text |
| [getViewInteraction](get-view-interaction.html) | `fun getViewInteraction(): ViewInteraction`<br>Returns view interaction based on all given matchers |
| [getViewMatcher](get-view-matcher.html) | `fun getViewMatcher(): Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Returns combined view matcher with AllOf.allOf() |
| [isCompletelyDisplayed](is-completely-displayed.html) | `fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view that is completely displayed |
| [isDescendantOfA](is-descendant-of-a.html) | `fun isDescendantOfA(function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view which is descendant of given matcher |
| [isDisabled](is-disabled.html) | `fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view if it is not in ENABLED state |
| [isDisplayed](is-displayed.html) | `fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view that is displayed |
| [isEnabled](is-enabled.html) | `fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view if it is in ENABLED state |
| [isFirst](is-first.html) | `fun isFirst(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the first view |
| [isGone](is-gone.html) | `fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with GONE visibility |
| [isInstanceOf](is-instance-of.html) | `fun isInstanceOf(clazz: `[`Class`](https://developer.android.com/reference/java/lang/Class.html)`<*>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view by class instance |
| [isInvisible](is-invisible.html) | `fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with INVISIBLE visibility |
| [isNotCompletelyDisplayed](is-not-completely-displayed.html) | `fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matchers the view that is not completely displayed |
| [isNotDisplayed](is-not-displayed.html) | `fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view that is not displayed |
| [isVisible](is-visible.html) | `fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with VISIBLE visibility |
| [withAnyText](with-any-text.html) | `fun withAnyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view which contains any text |
| [withClassName](with-class-name.html) | `fun withClassName(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view which class name matches given matcher |
| [withContentDescription](with-content-description.html) | `fun withContentDescription(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with given content description |
| [withDescendant](with-descendant.html) | `fun withDescendant(function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view which has descendant of given matcher |
| [withDrawable](with-drawable.html) | `fun withDrawable(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun withDrawable(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`, toBitmap: (drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`) -> `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)` = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with given drawable |
| [withId](with-id.html) | `fun withId(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with given resource id |
| [withIndex](with-index.html) | `fun withIndex(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches only view at given index, if there are multiple views that matches |
| [withMatcher](with-matcher.html) | `fun withMatcher(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with given custom matcher |
| [withParent](with-parent.html) | `fun withParent(function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view which has parent with given matcher |
| [withResourceName](with-resource-name.html) | `fun withResourceName(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with given resource name`fun withResourceName(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view by resource name with given matcher |
| [withSibling](with-sibling.html) | `fun withSibling(function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view which has sibling of given matcher |
| [withText](with-text.html) | `fun withText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun withText(textId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with given text`fun withText(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches the view with given text matcher |
| [withoutText](without-text.html) | `fun withoutText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun withoutText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches if the view does not have a given text |

