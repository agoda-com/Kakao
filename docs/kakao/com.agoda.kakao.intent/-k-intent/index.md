[kakao](../../index.md) / [com.agoda.kakao.intent](../index.md) / [KIntent](./index.md)

# KIntent

`class KIntent`

This class is intended to be used when you need to check if some intent has been sent
or to mock specific intent with result

### Parameters

`builder` - Builder for intent matching

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KIntent(builder: `[`IntentBuilder`](../-intent-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>This class is intended to be used when you need to check if some intent has been sent or to mock specific intent with result |

### Functions

| Name | Summary |
|---|---|
| [intended](intended.md) | `fun intended(verificationMode: VerificationMode? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if this intent has been sent previously |
| [intending](intending.md) | `fun intending(result: `[`ActivityResult`](https://developer.android.com/reference/android/app/Instrumentation/ActivityResult.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Mocks next coming intent that will match with provided result. If no result provided as parameter, function will look up default one set via withResult() in IntentBuilder. If none are present, IllegalStateException will be thrown`fun intending(result: `[`ActivityResultBuilder`](../-activity-result-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Mocks next coming intent that will match with provided result. |
| [invoke](invoke.md) | `operator fun invoke(function: `[`KIntent`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
