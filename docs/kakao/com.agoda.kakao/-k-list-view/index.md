---
title: KListView - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KListView](.)

# KListView

`class KListView : `[`ScrollViewActions`](../-scroll-view-actions/index.html)`, `[`BaseAssertions`](../-base-assertions/index.html)

View with ScrollViewActions and BaseAssertions. Gives access to it's children

### Parameters

`builder` - ViewBuilder which will match your list view

`itemTypeBuilder` - Lambda with receiver where you pass your item providers

**See Also**

[ScrollViewActions](../-scroll-view-actions/index.html)

[BaseAssertions](../-base-assertions/index.html)

[KAdapterItem](../-k-adapter-item/index.html)

[KAdapterItemTypeBuilder](../-k-adapter-item-type-builder/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `KListView(builder: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KAdapterItemTypeBuilder`](../-k-adapter-item-type-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |

### Properties

| [builder](builder.html) | `val builder: `[`ViewBuilder`](../-view-builder/index.html) |
| [itemTypes](item-types.html) | `val itemTypes: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>>, `[`KAdapterItemType`](../-k-adapter-item-type/index.html)`<`[`KAdapterItem`](../-k-adapter-item/index.html)`<*>>>` |
| [matcher](matcher.html) | `val matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [view](view.html) | `val view: ViewInteraction` |

### Functions

| [childAt](child-at.html) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> childAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on child at given position |
| [childWith](child-with.html) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> childWith(childMatcher: `[`DataBuilder`](../-data-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): T`<br>Performs given actions/assertion on child that matches given matcher |
| [children](children.html) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> children(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on all children in adapter |
| [firstChild](first-child.html) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> firstChild(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on first child in adapter |
| [invoke](invoke.html) | `operator fun invoke(function: KListView.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [lastChild](last-child.html) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.html)`<*>> lastChild(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on last child in adapter |
| [perform](perform.html) | `infix fun perform(function: KListView.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): KListView`<br>Infix function for invoking lambda on your view |

### Inherited Functions

| [assert](../-base-assertions/assert.html) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExists](../-base-assertions/does-not-exists.html) | `open fun doesNotExists(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exists |
| [getSize](../-scroll-view-actions/get-size.html) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of ScrollView |
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
| [scrollTo](../-scroll-view-actions/scroll-to.html) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view |
| [scrollToEnd](../-scroll-view-actions/scroll-to-end.html) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](../-scroll-view-actions/scroll-to-start.html) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |

### Extension Functions

| [emptyChildAt](../empty-child-at.html) | `fun KListView.emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls childAt() on your view with base child |
| [emptyChildWith](../empty-child-with.html) | `fun KListView.emptyChildWith(builder: `[`DataBuilder`](../-data-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.html)<br>Calls childWith() on your view with base child |
| [emptyFirstChild](../empty-first-child.html) | `fun KListView.emptyFirstChild(tail: `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls firstChild() on your view with base child |
| [emptyLastChild](../empty-last-child.html) | `fun KListView.emptyLastChild(tail: `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls lastChild() on your view with base child |

