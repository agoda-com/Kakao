[kakao](../../index.md) / [com.agoda.kakao.recycler](../index.md) / [RecyclerAdapterAssertions](./index.md)

# RecyclerAdapterAssertions

`interface RecyclerAdapterAssertions : `[`AdapterAssertions`](../../com.agoda.kakao.common.assertions/-adapter-assertions/index.md)

Provides assertions for recyclerView adapter

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../../com.agoda.kakao.common.assertions/-adapter-assertions/view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [hasSize](has-size.md) | `open fun hasSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check size of recycler view |

### Inheritors

| Name | Summary |
|---|---|
| [KRecyclerView](../-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](../-recycler-actions/index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`RecyclerAdapterAssertions`](./index.md)<br>View with RecyclerActions, BaseAssertions and RecyclerAdapterAssertions. Gives access to it's children |
