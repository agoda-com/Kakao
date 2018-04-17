[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [IntentBuilder](index.md) / [hasData](./has-data.md)

# hasData

`fun hasData(uri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)
`fun hasData(uri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches intent with given data

### Parameters

`uri` - Uri to be matched`fun hasData(uri: Matcher<`[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches intent with given data

### Parameters

`uri` - Matcher for the uri`fun hasData(function: `[`UriBuilder`](../-uri-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches intent with given data

### Parameters

`function` - Builder for a uri to match