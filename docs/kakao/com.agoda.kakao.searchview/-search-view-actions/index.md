[kakao](../../index.md) / [com.agoda.kakao.searchview](../index.md) / [SearchViewActions](./index.md)

# SearchViewActions

`interface SearchViewActions : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../../com.agoda.kakao.common.actions/-base-actions/view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../com.agoda.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [appendQuery](append-query.md) | `open fun appendQuery(query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [typeQuery](type-query.md) | `open fun typeQuery(query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../../com.agoda.kakao.common.actions/-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](../../com.agoda.kakao.common.actions/-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](../../com.agoda.kakao.common.actions/-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](../../com.agoda.kakao.common.actions/-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](../../com.agoda.kakao.common.actions/-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](../../com.agoda.kakao.common.actions/-base-actions/press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](../../com.agoda.kakao.common.actions/-base-actions/repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [scrollTo](../../com.agoda.kakao.common.actions/-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [KSearchView](../-k-search-view/index.md) | `class KSearchView : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KSearchView`](../-k-search-view/index.md)`>, `[`SearchViewActions`](./index.md)`, `[`SearchViewAssertions`](../-search-view-assertions/index.md) |
