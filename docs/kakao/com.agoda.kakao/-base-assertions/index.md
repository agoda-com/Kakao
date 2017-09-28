---
title: BaseAssertions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [BaseAssertions](.)

# BaseAssertions

`interface BaseAssertions`

Base interface for asserting views

Provides basic assertions that can be performed on any view

**See Also**

[TextViewAssertions](../-text-view-assertions/index.html)

[EditableAssertions](../-editable-assertions/index.html)

[CheckableAssertions](../-checkable-assertions/index.html)

[ViewPagerAssertions](../-view-pager-assertions/index.html)

[ImageViewAssertions](../-image-view-assertions/index.html)

### Properties

| [view](view.html) | `abstract val view: ViewInteraction` |

### Functions

| [assert](assert.html) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExists](does-not-exists.html) | `open fun doesNotExists(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exists |
| [hasAnyTag](has-any-tag.html) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasDescendant](has-descendant.html) | `open fun hasDescendant(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](has-not-descendant.html) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](has-not-sibling.html) | `open fun hasNotSibling(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](has-sibling.html) | `open fun hasSibling(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](has-tag.html) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](in-root.html) | `open fun inRoot(function: `[`RootBuilder`](../-root-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](is-clickable.html) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyDisplayed](is-completely-displayed.html) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isDisabled](is-disabled.html) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](is-displayed.html) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](is-enabled.html) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](is-focusable.html) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](is-focused.html) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](is-gone.html) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](is-invisible.html) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](is-not-clickable.html) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](is-not-completely-displayed.html) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](is-not-displayed.html) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](is-not-focusable.html) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](is-not-focused.html) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](is-not-selected.html) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](is-selected.html) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](is-visible.html) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [matches](matches.html) | `open fun matches(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](not-matches.html) | `open fun notMatches(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |

### Inheritors

| [CheckableAssertions](../-checkable-assertions/index.html) | `interface CheckableAssertions : BaseAssertions`<br>Provides checkable based assertions for views |
| [ImageViewAssertions](../-image-view-assertions/index.html) | `interface ImageViewAssertions : BaseAssertions`<br>Provides assertion for image views |
| [KAdapterItem](../-k-adapter-item/index.html) | `open class KAdapterItem<out T> : `[`BaseActions`](../-base-actions/index.html)`, BaseAssertions`<br>Base class for KRecyclerView adapter items |
| [KBaseView](../-k-base-view/index.html) | `open class KBaseView<out T> : `[`BaseActions`](../-base-actions/index.html)`, BaseAssertions`<br>Base class for all Kakao views |
| [KListView](../-k-list-view/index.html) | `class KListView : `[`ScrollViewActions`](../-scroll-view-actions/index.html)`, BaseAssertions`<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KRecyclerItem](../-k-recycler-item/index.html) | `open class KRecyclerItem<out T> : `[`BaseActions`](../-base-actions/index.html)`, BaseAssertions`<br>Base class for KRecyclerView adapter items |
| [KRecyclerView](../-k-recycler-view/index.html) | `class KRecyclerView : `[`RecyclerActions`](../-recycler-actions/index.html)`, BaseAssertions`<br>View with RecyclerActions and BaseAssertions. Gives access to it's children |
| [TextViewAssertions](../-text-view-assertions/index.html) | `interface TextViewAssertions : BaseAssertions`<br>Provides text based assertions for views |
| [ViewPagerAssertions](../-view-pager-assertions/index.html) | `interface ViewPagerAssertions : BaseAssertions`<br>Provides assertions for view pagers |

