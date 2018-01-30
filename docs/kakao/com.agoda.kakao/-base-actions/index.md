[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [BaseActions](.)

# BaseActions

`interface BaseActions`

Base interface for performing actions on view

Provides a lot of basic action methods, such as click(), scrollTo(), etc.

**See Also**

[EditableActions](../-editable-actions/index.md)

[SwipeableActions](../-swipeable-actions/index.md)

[ScrollableActions](../-scrollable-actions/index.md)

[CheckableActions](../-checkable-actions/index.md)

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `abstract val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [act](act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [scrollTo](scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [BottomNavigationViewActions](../-bottom-navigation-view-actions/index.md) | `interface BottomNavigationViewActions : BaseActions`<br>Provides actions for BottomNavigationView |
| [CheckableActions](../-checkable-actions/index.md) | `interface CheckableActions : BaseActions`<br>Provides action for checking views |
| [DrawerActions](../-drawer-actions/index.md) | `interface DrawerActions : BaseActions`<br>Provides actions for navigation drawer |
| [EditableActions](../-editable-actions/index.md) | `interface EditableActions : BaseActions`<br>Provides editable actions for views |
| [KAdapterItem](../-k-adapter-item/index.md) | `open class KAdapterItem<out T> : BaseActions, `[`BaseAssertions`](../-base-assertions/index.md)<br>Base class for KRecyclerView adapter items |
| [KBaseView](../-k-base-view/index.md) | `open class KBaseView<out T> : BaseActions, `[`BaseAssertions`](../-base-assertions/index.md)<br>Base class for all Kakao views |
| [KRecyclerItem](../-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : BaseActions, `[`BaseAssertions`](../-base-assertions/index.md)<br>Base class for KRecyclerView adapter items |
| [NavigationViewActions](../-navigation-view-actions/index.md) | `interface NavigationViewActions : BaseActions`<br>Provides actions for navigation view |
| [ProgressBarActions](../-progress-bar-actions/index.md) | `interface ProgressBarActions : BaseActions`<br>Provides action for ProgressBar |
| [RatingBarActions](../-rating-bar-actions/index.md) | `interface RatingBarActions : BaseActions`<br>Provides action for RatingBar |
| [ScrollableActions](../-scrollable-actions/index.md) | `interface ScrollableActions : BaseActions`<br>Provides scrolling actions for view |
| [SwipeableActions](../-swipeable-actions/index.md) | `interface SwipeableActions : BaseActions`<br>Provides swipe actions for views |
| [TabLayoutActions](../-tab-layout-actions/index.md) | `interface TabLayoutActions : BaseActions`<br>Provides action for TabLayout |
| [TextViewActions](../-text-view-actions/index.md) | `interface TextViewActions : BaseActions`<br>Provides actions for TextViews |
