---
title: KViewPager - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [KViewPager](.)

# KViewPager

`class KViewPager : `[`KBaseView`](../-k-base-view/index.html)`<KViewPager>, `[`SwipeableActions`](../-swipeable-actions/index.html)`, `[`ViewPagerAssertions`](../-view-pager-assertions/index.html)

View with SwipeableActions and ViewPagerAssertions

**See Also**

[SwipeableActions](../-swipeable-actions/index.html)

[ViewPagerAssertions](../-view-pager-assertions/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `KViewPager(function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KViewPager(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KViewPager(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| [view](../-k-base-view/view.html) | `open val view: ViewInteraction` |

### Inherited Functions

| [isAtPage](../-view-pager-assertions/is-at-page.html) | `open fun isAtPage(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is currently at given page |
| [swipeDown](../-swipeable-actions/swipe-down.html) | `open fun swipeDown(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes down on the view |
| [swipeLeft](../-swipeable-actions/swipe-left.html) | `open fun swipeLeft(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes left on the view |
| [swipeRight](../-swipeable-actions/swipe-right.html) | `open fun swipeRight(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes right on the view |
| [swipeUp](../-swipeable-actions/swipe-up.html) | `open fun swipeUp(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes up on the view |

