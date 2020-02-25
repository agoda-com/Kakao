[kakao](../../index.md) / [com.agoda.kakao.spinner](../index.md) / [SpinnerAdapterActions](./index.md)

# SpinnerAdapterActions

`interface SpinnerAdapterActions`

### Properties

| Name | Summary |
|---|---|
| [popupView](popup-view.md) | `abstract var popupView: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md)`?` |
| [view](view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `abstract fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Closes the spinner |
| [getSize](get-size.md) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of the spinner |
| [open](open.md) | `abstract fun open(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Opens the spinner to display it's items |

### Inheritors

| Name | Summary |
|---|---|
| [KSpinner](../-k-spinner/index.md) | `class KSpinner : `[`SpinnerAdapterActions`](./index.md)`, `[`SpinnerAdapterAssertions`](../-spinner-adapter-assertions/index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md) |
