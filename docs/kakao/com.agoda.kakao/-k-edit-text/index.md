---
title: KEditText - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KEditText](.)

# KEditText

`class KEditText : `[`KBaseView`](../-k-base-view/index.html)`<KEditText>, `[`EditableActions`](../-editable-actions/index.html)`, `[`EditableAssertions`](../-editable-assertions/index.html)

View with EditableActions and EditableAssertions

**See Also**

[EditableActions](../-editable-actions/index.html)

[EditableAssertions](../-editable-assertions/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `KEditText(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KEditText(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KEditText(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| [view](../-k-base-view/view.html) | `open val view: ViewInteraction` |

### Inherited Functions

| [clearText](../-editable-actions/clear-text.html) | `open fun clearText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clears current text in the view |
| [hasHint](../-editable-assertions/has-hint.html) | `open fun hasHint(hint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasHint(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given hint |
| [replaceText](../-editable-actions/replace-text.html) | `open fun replaceText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Replaces the current view text with given |
| [typeText](../-editable-actions/type-text.html) | `open fun typeText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Types the given text into the view |

