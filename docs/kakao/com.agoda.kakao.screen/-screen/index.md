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
| [rootView](root-view.md) | `open var rootView: `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<*>?`<br>The visibility of rootView will be checked when entering the screen |
| [view](view.md) | `open val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md)<br>ViewInteractionDelegate on which all actions are performed (root view by default) |

### Functions

| Name | Summary |
|---|---|
| [intercept](intercept.md) | `fun intercept(configurator: `[`Interceptor.Configurator`](../../com.agoda.kakao.intercept/-interceptor/-configurator/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptors for the screen. Interceptors will be invoked on all interactions while the screen is active. |
| [invoke](invoke.md) | `operator fun invoke(function: `[`T`](index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [reset](reset.md) | `fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes the interceptors from the screen. |

### Inherited Functions

| Name | Summary |
|---|---|
| [closeSoftKeyboard](../-screen-actions/close-soft-keyboard.md) | `open fun closeSoftKeyboard(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Closes soft keyboard, if opened |
| [pressBack](../-screen-actions/press-back.md) | `open fun pressBack(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on device's back button |
| [pressKey](../-screen-actions/press-key.md) | `open fun pressKey(keyCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses a key with corresponding KeyCode`open fun pressKey(key: EspressoKey): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses a key with correspondingKeyCode and modifiers |
| [pressMenuKey](../-screen-actions/press-menu-key.md) | `open fun pressMenuKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses the hardware menu key |

### Companion Object Functions

| Name | Summary |
|---|---|
| [idle](idle.md) | `fun idle(duration: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Idles for given amount of time |
| [onScreen](on-screen.md) | `fun <T : `[`Screen`](./index.md)`<`[`T`](on-screen.md#T)`>> onScreen(function: `[`T`](on-screen.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](on-screen.md#T)<br>Initializes instance of the screen class provided and invokes given tail lambda on it. |
