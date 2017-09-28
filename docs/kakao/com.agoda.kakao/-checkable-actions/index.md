---
title: CheckableActions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [CheckableActions](.)

# CheckableActions

`interface CheckableActions : `[`BaseActions`](../-base-actions/index.html)

Provides action for checking views

### Inherited Properties

| [view](../-base-actions/view.html) | `abstract val view: ViewInteraction` |

### Functions

| [setChecked](set-checked.html) | `open fun setChecked(checked: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets checked state of the view |

### Inherited Functions

| [act](../-base-actions/act.html) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](../-base-actions/click.html) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](../-base-actions/double-click.html) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](../-base-actions/long-click.html) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](../-base-actions/on-failure.html) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [scrollTo](../-base-actions/scroll-to.html) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| [KCheckBox](../-k-check-box/index.html) | `class KCheckBox : `[`KBaseView`](../-k-base-view/index.html)`<`[`KCheckBox`](../-k-check-box/index.html)`>, CheckableActions, `[`TextViewAssertions`](../-text-view-assertions/index.html)`, `[`CheckableAssertions`](../-checkable-assertions/index.html)<br>View with CheckableActions, CheckableAssertions and TextViewAssertions |

