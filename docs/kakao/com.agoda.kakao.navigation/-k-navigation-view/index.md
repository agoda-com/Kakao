[kakao](../../index.md) / [com.agoda.kakao.navigation](../index.md) / [KNavigationView](./index.md)

# KNavigationView

`class KNavigationView : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KNavigationView`](./index.md)`>, `[`NavigationViewActions`](../-navigation-view-actions/index.md)`, `[`NavigationViewAssertions`](../-navigation-view-assertions/index.md)

View with NavigationViewActions and NavigationViewAssertions

**See Also**

[NavigationViewActions](../-navigation-view-actions/index.md)

[NavigationViewAssertions](../-navigation-view-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KNavigationView(function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KNavigationView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KNavigationView(parent: DataInteraction, function: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../com.agoda.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../com.agoda.kakao.common.views/-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../../com.agoda.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [isItemChecked](../-navigation-view-assertions/is-item-checked.md) | `open fun isItemChecked(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if NavigationView has checked given item id |
| [navigateTo](../-navigation-view-actions/navigate-to.md) | `open fun navigateTo(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clicks on the navigation view menu item with given id |
| [perform](../../com.agoda.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../com.agoda.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
