[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [ScreenActions](.)

# ScreenActions

`interface ScreenActions`

Interface with common actions for all screens

Provides basic actions that can be performed on each and every screen

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `abstract val view: ViewInteraction`<br>ViewInteraction on which all actions are performed (root view by default) |

### Functions

| Name | Summary |
|---|---|
| [closeSoftKeyboard](close-soft-keyboard.md) | `open fun closeSoftKeyboard(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Closes soft keyboard, if opened |
| [idle](idle.md) | `open fun idle(duration: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Idles for given amount of time |
| [pressBack](press-back.md) | `open fun pressBack(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on device's back button |
| [pressKey](press-key.md) | `open fun pressKey(keyCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses a key with corresponding KeyCode`open fun pressKey(key: EspressoKey): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses a key with correspondingKeyCode and modifiers |
| [pressMenuKey](press-menu-key.md) | `open fun pressMenuKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses the hardware menu key |

### Inheritors

| Name | Summary |
|---|---|
| [Screen](../-screen/index.md) | `open class Screen<out T : `[`Screen`](../-screen/index.md)`<T>> : ScreenActions`<br>Container class for UI elements. |
