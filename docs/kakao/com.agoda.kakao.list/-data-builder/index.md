[kakao](../../index.md) / [com.agoda.kakao.list](../index.md) / [DataBuilder](./index.md)

# DataBuilder

`class DataBuilder`

Class for building data matchers

This class helps to build matches for data.
Please note that any function invoking will add specific matcher to the list
and after that all of them will be combined with help of AllOf.allOf()

**See Also**

[AllOf.allOf](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DataBuilder()`<br>Class for building data matchers |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(obj: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches data which is equal to given object |
| [getDataMatcher](get-data-matcher.md) | `fun getDataMatcher(): Matcher<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Returns combined data matchers with AllOf.allOf() |
| [isInstanceOf](is-instance-of.md) | `fun isInstanceOf(clazz: `[`Class`](https://developer.android.com/reference/java/lang/Class.html)`<*>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches data whose class matches given class |
| [notEquals](not-equals.md) | `fun notEquals(obj: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches data which is not equal to given object |
| [withMatcher](with-matcher.md) | `fun withMatcher(matcher: Matcher<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches data with given custom matcher |
