[kakao](../../index.md) / [com.agoda.kakao.screen](../index.md) / [Screen](./index.md)

# Screen

`open class Screen<out T : `[`Screen`](./index.md)`<`[`T`](index.md#T)`>> : `[`ScreenActions`](../-screen-actions/index.md)

Container class for UI elements.

This class groups UI elements and grants access to basic actions,
such as tapBack() and closeSoftKeyboard()

### Parameters

`T` - type of your screen, done to enable invoke() for its children

**See Also**

[ScreenActions](../-screen-actions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Screen()`<br>Container class for UI elements. |

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `open val view: ViewInteraction`<br>ViewInteraction on which all actions are performed (root view by default) |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun invoke(function: `[`T`](index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| Name | Summary |
|---|---|
| [closeSoftKeyboard](../-screen-actions/close-soft-keyboard.md) | `open fun closeSoftKeyboard(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Closes soft keyboard, if opened |
| [idle](../-screen-actions/idle.md) | `open fun idle(duration: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Idles for given amount of time |
| [pressBack](../-screen-actions/press-back.md) | `open fun pressBack(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on device's back button |
| [pressKey](../-screen-actions/press-key.md) | `open fun pressKey(keyCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses a key with corresponding KeyCode`open fun pressKey(key: EspressoKey): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses a key with correspondingKeyCode and modifiers |
| [pressMenuKey](../-screen-actions/press-menu-key.md) | `open fun pressMenuKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses the hardware menu key |
