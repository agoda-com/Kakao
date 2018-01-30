[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KIntent](index.md) / [intending](.)

# intending

`fun intending(result: `[`ActivityResult`](https://developer.android.com/reference/android/app/Instrumentation/ActivityResult.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Mocks next coming intent that will match with provided result.
If no result provided as parameter, function will look up default one
set via withResult() in IntentBuilder. If none are present, IllegalStateException
will be thrown

### Parameters

`result` - Activity result to return when matched intent is sent. null by default

### Exceptions

`IllegalStateException` - if result is null and default result is not set

**See Also**

[IntentBuilder.withResult](../-intent-builder/with-result.md)

`fun intending(result: `[`ActivityResultBuilder`](../-activity-result-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Mocks next coming intent that will match with provided result.

### Parameters

`result` - Builder for activity result to return when matching intent is sent