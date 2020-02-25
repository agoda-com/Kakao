[kakao](../../index.md) / [com.agoda.kakao.common.assertions](../index.md) / [BaseAssertions](./index.md)

# BaseAssertions

`interface BaseAssertions`

Base interface for asserting views

Provides basic assertions that can be performed on any view

**See Also**

[com.agoda.kakao.text.TextViewAssertions](../../com.agoda.kakao.text/-text-view-assertions/index.md)

[com.agoda.kakao.check.CheckableAssertions](../../com.agoda.kakao.check/-checkable-assertions/index.md)

[com.agoda.kakao.pager.ViewPagerAssertions](../../com.agoda.kakao.pager/-view-pager-assertions/index.md)

[com.agoda.kakao.image.ImageViewAssertions](../../com.agoda.kakao.image/-image-view-assertions/index.md)

### Properties

| Name | Summary |
|---|---|
| [root](root.md) | `abstract var root: Matcher<Root>` |
| [view](view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [assert](assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExist](does-not-exist.md) | `open fun doesNotExist(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exist |
| [hasAnyTag](has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasBackgroundColor](has-background-color.md) | `open fun hasBackgroundColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasBackgroundColor(colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given background color |
| [hasDescendant](has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../../com.agoda.kakao.common.builders/-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyAbove](is-completely-above.md) | `open fun isCompletelyAbove(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely above of the view matching the given matcher. |
| [isCompletelyBelow](is-completely-below.md) | `open fun isCompletelyBelow(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely below of the view matching the given matcher. |
| [isCompletelyDisplayed](is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isCompletelyLeftOf](is-completely-left-of.md) | `open fun isCompletelyLeftOf(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isCompletelyRightOf](is-completely-right-of.md) | `open fun isCompletelyRightOf(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
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
| [matches](matches.md) | `open fun matches(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |

### Inheritors

| Name | Summary |
|---|---|
| [BottomNavigationViewAssertions](../../com.agoda.kakao.bottomnav/-bottom-navigation-view-assertions/index.md) | `interface BottomNavigationViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for BottomNavigationview |
| [CheckableAssertions](../../com.agoda.kakao.check/-checkable-assertions/index.md) | `interface CheckableAssertions : `[`BaseAssertions`](./index.md)<br>Provides checkable based assertions for views |
| [ChipGroupAssertions](../../com.agoda.kakao.chipgroup/-chip-group-assertions/index.md) | `interface ChipGroupAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for a ChipGroup |
| [ImageViewAssertions](../../com.agoda.kakao.image/-image-view-assertions/index.md) | `interface ImageViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for image views |
| [KAbsListView](../../com.agoda.kakao.list/-k-abs-list-view/index.md) | `class KAbsListView : `[`ScrollViewActions`](../../com.agoda.kakao.scroll/-scroll-view-actions/index.md)`, `[`AbsListViewAdapterActions`](../../com.agoda.kakao.list/-abs-list-view-adapter-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`AbsListViewAdapterAssertions`](../../com.agoda.kakao.list/-abs-list-view-adapter-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KAdapterItem](../../com.agoda.kakao.list/-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KAbsListView adapter items |
| [KBaseView](../../com.agoda.kakao.common.views/-k-base-view/index.md) | `open class KBaseView<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for all Kakao views |
| [KRecyclerItem](../../com.agoda.kakao.recycler/-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KRecyclerView adapter items |
| [KRecyclerView](../../com.agoda.kakao.recycler/-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](../../com.agoda.kakao.recycler/-recycler-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`RecyclerAdapterAssertions`](../../com.agoda.kakao.recycler/-recycler-adapter-assertions/index.md)<br>View with RecyclerActions, BaseAssertions and RecyclerAdapterAssertions. Gives access to it's children |
| [KScrollView](../../com.agoda.kakao.scroll/-k-scroll-view/index.md) | `class KScrollView : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KScrollView`](../../com.agoda.kakao.scroll/-k-scroll-view/index.md)`>, `[`ScrollViewActions`](../../com.agoda.kakao.scroll/-scroll-view-actions/index.md)`, `[`BaseAssertions`](./index.md)<br>View with ScrollViewActions and BaseAssertions |
| [KSpinner](../../com.agoda.kakao.spinner/-k-spinner/index.md) | `class KSpinner : `[`SpinnerAdapterActions`](../../com.agoda.kakao.spinner/-spinner-adapter-actions/index.md)`, `[`SpinnerAdapterAssertions`](../../com.agoda.kakao.spinner/-spinner-adapter-assertions/index.md)`, `[`BaseAssertions`](./index.md) |
| [KViewPager2](../../com.agoda.kakao.pager2/-k-view-pager2/index.md) | `class KViewPager2 : `[`ViewPager2Actions`](../../com.agoda.kakao.pager2/-view-pager2-actions/index.md)`, `[`ViewPager2AdapterAssertions`](../../com.agoda.kakao.pager2/-view-pager2-adapter-assertions/index.md)`, `[`SwipeableActions`](../../com.agoda.kakao.common.actions/-swipeable-actions/index.md)`, `[`BaseAssertions`](./index.md)<br>View with SwipeableActions and ViewPager2Assertions |
| [KViewPagerItem](../../com.agoda.kakao.pager2/-k-view-pager-item/index.md) | `open class KViewPagerItem<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KViewPager2 adapter items |
| [NavigationViewAssertions](../../com.agoda.kakao.navigation/-navigation-view-assertions/index.md) | `interface NavigationViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for NavigationView |
| [ProgressBarAssertions](../../com.agoda.kakao.progress/-progress-bar-assertions/index.md) | `interface ProgressBarAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for progress bar |
| [RatingBarAssertions](../../com.agoda.kakao.rating/-rating-bar-assertions/index.md) | `interface RatingBarAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for RatingBar |
| [SwipeRefreshLayoutAssertions](../../com.agoda.kakao.swiperefresh/-swipe-refresh-layout-assertions/index.md) | `interface SwipeRefreshLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for SwipeRefreshLayout |
| [TabLayoutAssertions](../../com.agoda.kakao.tabs/-tab-layout-assertions/index.md) | `interface TabLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for TabLayout |
| [TextInputLayoutAssertions](../../com.agoda.kakao.edit/-text-input-layout-assertions/index.md) | `interface TextInputLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for TextInputLayout |
| [TextViewAssertions](../../com.agoda.kakao.text/-text-view-assertions/index.md) | `interface TextViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides text based assertions for views |
| [ViewPagerAssertions](../../com.agoda.kakao.pager/-view-pager-assertions/index.md) | `interface ViewPagerAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for view pagers |
