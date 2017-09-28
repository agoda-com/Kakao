---
title: ScreenActions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [ScreenActions](.)

# ScreenActions

`interface ScreenActions`

Interface with common actions for all screens

Provides basic actions that can be performed on each and every screen

### Properties

| [view](view.html) | `abstract val view: ViewInteraction`<br>ViewInteraction on which all actions are performed (root view by default) |

### Functions

| [closeSoftKeyboard](close-soft-keyboard.html) | `open fun closeSoftKeyboard(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Closes soft keyboard, if opened |
| [idle](idle.html) | `open fun idle(duration: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Idles for given amount of time |
| [pressBack](press-back.html) | `open fun pressBack(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on device's back button |

### Inheritors

| [Screen](../-screen/index.html) | `open class Screen<out T : `[`Screen`](../-screen/index.html)`<T>> : ScreenActions`<br>Container class for UI elements. |

