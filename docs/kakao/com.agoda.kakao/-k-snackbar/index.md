[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KSnackbar](./index.md)

# KSnackbar

`class KSnackbar : `[`KBaseView`](../-k-base-view/index.md)`<`[`KSnackbar`](./index.md)`>`

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
| [view](../-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
