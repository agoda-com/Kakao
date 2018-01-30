[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KBottomNavigationView](.)

# KBottomNavigationView

`class KBottomNavigationView : `[`KBaseView`](../-k-base-view/index.md)`<KBottomNavigationView>, `[`BottomNavigationViewActions`](../-bottom-navigation-view-actions/index.md)`, `[`BottomNavigationViewAssertions`](../-bottom-navigation-view-assertions/index.md)

View for acting and asserting on BottomNavigationView

**See Also**

[BottomNavigationViewActions](../-bottom-navigation-view-actions/index.md)

[BottomNavigationViewAssertions](../-bottom-navigation-view-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KBottomNavigationView(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KBottomNavigationView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KBottomNavigationView(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [hasSelectedItem](../-bottom-navigation-view-assertions/has-selected-item.md) | `open fun hasSelectedItem(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view's selected item id matches given one |
| [setSelectedItem](../-bottom-navigation-view-actions/set-selected-item.md) | `open fun setSelectedItem(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the given item id as selected |
