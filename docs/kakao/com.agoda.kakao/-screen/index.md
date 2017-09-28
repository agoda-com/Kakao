---
title: Screen - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [Screen](.)

# Screen

`open class Screen<out T : Screen<T>> : `[`ScreenActions`](../-screen-actions/index.html)

Container class for UI elements.

This class groups UI elements and grants access to basic actions,
such as tapBack() and closeSoftKeyboard()

### Parameters

`T` - type of your screen, done to enable invoke() for its children

**See Also**

[ScreenActions](../-screen-actions/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `Screen()`<br>Container class for UI elements. |

### Properties

| [view](view.html) | `open val view: ViewInteraction`<br>ViewInteraction on which all actions are performed (root view by default) |

### Functions

| [invoke](invoke.html) | `operator fun invoke(function: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| [closeSoftKeyboard](../-screen-actions/close-soft-keyboard.html) | `open fun closeSoftKeyboard(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Closes soft keyboard, if opened |
| [idle](../-screen-actions/idle.html) | `open fun idle(duration: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Idles for given amount of time |
| [pressBack](../-screen-actions/press-back.html) | `open fun pressBack(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on device's back button |

