[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KNavigationView](.)

# KNavigationView

`class KNavigationView : `[`KBaseView`](../-k-base-view/index.md)`<KNavigationView>, `[`NavigationViewActions`](../-navigation-view-actions/index.md)`, `[`NavigationViewAssertions`](../-navigation-view-assertions/index.md)

View with NavigationViewActions and NavigationViewAssertions

**See Also**

[NavigationViewActions](../-navigation-view-actions/index.md)

[NavigationViewAssertions](../-navigation-view-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KNavigationView(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KNavigationView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KNavigationView(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [isItemChecked](../-navigation-view-assertions/is-item-checked.md) | `open fun isItemChecked(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if NavigationView has checked given item id |
| [navigateTo](../-navigation-view-actions/navigate-to.md) | `open fun navigateTo(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clicks on the navigation view menu item with given id |
