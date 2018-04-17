[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [RecyclerAdapterAssertions](./index.md)

# RecyclerAdapterAssertions

`interface RecyclerAdapterAssertions : `[`AdapterAssertions`](../-adapter-assertions/index.md)

Provides assertions for recyclerView adapter

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-adapter-assertions/view.md) | `abstract val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [hasSize](has-size.md) | `open fun hasSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check size of recycler view |

### Inheritors

| Name | Summary |
|---|---|
| [KRecyclerView](../-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](../-recycler-actions/index.md)`, `[`BaseAssertions`](../-base-assertions/index.md)`, `[`RecyclerAdapterAssertions`](./index.md)<br>View with RecyclerActions and BaseAssertions. Gives access to it's children |
