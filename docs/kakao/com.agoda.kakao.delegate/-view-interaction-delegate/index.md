[kakao](../../index.md) / [com.agoda.kakao.delegate](../index.md) / [ViewInteractionDelegate](./index.md)

# ViewInteractionDelegate

`class ViewInteractionDelegate : `[`Delegate`](../-delegate/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`

Delegation class for [ViewInteraction](#).
Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

**See Also**

[Delegate](../-delegate/index.md)

[Interceptor](../../com.agoda.kakao.intercept/-interceptor/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ViewInteractionDelegate(interaction: ViewInteraction)`<br>Delegation class for [ViewInteraction](#). Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md). |

### Properties

| Name | Summary |
|---|---|
| [interaction](interaction.md) | `var interaction: ViewInteraction` |
| [interceptor](interceptor.md) | `var interceptor: `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<ViewInteraction, ViewAssertion, ViewAction>?` |

### Functions

| Name | Summary |
|---|---|
| [check](check.md) | `fun check(viewAssert: ViewAssertion): `[`ViewInteractionDelegate`](./index.md) |
| [inRoot](in-root.md) | `fun inRoot(rootMatcher: Matcher<Root>): `[`ViewInteractionDelegate`](./index.md) |
| [kakaoInterceptor](kakao-interceptor.md) | `fun kakaoInterceptor(): `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<ViewInteraction, ViewAssertion, ViewAction>?` |
| [noActivity](no-activity.md) | `fun noActivity(): `[`ViewInteractionDelegate`](./index.md) |
| [perform](perform.md) | `fun perform(vararg viewActions: ViewAction): `[`ViewInteractionDelegate`](./index.md) |
| [screenInterceptors](screen-interceptors.md) | `fun screenInterceptors(): `[`Deque`](https://developer.android.com/reference/java/util/Deque.html)`<`[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<ViewInteraction, ViewAssertion, ViewAction>>` |
| [withFailureHandler](with-failure-handler.md) | `fun withFailureHandler(failureHandler: FailureHandler): `[`ViewInteractionDelegate`](./index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [interceptCheck](../-delegate/intercept-check.md) | `open fun interceptCheck(assertion: `[`ASSERTION`](../-delegate/index.md#ASSERTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `check` operation. |
| [interceptPerform](../-delegate/intercept-perform.md) | `open fun interceptPerform(action: `[`ACTION`](../-delegate/index.md#ACTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `perform` operation. |
