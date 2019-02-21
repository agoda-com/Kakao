[kakao](../../index.md) / [com.agoda.kakao.common.actions](../index.md) / [ScrollableActions](./index.md)

# ScrollableActions

`interface ScrollableActions : `[`BaseActions`](../-base-actions/index.md)

Provides scrolling actions for view

Important: does not hold any implementation

**See Also**

[RecyclerActions](#)

[ScrollViewActions](#)

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-base-actions/view.md) | `abstract val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [scrollTo](scroll-to.md) | `abstract fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view |
| [scrollToEnd](scroll-to-end.md) | `abstract fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](scroll-to-start.md) | `abstract fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](../-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](../-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](../-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](../-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](../-base-actions/press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](../-base-actions/repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [scrollTo](../-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [RecyclerActions](../../com.agoda.kakao.recycler/-recycler-actions/index.md) | `interface RecyclerActions : `[`ScrollableActions`](./index.md)`, `[`SwipeableActions`](../-swipeable-actions/index.md)<br>Provides ScrollableActions implementation for RecyclerView |
| [ScrollViewActions](../../com.agoda.kakao.list/-scroll-view-actions/index.md) | `interface ScrollViewActions : `[`ScrollableActions`](./index.md)`, `[`SwipeableActions`](../-swipeable-actions/index.md)<br>Provides ScrollableActions implementation for ScrollView |
