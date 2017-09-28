---
title: ScrollViewActions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [ScrollViewActions](.)

# ScrollViewActions

`interface ScrollViewActions : `[`ScrollableActions`](../-scrollable-actions/index.html)

Provides ScrollableActions implementation for ScrollView

**See Also**

[ScrollableActions](../-scrollable-actions/index.html)

[ScrollView](https://developer.android.com/reference/android/widget/ScrollView.html)

### Functions

| [getSize](get-size.html) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of ScrollView |
| [scrollTo](scroll-to.html) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view |
| [scrollToEnd](scroll-to-end.html) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](scroll-to-start.html) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |

### Inheritors

| [KListView](../-k-list-view/index.html) | `class KListView : ScrollViewActions, `[`BaseAssertions`](../-base-assertions/index.html)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |

