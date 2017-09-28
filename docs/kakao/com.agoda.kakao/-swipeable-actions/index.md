---
title: SwipeableActions - kakao
---

[kakao](../../index.html) / [com.agoda.kakao](../index.html) / [SwipeableActions](.)

# SwipeableActions

`interface SwipeableActions : `[`BaseActions`](../-base-actions/index.html)

Provides swipe actions for views

### Inherited Properties

| [view](../-base-actions/view.html) | `abstract val view: ViewInteraction` |

### Functions

| [swipeDown](swipe-down.html) | `open fun swipeDown(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes down on the view |
| [swipeLeft](swipe-left.html) | `open fun swipeLeft(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes left on the view |
| [swipeRight](swipe-right.html) | `open fun swipeRight(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes right on the view |
| [swipeUp](swipe-up.html) | `open fun swipeUp(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes up on the view |

### Inherited Functions

| [act](../-base-actions/act.html) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](../-base-actions/click.html) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](../-base-actions/double-click.html) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](../-base-actions/long-click.html) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](../-base-actions/on-failure.html) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [scrollTo](../-base-actions/scroll-to.html) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| [KSwipeView](../-k-swipe-view/index.html) | `class KSwipeView : `[`KBaseView`](../-k-base-view/index.html)`<`[`KSwipeView`](../-k-swipe-view/index.html)`>, SwipeableActions`<br>View with SwipeableActions and BaseAssertions |
| [KViewPager](../-k-view-pager/index.html) | `class KViewPager : `[`KBaseView`](../-k-base-view/index.html)`<`[`KViewPager`](../-k-view-pager/index.html)`>, SwipeableActions, `[`ViewPagerAssertions`](../-view-pager-assertions/index.html)<br>View with SwipeableActions and ViewPagerAssertions |

