[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [EditableAssertions](.)

# EditableAssertions

`interface EditableAssertions : `[`TextViewAssertions`](../-text-view-assertions/index.md)

Provides editable based assertions for views

### Functions

| Name | Summary |
|---|---|
| [hasHint](has-hint.md) | `open fun hasHint(hint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasHint(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given hint |

### Inherited Functions

| Name | Summary |
|---|---|
| [containsText](../-text-view-assertions/contains-text.md) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view contains given text |
| [hasAnyText](../-text-view-assertions/has-any-text.md) | `open fun hasAnyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has any text |
| [hasContentDescription](../-text-view-assertions/has-content-description.md) | `open fun hasContentDescription(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given content description |
| [hasEmptyText](../-text-view-assertions/has-empty-text.md) | `open fun hasEmptyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view have not any text |
| [hasNoText](../-text-view-assertions/has-no-text.md) | `open fun hasNoText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasNoText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view does not have a given text |
| [hasText](../-text-view-assertions/has-text.md) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given text`open fun hasText(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has text that matches given matcher |
| [startsWithText](../-text-view-assertions/starts-with-text.md) | `open fun startsWithText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view text start with given substring |

### Inheritors

| Name | Summary |
|---|---|
| [KEditText](../-k-edit-text/index.md) | `class KEditText : `[`KBaseView`](../-k-base-view/index.md)`<`[`KEditText`](../-k-edit-text/index.md)`>, `[`EditableActions`](../-editable-actions/index.md)`, EditableAssertions`<br>View with EditableActions and EditableAssertions |
