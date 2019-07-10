[kakao](../../index.md) / [com.agoda.kakao.picker.time](../index.md) / [KTimePickerDialog](./index.md)

# KTimePickerDialog

`class KTimePickerDialog : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KTimePickerDialog`](./index.md)`>`

View for interact with default date picker dialog

**See Also**

[TimePickerDialog](https://developer.android.com/reference/android/app/TimePickerDialog.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KTimePickerDialog()`<br>View for interact with default date picker dialog |

### Properties

| Name | Summary |
|---|---|
| [cancelButton](cancel-button.md) | `val cancelButton: `[`KButton`](../../com.agoda.kakao.text/-k-button/index.md) |
| [okButton](ok-button.md) | `val okButton: `[`KButton`](../../com.agoda.kakao.text/-k-button/index.md) |
| [timePicker](time-picker.md) | `val timePicker: `[`KTimePicker`](../-k-time-picker/index.md) |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../com.agoda.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../com.agoda.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../../com.agoda.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../../com.agoda.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
