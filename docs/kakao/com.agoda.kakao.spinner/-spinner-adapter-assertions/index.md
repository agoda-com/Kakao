[kakao](../../index.md) / [com.agoda.kakao.spinner](../index.md) / [SpinnerAdapterAssertions](./index.md)

# SpinnerAdapterAssertions

`interface SpinnerAdapterAssertions : `[`AdapterAssertions`](../../com.agoda.kakao.common.assertions/-adapter-assertions/index.md)

Provides assertions for Spinner adapter

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../../com.agoda.kakao.common.assertions/-adapter-assertions/view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [hasSize](has-size.md) | `open fun hasSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check size of Spinner |
| [hasText](has-text.md) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check selected text |

### Inheritors

| Name | Summary |
|---|---|
| [KSpinner](../-k-spinner/index.md) | `class KSpinner : `[`SpinnerAdapterActions`](../-spinner-adapter-actions/index.md)`, `[`SpinnerAdapterAssertions`](./index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md) |
