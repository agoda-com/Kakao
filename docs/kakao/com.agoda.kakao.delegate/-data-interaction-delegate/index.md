[kakao](../../index.md) / [com.agoda.kakao.delegate](../index.md) / [DataInteractionDelegate](./index.md)

# DataInteractionDelegate

`class DataInteractionDelegate : `[`Delegate`](../-delegate/index.md)`<DataInteraction, ViewAssertion, ViewAction>`

Delegation class for [DataInteraction](#).
Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

**See Also**

[Delegate](../-delegate/index.md)

[Interceptor](../../com.agoda.kakao.intercept/-interceptor/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DataInteractionDelegate(interaction: DataInteraction)`<br>Delegation class for [DataInteraction](#). Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md). |

### Properties

| Name | Summary |
|---|---|
| [interaction](interaction.md) | `var interaction: DataInteraction` |
| [interceptor](interceptor.md) | `var interceptor: `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<DataInteraction, ViewAssertion, ViewAction>?` |

### Functions

| Name | Summary |
|---|---|
| [atPosition](at-position.md) | `fun atPosition(atPosition: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`DataInteractionDelegate`](./index.md) |
| [check](check.md) | `fun check(viewAssert: ViewAssertion): `[`ViewInteractionDelegate`](../-view-interaction-delegate/index.md) |
| [inAdapterView](in-adapter-view.md) | `fun inAdapterView(adapterMatcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`DataInteractionDelegate`](./index.md) |
| [inRoot](in-root.md) | `fun inRoot(rootMatcher: Matcher<Root>): `[`DataInteractionDelegate`](./index.md) |
| [kakaoInterceptor](kakao-interceptor.md) | `fun kakaoInterceptor(): `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<DataInteraction, ViewAssertion, ViewAction>?` |
| [onChildView](on-child-view.md) | `fun onChildView(childMatcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`DataInteractionDelegate`](./index.md) |
| [perform](perform.md) | `fun perform(vararg viewActions: ViewAction): `[`ViewInteractionDelegate`](../-view-interaction-delegate/index.md) |
| [screenInterceptors](screen-interceptors.md) | `fun screenInterceptors(): `[`Deque`](https://developer.android.com/reference/java/util/Deque.html)`<`[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<DataInteraction, ViewAssertion, ViewAction>>` |
| [usingAdapterViewProtocol](using-adapter-view-protocol.md) | `fun usingAdapterViewProtocol(adapterViewProtocol: AdapterViewProtocol): `[`DataInteractionDelegate`](./index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [interceptCheck](../-delegate/intercept-check.md) | `open fun interceptCheck(assertion: `[`ASSERTION`](../-delegate/index.md#ASSERTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `check` operation. |
| [interceptPerform](../-delegate/intercept-perform.md) | `open fun interceptPerform(action: `[`ACTION`](../-delegate/index.md#ACTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `perform` operation. |
