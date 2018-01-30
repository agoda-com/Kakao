[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [RecyclerActions](.)

# RecyclerActions

`interface RecyclerActions : `[`ScrollableActions`](../-scrollable-actions/index.md)

Provides ScrollableActions implementation for RecyclerView

**See Also**

[ScrollableActions](../-scrollable-actions/index.md)

[RecyclerView](#)

### Functions

| Name | Summary |
|---|---|
| [getSize](get-size.md) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of RecyclerView |
| [scrollTo](scroll-to.md) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view`open fun scrollTo(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun scrollTo(viewBuilder: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to specific view holder that matches given matcher |
| [scrollToEnd](scroll-to-end.md) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](scroll-to-start.md) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |

### Inheritors

| Name | Summary |
|---|---|
| [KRecyclerView](../-k-recycler-view/index.md) | `class KRecyclerView : RecyclerActions, `[`BaseAssertions`](../-base-assertions/index.md)<br>View with RecyclerActions and BaseAssertions. Gives access to it's children |
