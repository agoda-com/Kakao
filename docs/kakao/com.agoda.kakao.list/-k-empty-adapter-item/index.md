[kakao](../../index.md) / [com.agoda.kakao.list](../index.md) / [KEmptyAdapterItem](./index.md)

# KEmptyAdapterItem

`class KEmptyAdapterItem : `[`KAdapterItem`](../-k-adapter-item/index.md)`<`[`KEmptyAdapterItem`](./index.md)`>`

Empty implementation of KAdapterItem

Use this if you want to perform/assert on the root view of adapter item

### Parameters

`parent` - Matcher of the root view of adapter item

**See Also**

[KAdapterItem](../-k-adapter-item/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KEmptyAdapterItem(parent: DataInteraction)`<br>Empty implementation of KAdapterItem |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../-k-adapter-item/root.md) | `open var root: Matcher<Root!>!` |
| [view](../-k-adapter-item/view.md) | `open val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../-k-adapter-item/invoke.md) | `operator fun invoke(function: `[`T`](../-k-adapter-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../-k-adapter-item/perform.md) | `infix fun perform(function: `[`T`](../-k-adapter-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../-k-adapter-item/index.md#T)<br>Infix function for invoking lambda on your view |
