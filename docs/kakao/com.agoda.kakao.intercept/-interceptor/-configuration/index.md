[kakao](../../../index.md) / [com.agoda.kakao.intercept](../../index.md) / [Interceptor](../index.md) / [Configuration](./index.md)

# Configuration

`data class Configuration`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Configuration(viewInterceptor: `[`Interceptor`](../index.md)`<ViewInteraction, ViewAssertion, ViewAction>?, dataInterceptor: `[`Interceptor`](../index.md)`<DataInteraction, ViewAssertion, ViewAction>?, webInterceptor: `[`Interceptor`](../index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>?)` |

### Properties

| Name | Summary |
|---|---|
| [dataInterceptor](data-interceptor.md) | `val dataInterceptor: `[`Interceptor`](../index.md)`<DataInteraction, ViewAssertion, ViewAction>?` |
| [viewInterceptor](view-interceptor.md) | `val viewInterceptor: `[`Interceptor`](../index.md)`<ViewInteraction, ViewAssertion, ViewAction>?` |
| [webInterceptor](web-interceptor.md) | `val webInterceptor: `[`Interceptor`](../index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>?` |
