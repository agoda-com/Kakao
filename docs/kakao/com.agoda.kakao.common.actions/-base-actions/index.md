[kakao](../../index.md) / [com.agoda.kakao.common.actions](../index.md) / [BaseActions](./index.md)

# BaseActions

`interface BaseActions`

Base interface for performing actions on view

Provides a lot of basic action methods, such as click(), scrollTo(), etc.

**See Also**

[com.agoda.kakao.edit.EditableActions](../../com.agoda.kakao.edit/-editable-actions/index.md)

[com.agoda.kakao.common.actions.SwipeableActions](../-swipeable-actions/index.md)

[com.agoda.kakao.common.actions.ScrollableActions](../-scrollable-actions/index.md)

[com.agoda.kakao.check.CheckableActions](../../com.agoda.kakao.check/-checkable-actions/index.md)

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [act](act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [scrollTo](scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [BottomNavigationViewActions](../../com.agoda.kakao.bottomnav/-bottom-navigation-view-actions/index.md) | `interface BottomNavigationViewActions : `[`BaseActions`](./index.md)<br>Provides actions for BottomNavigationView |
| [CheckableActions](../../com.agoda.kakao.check/-checkable-actions/index.md) | `interface CheckableActions : `[`BaseActions`](./index.md)<br>Provides action for checking views |
| [ChipGroupActions](../../com.agoda.kakao.chipgroup/-chip-group-actions/index.md) | `interface ChipGroupActions : `[`BaseActions`](./index.md) |
| [DatePickerAction](../../com.agoda.kakao.picker.date/-date-picker-action/index.md) | `interface DatePickerAction : `[`BaseActions`](./index.md)<br>Provides actions for date picker |
| [DatePickerAssertion](../../com.agoda.kakao.picker.date/-date-picker-assertion/index.md) | `interface DatePickerAssertion : `[`BaseActions`](./index.md)<br>Provides assertions for date picker |
| [DrawerActions](../../com.agoda.kakao.drawer/-drawer-actions/index.md) | `interface DrawerActions : `[`BaseActions`](./index.md)<br>Provides actions for navigation drawer |
| [EditableActions](../../com.agoda.kakao.edit/-editable-actions/index.md) | `interface EditableActions : `[`BaseActions`](./index.md)<br>Provides editable actions for views |
| [KAdapterItem](../../com.agoda.kakao.list/-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KAbsListView adapter items |
| [KBaseView](../../com.agoda.kakao.common.views/-k-base-view/index.md) | `open class KBaseView<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for all Kakao views |
| [KRecyclerItem](../../com.agoda.kakao.recycler/-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KRecyclerView adapter items |
| [KViewPagerItem](../../com.agoda.kakao.pager2/-k-view-pager-item/index.md) | `open class KViewPagerItem<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KViewPager2 adapter items |
| [NavigationViewActions](../../com.agoda.kakao.navigation/-navigation-view-actions/index.md) | `interface NavigationViewActions : `[`BaseActions`](./index.md)<br>Provides actions for navigation view |
| [ProgressBarActions](../../com.agoda.kakao.progress/-progress-bar-actions/index.md) | `interface ProgressBarActions : `[`BaseActions`](./index.md)<br>Provides action for ProgressBar |
| [RatingBarActions](../../com.agoda.kakao.rating/-rating-bar-actions/index.md) | `interface RatingBarActions : `[`BaseActions`](./index.md)<br>Provides action for RatingBar |
| [ScrollableActions](../-scrollable-actions/index.md) | `interface ScrollableActions : `[`BaseActions`](./index.md)<br>Provides scrolling actions for view |
| [SwipeableActions](../-swipeable-actions/index.md) | `interface SwipeableActions : `[`BaseActions`](./index.md)<br>Provides swipe actions for views |
| [SwitchableActions](../../com.agoda.kakao.switch/-switchable-actions/index.md) | `interface SwitchableActions : `[`BaseActions`](./index.md)<br>Provides action for actions on Switch |
| [TabLayoutActions](../../com.agoda.kakao.tabs/-tab-layout-actions/index.md) | `interface TabLayoutActions : `[`BaseActions`](./index.md)<br>Provides action for TabLayout |
| [TextViewActions](../../com.agoda.kakao.text/-text-view-actions/index.md) | `interface TextViewActions : `[`BaseActions`](./index.md)<br>Provides actions for TextViews |
| [TimePickerAction](../../com.agoda.kakao.picker.time/-time-picker-action/index.md) | `interface TimePickerAction : `[`BaseActions`](./index.md)<br>Provides actions for time picker |
| [TimePickerAssertion](../../com.agoda.kakao.picker.time/-time-picker-assertion/index.md) | `interface TimePickerAssertion : `[`BaseActions`](./index.md)<br>Provides assertions for time picker |
