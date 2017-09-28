---
title: TextViewAssertions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [TextViewAssertions](.)

# TextViewAssertions

`interface TextViewAssertions : `[`BaseAssertions`](../-base-assertions/index.html)

Provides text based assertions for views

### Inherited Properties

| [view](../-base-assertions/view.html) | `abstract val view: ViewInteraction` |

### Functions

| [containsText](contains-text.html) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view contains given text |
| [hasAnyText](has-any-text.html) | `open fun hasAnyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has any text |
| [hasContentDescription](has-content-description.html) | `open fun hasContentDescription(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given content description |
| [hasEmptyText](has-empty-text.html) | `open fun hasEmptyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view have not any text |
| [hasNoText](has-no-text.html) | `open fun hasNoText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasNoText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view does not have a given text |
| [hasText](has-text.html) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given text`open fun hasText(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has text that matches given matcher |
| [startsWithText](starts-with-text.html) | `open fun startsWithText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view text start with given substring |

### Inherited Functions

| [assert](../-base-assertions/assert.html) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExists](../-base-assertions/does-not-exists.html) | `open fun doesNotExists(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exists |
| [hasAnyTag](../-base-assertions/has-any-tag.html) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasDescendant](../-base-assertions/has-descendant.html) | `open fun hasDescendant(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](../-base-assertions/has-not-descendant.html) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](../-base-assertions/has-not-sibling.html) | `open fun hasNotSibling(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](../-base-assertions/has-sibling.html) | `open fun hasSibling(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](../-base-assertions/has-tag.html) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](../-base-assertions/in-root.html) | `open fun inRoot(function: `[`RootBuilder`](../-root-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](../-base-assertions/is-clickable.html) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyDisplayed](../-base-assertions/is-completely-displayed.html) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isDisabled](../-base-assertions/is-disabled.html) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](../-base-assertions/is-displayed.html) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](../-base-assertions/is-enabled.html) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](../-base-assertions/is-focusable.html) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](../-base-assertions/is-focused.html) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](../-base-assertions/is-gone.html) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](../-base-assertions/is-invisible.html) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](../-base-assertions/is-not-clickable.html) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](../-base-assertions/is-not-completely-displayed.html) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](../-base-assertions/is-not-displayed.html) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](../-base-assertions/is-not-focusable.html) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](../-base-assertions/is-not-focused.html) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](../-base-assertions/is-not-selected.html) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](../-base-assertions/is-selected.html) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](../-base-assertions/is-visible.html) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [matches](../-base-assertions/matches.html) | `open fun matches(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](../-base-assertions/not-matches.html) | `open fun notMatches(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |

### Inheritors

| [EditableAssertions](../-editable-assertions/index.html) | `interface EditableAssertions : TextViewAssertions`<br>Provides editable based assertions for views |
| [KButton](../-k-button/index.html) | `class KButton : `[`KBaseView`](../-k-base-view/index.html)`<`[`KButton`](../-k-button/index.html)`>, TextViewAssertions`<br>View with BaseActions and TextViewAssertions |
| [KCheckBox](../-k-check-box/index.html) | `class KCheckBox : `[`KBaseView`](../-k-base-view/index.html)`<`[`KCheckBox`](../-k-check-box/index.html)`>, `[`CheckableActions`](../-checkable-actions/index.html)`, TextViewAssertions, `[`CheckableAssertions`](../-checkable-assertions/index.html)<br>View with CheckableActions, CheckableAssertions and TextViewAssertions |
| [KTextView](../-k-text-view/index.html) | `class KTextView : `[`KBaseView`](../-k-base-view/index.html)`<`[`KTextView`](../-k-text-view/index.html)`>, TextViewAssertions`<br>View with BaseActions and TextViewAssertions |

