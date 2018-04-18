[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KEmptyRecyclerItem](./index.md)

# KEmptyRecyclerItem

`class KEmptyRecyclerItem : `[`KRecyclerItem`](../-k-recycler-item/index.md)`<`[`KEmptyRecyclerItem`](./index.md)`>`

Empty implementation of KRecyclerItem

Use this if you want to perform/assert on the root view of view holder

### Parameters

`parent` - Matcher of the root view of view holder

**See Also**

[KRecyclerItem](../-k-recycler-item/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KEmptyRecyclerItem(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>)`<br>Empty implementation of KRecyclerItem |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-k-recycler-item/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../-k-recycler-item/invoke.md) | `operator fun invoke(function: `[`T`](../-k-recycler-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../-k-recycler-item/perform.md) | `infix fun perform(function: `[`T`](../-k-recycler-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../-k-recycler-item/index.md#T)<br>Infix function for invoking lambda on your view |
