---
title: BaseActions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [BaseActions](.)

# BaseActions

`interface BaseActions`

Base interface for performing actions on view

Provides a lot of basic action methods, such as click(), scrollTo(), etc.

**See Also**

[EditableActions](../-editable-actions/index.html)

[SwipeableActions](../-swipeable-actions/index.html)

[ScrollableActions](../-scrollable-actions/index.html)

[CheckableActions](../-checkable-actions/index.html)

### Properties

| [view](view.html) | `abstract val view: ViewInteraction` |

### Functions

| [act](act.html) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](click.html) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](double-click.html) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](long-click.html) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](on-failure.html) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [scrollTo](scroll-to.html) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| [CheckableActions](../-checkable-actions/index.html) | `interface CheckableActions : BaseActions`<br>Provides action for checking views |
| [DrawerActions](../-drawer-actions/index.html) | `interface DrawerActions : BaseActions`<br>Provides actions for navigation drawer |
| [EditableActions](../-editable-actions/index.html) | `interface EditableActions : BaseActions`<br>Provides editable actions for views |
| [KAdapterItem](../-k-adapter-item/index.html) | `open class KAdapterItem<out T> : BaseActions, `[`BaseAssertions`](../-base-assertions/index.html)<br>Base class for KRecyclerView adapter items |
| [KBaseView](../-k-base-view/index.html) | `open class KBaseView<out T> : BaseActions, `[`BaseAssertions`](../-base-assertions/index.html)<br>Base class for all Kakao views |
| [KRecyclerItem](../-k-recycler-item/index.html) | `open class KRecyclerItem<out T> : BaseActions, `[`BaseAssertions`](../-base-assertions/index.html)<br>Base class for KRecyclerView adapter items |
| [ScrollableActions](../-scrollable-actions/index.html) | `interface ScrollableActions : BaseActions`<br>Provides scrolling actions for view |
| [SwipeableActions](../-swipeable-actions/index.html) | `interface SwipeableActions : BaseActions`<br>Provides swipe actions for views |

