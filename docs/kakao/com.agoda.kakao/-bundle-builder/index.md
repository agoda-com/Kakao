[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [BundleBuilder](.)

# BundleBuilder

`class BundleBuilder`

Class for building Bundle matchers

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BundleBuilder()`<br>Class for building Bundle matchers |

### Functions

| Name | Summary |
|---|---|
| [getMatcher](get-matcher.md) | `fun getMatcher(): Matcher<`[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`>` |
| [hasEntry](has-entry.md) | `fun hasEntry(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasEntry(key: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, value: Matcher<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches bundle with given entry |
| [hasKey](has-key.md) | `fun hasKey(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasKey(key: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches bundle with given key |
| [hasValue](has-value.md) | `fun hasValue(value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasValue(value: Matcher<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches bundle with given value |
