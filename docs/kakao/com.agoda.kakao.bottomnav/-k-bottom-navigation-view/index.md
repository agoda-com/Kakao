[kakao](../../index.md) / [com.agoda.kakao.bottomnav](../index.md) / [KBottomNavigationView](./index.md)

# KBottomNavigationView

`class KBottomNavigationView : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KBottomNavigationView`](./index.md)`>, `[`BottomNavigationViewActions`](../-bottom-navigation-view-actions/index.md)`, `[`BottomNavigationViewAssertions`](../-bottom-navigation-view-assertions/index.md)

View for acting and asserting on BottomNavigationView

**See Also**

[BottomNavigationViewActions](../-bottom-navigation-view-actions/index.md)

[BottomNavigationViewAssertions](../-bottom-navigation-view-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KBottomNavigationView(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KBottomNavigationView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KBottomNavigationView(parent: DataInteraction, function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../com.agoda.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../com.agoda.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [hasSelectedItem](../-bottom-navigation-view-assertions/has-selected-item.md) | `open fun hasSelectedItem(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view's selected item id matches given one |
| [invoke](../../com.agoda.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../../com.agoda.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
| [setSelectedItem](../-bottom-navigation-view-actions/set-selected-item.md) | `open fun setSelectedItem(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the given item id as selected |
