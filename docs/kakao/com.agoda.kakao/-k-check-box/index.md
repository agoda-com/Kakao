---
title: KCheckBox - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KCheckBox](.)

# KCheckBox

`class KCheckBox : `[`KBaseView`](../-k-base-view/index.html)`<KCheckBox>, `[`CheckableActions`](../-checkable-actions/index.html)`, `[`TextViewAssertions`](../-text-view-assertions/index.html)`, `[`CheckableAssertions`](../-checkable-assertions/index.html)

View with CheckableActions, CheckableAssertions and TextViewAssertions

**See Also**

[CheckableActions](../-checkable-actions/index.html)

[CheckableAssertions](../-checkable-assertions/index.html)

[TextViewAssertions](../-text-view-assertions/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `KCheckBox(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KCheckBox(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KCheckBox(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| [view](../-k-base-view/view.html) | `open val view: ViewInteraction` |

### Inherited Functions

| [containsText](../-text-view-assertions/contains-text.html) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view contains given text |
| [hasAnyText](../-text-view-assertions/has-any-text.html) | `open fun hasAnyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has any text |
| [hasContentDescription](../-text-view-assertions/has-content-description.html) | `open fun hasContentDescription(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given content description |
| [hasEmptyText](../-text-view-assertions/has-empty-text.html) | `open fun hasEmptyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view have not any text |
| [hasNoText](../-text-view-assertions/has-no-text.html) | `open fun hasNoText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasNoText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view does not have a given text |
| [hasText](../-text-view-assertions/has-text.html) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given text`open fun hasText(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has text that matches given matcher |
| [isChecked](../-checkable-assertions/is-checked.html) | `open fun isChecked(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is checked |
| [isNotChecked](../-checkable-assertions/is-not-checked.html) | `open fun isNotChecked(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not checked |
| [setChecked](../-checkable-actions/set-checked.html) | `open fun setChecked(checked: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets checked state of the view |
| [startsWithText](../-text-view-assertions/starts-with-text.html) | `open fun startsWithText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view text start with given substring |

