---
title: RecyclerActions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [RecyclerActions](.)

# RecyclerActions

`interface RecyclerActions : `[`ScrollableActions`](../-scrollable-actions/index.html)

Provides ScrollableActions implementation for RecyclerView

**See Also**

[ScrollableActions](../-scrollable-actions/index.html)

[RecyclerView](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html)

### Functions

| [getSize](get-size.html) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of RecyclerView |
| [scrollTo](scroll-to.html) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view`open fun scrollTo(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun scrollTo(viewBuilder: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to specific view holder that matches given matcher |
| [scrollToEnd](scroll-to-end.html) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](scroll-to-start.html) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |

### Inheritors

| [KRecyclerView](../-k-recycler-view/index.html) | `class KRecyclerView : RecyclerActions, `[`BaseAssertions`](../-base-assertions/index.html)<br>View with RecyclerActions and BaseAssertions. Gives access to it's children |

