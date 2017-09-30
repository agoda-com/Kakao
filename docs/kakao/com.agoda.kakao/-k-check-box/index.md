[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KCheckBox](.)

# KCheckBox

`class KCheckBox : `[`KBaseView`](../-k-base-view/index.md)`<KCheckBox>, `[`CheckableActions`](../-checkable-actions/index.md)`, `[`TextViewAssertions`](../-text-view-assertions/index.md)`, `[`CheckableAssertions`](../-checkable-assertions/index.md)

View with CheckableActions, CheckableAssertions and TextViewAssertions

**See Also**

[CheckableActions](../-checkable-actions/index.md)

[CheckableAssertions](../-checkable-assertions/index.md)

[TextViewAssertions](../-text-view-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KCheckBox(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KCheckBox(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KCheckBox(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [containsText](../-text-view-assertions/contains-text.md) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view contains given text |
| [hasAnyText](../-text-view-assertions/has-any-text.md) | `open fun hasAnyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has any text |
| [hasContentDescription](../-text-view-assertions/has-content-description.md) | `open fun hasContentDescription(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given content description |
| [hasEmptyText](../-text-view-assertions/has-empty-text.md) | `open fun hasEmptyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view have not any text |
| [hasNoText](../-text-view-assertions/has-no-text.md) | `open fun hasNoText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasNoText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view does not have a given text |
| [hasText](../-text-view-assertions/has-text.md) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given text`open fun hasText(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has text that matches given matcher |
| [isChecked](../-checkable-assertions/is-checked.md) | `open fun isChecked(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is checked |
| [isNotChecked](../-checkable-assertions/is-not-checked.md) | `open fun isNotChecked(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not checked |
| [setChecked](../-checkable-actions/set-checked.md) | `open fun setChecked(checked: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets checked state of the view |
| [startsWithText](../-text-view-assertions/starts-with-text.md) | `open fun startsWithText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view text start with given substring |
