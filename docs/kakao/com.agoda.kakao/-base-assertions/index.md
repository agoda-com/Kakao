[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [BaseAssertions](./index.md)

# BaseAssertions

`interface BaseAssertions`

Base interface for asserting views

Provides basic assertions that can be performed on any view

**See Also**

[TextViewAssertions](../-text-view-assertions/index.md)

[EditableAssertions](../-editable-assertions/index.md)

[CheckableAssertions](../-checkable-assertions/index.md)

[ViewPagerAssertions](../-view-pager-assertions/index.md)

[ImageViewAssertions](../-image-view-assertions/index.md)

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `abstract val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [assert](assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExist](does-not-exist.md) | `open fun doesNotExist(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exist |
| [hasAnyTag](has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasBackgroundColor](has-background-color.md) | `open fun hasBackgroundColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasBackgroundColor(colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given background color |
| [hasDescendant](has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyDisplayed](is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isDisabled](is-disabled.md) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](is-displayed.md) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](is-enabled.md) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](is-focusable.md) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](is-focused.md) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](is-gone.md) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](is-invisible.md) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](is-not-clickable.md) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](is-not-completely-displayed.md) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](is-not-displayed.md) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](is-not-focusable.md) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](is-not-focused.md) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](is-not-selected.md) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](is-selected.md) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](is-visible.md) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [matches](matches.md) | `open fun matches(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |

### Inheritors

| Name | Summary |
|---|---|
| [BottomNavigationViewAssertions](../-bottom-navigation-view-assertions/index.md) | `interface BottomNavigationViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for BottomNavigationview |
| [CheckableAssertions](../-checkable-assertions/index.md) | `interface CheckableAssertions : `[`BaseAssertions`](./index.md)<br>Provides checkable based assertions for views |
| [ImageViewAssertions](../-image-view-assertions/index.md) | `interface ImageViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for image views |
| [KAdapterItem](../-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](../-base-actions/index.md)`, `[`BaseAssertions`](./index.md)<br>Base class for KRecyclerView adapter items |
| [KBaseView](../-k-base-view/index.md) | `open class KBaseView<out T> : `[`BaseActions`](../-base-actions/index.md)`, `[`BaseAssertions`](./index.md)<br>Base class for all Kakao views |
| [KListView](../-k-list-view/index.md) | `class KListView : `[`ScrollViewActions`](../-scroll-view-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`ListViewAdapterAssertions`](../-list-view-adapter-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KRecyclerItem](../-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](../-base-actions/index.md)`, `[`BaseAssertions`](./index.md)<br>Base class for KRecyclerView adapter items |
| [KRecyclerView](../-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](../-recycler-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`RecyclerAdapterAssertions`](../-recycler-adapter-assertions/index.md)<br>View with RecyclerActions and BaseAssertions. Gives access to it's children |
| [NavigationViewAssertions](../-navigation-view-assertions/index.md) | `interface NavigationViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for NavigationView |
| [ProgressBarAssertions](../-progress-bar-assertions/index.md) | `interface ProgressBarAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for progress bar |
| [RatingBarAssertions](../-rating-bar-assertions/index.md) | `interface RatingBarAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for RatingBar |
| [SwipeRefreshLayoutAssertions](../-swipe-refresh-layout-assertions/index.md) | `interface SwipeRefreshLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for SwipeRefreshLayout |
| [TabLayoutAssertions](../-tab-layout-assertions/index.md) | `interface TabLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for TabLayout |
| [TextInputLayoutAssertions](../-text-input-layout-assertions/index.md) | `interface TextInputLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for TextInputLayout |
| [TextViewAssertions](../-text-view-assertions/index.md) | `interface TextViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides text based assertions for views |
| [ViewPagerAssertions](../-view-pager-assertions/index.md) | `interface ViewPagerAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for view pagers |
