[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [CheckableActions](.)

# CheckableActions

`interface CheckableActions : `[`BaseActions`](../-base-actions/index.md)

Provides action for checking views

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-base-actions/view.md) | `abstract val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [setChecked](set-checked.md) | `open fun setChecked(checked: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets checked state of the view |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](../-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](../-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](../-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](../-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [scrollTo](../-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [KCheckBox](../-k-check-box/index.md) | `class KCheckBox : `[`KBaseView`](../-k-base-view/index.md)`<`[`KCheckBox`](../-k-check-box/index.md)`>, CheckableActions, `[`TextViewAssertions`](../-text-view-assertions/index.md)`, `[`CheckableAssertions`](../-checkable-assertions/index.md)<br>View with CheckableActions, CheckableAssertions and TextViewAssertions |
