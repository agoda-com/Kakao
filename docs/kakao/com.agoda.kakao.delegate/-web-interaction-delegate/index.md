[kakao](../../index.md) / [com.agoda.kakao.delegate](../index.md) / [WebInteractionDelegate](./index.md)

# WebInteractionDelegate

`class WebInteractionDelegate : `[`Delegate`](../-delegate/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>`

Delegation class for [Web.WebInteraction](#).
Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

**See Also**

[Delegate](../-delegate/index.md)

[Interceptor](../../com.agoda.kakao.intercept/-interceptor/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WebInteractionDelegate(interaction: WebInteraction<*>)`<br>Delegation class for [Web.WebInteraction](#). Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md). |

### Properties

| Name | Summary |
|---|---|
| [interaction](interaction.md) | `var interaction: WebInteraction<*>` |
| [interceptor](interceptor.md) | `var interceptor: `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>?` |

### Functions

| Name | Summary |
|---|---|
| [check](check.md) | `fun check(assertion: WebAssertion<*>): `[`WebInteractionDelegate`](./index.md) |
| [forceJavascriptEnabled](force-javascript-enabled.md) | `fun forceJavascriptEnabled(): `[`WebInteractionDelegate`](./index.md) |
| [get](get.md) | `fun get(): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [inWindow](in-window.md) | `fun inWindow(window: WindowReference): `[`WebInteractionDelegate`](./index.md)<br>`fun inWindow(windowPicker: Atom<WindowReference>): `[`WebInteractionDelegate`](./index.md) |
| [kakaoInterceptor](kakao-interceptor.md) | `fun kakaoInterceptor(): `[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>?` |
| [perform](perform.md) | `fun perform(atom: Atom<*>): `[`WebInteractionDelegate`](./index.md) |
| [reset](reset.md) | `fun reset(): `[`WebInteractionDelegate`](./index.md) |
| [screenInterceptors](screen-interceptors.md) | `fun screenInterceptors(): `[`Deque`](https://developer.android.com/reference/java/util/Deque.html)`<`[`Interceptor`](../../com.agoda.kakao.intercept/-interceptor/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>>` |
| [withContextualElement](with-contextual-element.md) | `fun withContextualElement(elementPicker: Atom<ElementReference>): `[`WebInteractionDelegate`](./index.md) |
| [withElement](with-element.md) | `fun withElement(element: ElementReference): `[`WebInteractionDelegate`](./index.md)<br>`fun withElement(elementPicker: Atom<ElementReference>): `[`WebInteractionDelegate`](./index.md) |
| [withNoTimeout](with-no-timeout.md) | `fun withNoTimeout(): `[`WebInteractionDelegate`](./index.md) |
| [withTimeout](with-timeout.md) | `fun withTimeout(amount: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, unit: `[`TimeUnit`](https://developer.android.com/reference/java/util/concurrent/TimeUnit.html)`): `[`WebInteractionDelegate`](./index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [interceptCheck](../-delegate/intercept-check.md) | `open fun interceptCheck(assertion: `[`ASSERTION`](../-delegate/index.md#ASSERTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `check` operation. |
| [interceptPerform](../-delegate/intercept-perform.md) | `open fun interceptPerform(action: `[`ACTION`](../-delegate/index.md#ACTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `perform` operation. |
