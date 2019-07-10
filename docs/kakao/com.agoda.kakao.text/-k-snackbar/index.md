[kakao](../../index.md) / [com.agoda.kakao.text](../index.md) / [KSnackbar](./index.md)

# KSnackbar

`class KSnackbar : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KSnackbar`](./index.md)`>`

View with internal TextView and a Button

**See Also**

[Snackbar](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSnackbar()`<br>View with internal TextView and a Button |

### Properties

| Name | Summary |
|---|---|
| [action](action.md) | `val action: `[`KButton`](../-k-button/index.md) |
| [text](text.md) | `val text: `[`KTextView`](../-k-text-view/index.md) |

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
