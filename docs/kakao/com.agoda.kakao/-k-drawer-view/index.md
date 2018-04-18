[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KDrawerView](./index.md)

# KDrawerView

`class KDrawerView : `[`KBaseView`](../-k-base-view/index.md)`<`[`KDrawerView`](./index.md)`>, `[`DrawerActions`](../-drawer-actions/index.md)

View with DrawerActions and BaseAssertions

**See Also**

[DrawerActions](../-drawer-actions/index.md)

[BaseAssertions](../-base-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KDrawerView(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KDrawerView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KDrawerView(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [close](../-drawer-actions/close.md) | `open fun close(gravity: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Gravity.START): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Closes the navigation drawer |
| [invoke](../-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [open](../-drawer-actions/open.md) | `open fun open(gravity: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Gravity.START): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Opens the navigation drawer |
| [perform](../-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
