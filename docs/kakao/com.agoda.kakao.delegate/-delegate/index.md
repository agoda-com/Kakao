[kakao](../../index.md) / [com.agoda.kakao.delegate](../index.md) / [Delegate](./index.md)

# Delegate

`interface Delegate<INTERACTION, ASSERTION, ACTION>`

Base delegate interface.

Provides functionality of aggregating interceptors and invoking them on `check`
and `perform` invocations.

**See Also**

[Interceptor](../../com.agoda.kakao.intercept/-interceptor/index.md)

### Properties

| Name | Summary |
|---|---|
| [interaction](interaction.md) | `abstract var interaction: `[`INTERACTION`](index.md#INTERACTION) |
| [interceptor](interceptor.md) | `abstract var interceptor: `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`, `[`ACTION`](index.md#ACTION)`>?` |

### Functions

| Name | Summary |
|---|---|
| [interceptCheck](intercept-check.md) | `open fun interceptCheck(assertion: `[`ASSERTION`](index.md#ASSERTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `check` operation. |
| [interceptPerform](intercept-perform.md) | `open fun interceptPerform(action: `[`ACTION`](index.md#ACTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `perform` operation. |
| [kakaoInterceptor](kakao-interceptor.md) | `abstract fun kakaoInterceptor(): `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`, `[`ACTION`](index.md#ACTION)`>?` |
| [screenInterceptors](screen-interceptors.md) | `abstract fun screenInterceptors(): `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`, `[`ACTION`](index.md#ACTION)`>>` |

### Inheritors

| Name | Summary |
|---|---|
| [DataInteractionDelegate](../-data-interaction-delegate/index.md) | `class DataInteractionDelegate : `[`Delegate`](./index.md)`<DataInteraction, ViewAssertion, ViewAction>`<br>Delegation class for [DataInteraction](#). Wraps all available public calls and intercepts [check](../-data-interaction-delegate/check.md) and [perform](../-data-interaction-delegate/perform.md). |
| [ViewInteractionDelegate](../-view-interaction-delegate/index.md) | `class ViewInteractionDelegate : `[`Delegate`](./index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Delegation class for [ViewInteraction](#). Wraps all available public calls and intercepts [check](../-view-interaction-delegate/check.md) and [perform](../-view-interaction-delegate/perform.md). |
| [WebInteractionDelegate](../-web-interaction-delegate/index.md) | `class WebInteractionDelegate : `[`Delegate`](./index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>`<br>Delegation class for [Web.WebInteraction](#). Wraps all available public calls and intercepts [check](../-web-interaction-delegate/check.md) and [perform](../-web-interaction-delegate/perform.md). |
