[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KBaseView](.)

# KBaseView

`open class KBaseView<out T> : `[`BaseActions`](../-base-actions/index.md)`, `[`BaseAssertions`](../-base-assertions/index.md)

Base class for all Kakao views

This base class allows create new custom view with ease. All you
have to do is to extend this class, implement all necessarily additional
actions/assertions interfaces and override necessary constructors

### Parameters

`T` - Type of your custom view. Needs to be defined to enable invoke() and perform() for descendants

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KBaseView(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with view interaction from given ViewBuilder`KBaseView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KBaseView(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with parent and view interaction from given ViewBuilder |

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `open val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun invoke(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](perform.md) | `infix fun perform(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): T`<br>Infix function for invoking lambda on your view |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [assert](../-base-assertions/assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [click](../-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doesNotExists](../-base-assertions/does-not-exists.md) | `open fun doesNotExists(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exists |
| [doubleClick](../-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [hasAnyTag](../-base-assertions/has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasDescendant](../-base-assertions/has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](../-base-assertions/has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](../-base-assertions/has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](../-base-assertions/has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](../-base-assertions/has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](../-base-assertions/in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](../-base-assertions/is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyDisplayed](../-base-assertions/is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isDisabled](../-base-assertions/is-disabled.md) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](../-base-assertions/is-displayed.md) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](../-base-assertions/is-enabled.md) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](../-base-assertions/is-focusable.md) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](../-base-assertions/is-focused.md) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](../-base-assertions/is-gone.md) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](../-base-assertions/is-invisible.md) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](../-base-assertions/is-not-clickable.md) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](../-base-assertions/is-not-completely-displayed.md) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](../-base-assertions/is-not-displayed.md) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](../-base-assertions/is-not-focusable.md) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](../-base-assertions/is-not-focused.md) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](../-base-assertions/is-not-selected.md) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](../-base-assertions/is-selected.md) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](../-base-assertions/is-visible.md) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [longClick](../-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [matches](../-base-assertions/matches.md) | `open fun matches(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](../-base-assertions/not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |
| [onFailure](../-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [scrollTo](../-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [KButton](../-k-button/index.md) | `class KButton : KBaseView<`[`KButton`](../-k-button/index.md)`>, `[`TextViewAssertions`](../-text-view-assertions/index.md)<br>View with BaseActions and TextViewAssertions |
| [KCheckBox](../-k-check-box/index.md) | `class KCheckBox : KBaseView<`[`KCheckBox`](../-k-check-box/index.md)`>, `[`CheckableActions`](../-checkable-actions/index.md)`, `[`TextViewAssertions`](../-text-view-assertions/index.md)`, `[`CheckableAssertions`](../-checkable-assertions/index.md)<br>View with CheckableActions, CheckableAssertions and TextViewAssertions |
| [KDrawerView](../-k-drawer-view/index.md) | `class KDrawerView : KBaseView<`[`KDrawerView`](../-k-drawer-view/index.md)`>, `[`DrawerActions`](../-drawer-actions/index.md)<br>View with DrawerActions and BaseAssertions |
| [KEditText](../-k-edit-text/index.md) | `class KEditText : KBaseView<`[`KEditText`](../-k-edit-text/index.md)`>, `[`EditableActions`](../-editable-actions/index.md)`, `[`EditableAssertions`](../-editable-assertions/index.md)<br>View with EditableActions and EditableAssertions |
| [KImageView](../-k-image-view/index.md) | `class KImageView : KBaseView<`[`KImageView`](../-k-image-view/index.md)`>, `[`ImageViewAssertions`](../-image-view-assertions/index.md)<br>View with BaseActions and ImageViewAssertions |
| [KSwipeView](../-k-swipe-view/index.md) | `class KSwipeView : KBaseView<`[`KSwipeView`](../-k-swipe-view/index.md)`>, `[`SwipeableActions`](../-swipeable-actions/index.md)<br>View with SwipeableActions and BaseAssertions |
| [KTextView](../-k-text-view/index.md) | `class KTextView : KBaseView<`[`KTextView`](../-k-text-view/index.md)`>, `[`TextViewAssertions`](../-text-view-assertions/index.md)<br>View with BaseActions and TextViewAssertions |
| [KView](../-k-view/index.md) | `class KView : KBaseView<`[`KView`](../-k-view/index.md)`>`<br>Simple view with BaseActions and BaseAssertions |
| [KViewPager](../-k-view-pager/index.md) | `class KViewPager : KBaseView<`[`KViewPager`](../-k-view-pager/index.md)`>, `[`SwipeableActions`](../-swipeable-actions/index.md)`, `[`ViewPagerAssertions`](../-view-pager-assertions/index.md)<br>View with SwipeableActions and ViewPagerAssertions |
