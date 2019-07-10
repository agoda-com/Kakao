[kakao](../../index.md) / [com.agoda.kakao.intercept](../index.md) / [Interceptor](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Interceptor(onCheck: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?, onPerform: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`, `[`ACTION`](index.md#ACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?, onAll: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?)`

Base class for intercepting the call chain from Kakao to Espresso.

Interceptors can be provided through [Kakao](../../com.agoda.kakao/-kakao/index.md) runtime,
different [Screens](../../com.agoda.kakao.screen/-screen/index.md) as well as [KViews](../../com.agoda.kakao.common.views/-k-base-view/index.md).

Interceptors are stacked during the runtime for any Kakao-Espresso `check` and `perform` operations.
The stack ordering is following: KView interceptor -&gt; Screen interceptors -&gt; Kakao interceptor.

Any of the interceptors in the chain can break the chain call by setting `isOverride` to true
in [onCheck](-builder/on-check.md), [onPerform](-builder/on-perform.md) or [onAll](-builder/on-all.md) interception
functions during the configuration. Doing this will not only prevent underlying
interceptors from being invoked, but prevents Kakao from executing the operation. In that case,
responsibility for actually making Espresso call lies on developer.

For each operation the interceptor invocation cycle will be as follows:

```
// For check operation
onAll?.invoke()
onCheck?.invoke()

// For perform operation
onAll?.invoke()
onPerform?.invoke()
```

**See Also**

[com.agoda.kakao.Kakao](../../com.agoda.kakao/-kakao/index.md)

[com.agoda.kakao.screen.Screen](../../com.agoda.kakao.screen/-screen/index.md)

[com.agoda.kakao.common.views.KBaseView](../../com.agoda.kakao.common.views/-k-base-view/index.md)

