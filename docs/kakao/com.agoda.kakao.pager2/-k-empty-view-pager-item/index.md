[kakao](../../index.md) / [com.agoda.kakao.pager2](../index.md) / [KEmptyViewPagerItem](./index.md)

# KEmptyViewPagerItem

`class KEmptyViewPagerItem : `[`KViewPagerItem`](../-k-view-pager-item/index.md)`<`[`KEmptyViewPagerItem`](./index.md)`>`

Empty implementation of KViewPagerItem

Use this if you want to perform/assert on the root view of view holder

### Parameters

`parent` - Matcher of the root view of view holder

**See Also**

[KViewPagerItem](../-k-view-pager-item/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KEmptyViewPagerItem(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>)`<br>Empty implementation of KViewPagerItem |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../-k-view-pager-item/root.md) | `open var root: Matcher<Root!>!` |
| [view](../-k-view-pager-item/view.md) | `open val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../-k-view-pager-item/invoke.md) | `operator fun invoke(function: `[`T`](../-k-view-pager-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../-k-view-pager-item/perform.md) | `infix fun perform(function: `[`T`](../-k-view-pager-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../-k-view-pager-item/index.md#T)<br>Infix function for invoking lambda on your view |
