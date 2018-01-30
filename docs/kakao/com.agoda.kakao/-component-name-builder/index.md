[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [ComponentNameBuilder](.)

# ComponentNameBuilder

`class ComponentNameBuilder`

Class for building ComponentName matchers

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ComponentNameBuilder()`<br>Class for building ComponentName matchers |

### Functions

| Name | Summary |
|---|---|
| [getMatcher](get-matcher.md) | `fun getMatcher(): Matcher<`[`ComponentName`](https://developer.android.com/reference/android/content/ComponentName.html)`>` |
| [hasClassName](has-class-name.md) | `fun hasClassName(className: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasClassName(className: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches component name with given class |
| [hasMyPackageName](has-my-package-name.md) | `fun hasMyPackageName(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches component name if it's package name the same as your app's |
| [hasPackageName](has-package-name.md) | `fun hasPackageName(packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasPackageName(packageName: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches component name with given package |
| [hasShortClassName](has-short-class-name.md) | `fun hasShortClassName(className: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasShortClassName(className: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches component name with given short class name |
