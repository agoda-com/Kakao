[kakao](../../index.md) / [com.agoda.kakao.dialog](../index.md) / [KAlertDialog](./index.md)

# KAlertDialog

`class KAlertDialog : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KAlertDialog`](./index.md)`>`

View for interact with default alert dialog

**See Also**

[AlertDialog](https://developer.android.com/reference/android/app/AlertDialog.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KAlertDialog()`<br>View for interact with default alert dialog |

### Properties

| Name | Summary |
|---|---|
| [icon](icon.md) | `val icon: `[`KImageView`](../../com.agoda.kakao.image/-k-image-view/index.md) |
| [message](message.md) | `val message: `[`KTextView`](../../com.agoda.kakao.text/-k-text-view/index.md) |
| [negativeButton](negative-button.md) | `val negativeButton: `[`KButton`](../../com.agoda.kakao.text/-k-button/index.md) |
| [neutralButton](neutral-button.md) | `val neutralButton: `[`KButton`](../../com.agoda.kakao.text/-k-button/index.md) |
| [positiveButton](positive-button.md) | `val positiveButton: `[`KButton`](../../com.agoda.kakao.text/-k-button/index.md) |
| [title](title.md) | `val title: `[`KTextView`](../../com.agoda.kakao.text/-k-text-view/index.md) |

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
