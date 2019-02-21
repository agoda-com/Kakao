[kakao](../../index.md) / [com.agoda.kakao.recycler](../index.md) / [RecyclerActions](./index.md)

# RecyclerActions

`interface RecyclerActions : `[`ScrollableActions`](../../com.agoda.kakao.common.actions/-scrollable-actions/index.md)`, `[`SwipeableActions`](../../com.agoda.kakao.common.actions/-swipeable-actions/index.md)

Provides ScrollableActions implementation for RecyclerView

**See Also**

[ScrollableActions](../../com.agoda.kakao.common.actions/-scrollable-actions/index.md)

[SwipeableActions](../../com.agoda.kakao.common.actions/-swipeable-actions/index.md)

[RecyclerView](#)

### Functions

| Name | Summary |
|---|---|
| [getSize](get-size.md) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of RecyclerView |
| [scrollTo](scroll-to.md) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view`open fun scrollTo(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun scrollTo(viewBuilder: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to specific view holder that matches given matcher |
| [scrollToEnd](scroll-to-end.md) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](scroll-to-start.md) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |

### Inherited Functions

| Name | Summary |
|---|---|
| [swipeDown](../../com.agoda.kakao.common.actions/-swipeable-actions/swipe-down.md) | `open fun swipeDown(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes down on the view |
| [swipeLeft](../../com.agoda.kakao.common.actions/-swipeable-actions/swipe-left.md) | `open fun swipeLeft(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes left on the view |
| [swipeRight](../../com.agoda.kakao.common.actions/-swipeable-actions/swipe-right.md) | `open fun swipeRight(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes right on the view |
| [swipeUp](../../com.agoda.kakao.common.actions/-swipeable-actions/swipe-up.md) | `open fun swipeUp(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes up on the view |

### Inheritors

| Name | Summary |
|---|---|
| [KRecyclerView](../-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](./index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`RecyclerAdapterAssertions`](../-recycler-adapter-assertions/index.md)<br>View with RecyclerActions, BaseAssertions and RecyclerAdapterAssertions. Gives access to it's children |
