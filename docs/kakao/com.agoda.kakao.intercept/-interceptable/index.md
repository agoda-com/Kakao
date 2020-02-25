[kakao](../../index.md) / [com.agoda.kakao.intercept](../index.md) / [Interceptable](./index.md)

# Interceptable

`interface Interceptable<INTERACTION, ASSERTION, ACTION>`

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `abstract val view: `[`Delegate`](../../com.agoda.kakao.delegate/-delegate/index.md)`<`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`, `[`ACTION`](index.md#ACTION)`>` |

### Functions

| Name | Summary |
|---|---|
| [intercept](intercept.md) | `open fun intercept(builder: `[`Interceptor.Builder`](../-interceptor/-builder/index.md)`<`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`, `[`ACTION`](index.md#ACTION)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptors for the instance. Interceptors will be invoked on the interaction with the KView. |
| [reset](reset.md) | `open fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes the interceptors from the instance. |

### Inheritors

| Name | Summary |
|---|---|
| [KAdapterItem](../../com.agoda.kakao.list/-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](./index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KAbsListView adapter items |
| [KBaseView](../../com.agoda.kakao.common.views/-k-base-view/index.md) | `open class KBaseView<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](./index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for all Kakao views |
| [KRecyclerItem](../../com.agoda.kakao.recycler/-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](./index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KRecyclerView adapter items |
| [KViewPagerItem](../../com.agoda.kakao.pager2/-k-view-pager-item/index.md) | `open class KViewPagerItem<out T> : `[`BaseActions`](../../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](./index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KViewPager2 adapter items |
| [WebElementBuilder](../../com.agoda.kakao.web/-web-element-builder/index.md) | `class WebElementBuilder : `[`Interceptable`](./index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>`<br>Class for building WebView element matchers |
