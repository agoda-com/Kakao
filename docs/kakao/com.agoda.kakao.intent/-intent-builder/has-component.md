[kakao](../../index.md) / [com.agoda.kakao.intent](../index.md) / [IntentBuilder](index.md) / [hasComponent](./has-component.md)

# hasComponent

`fun hasComponent(className: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches intent which component has given class name

### Parameters

`className` - Class name to be matched in intent's component`fun hasComponent(component: `[`ComponentName`](https://developer.android.com/reference/android/content/ComponentName.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches intent with given component

### Parameters

`component` - Component name to be matched`fun hasComponent(component: Matcher<`[`ComponentName`](https://developer.android.com/reference/android/content/ComponentName.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches intent with given component

### Parameters

`component` - Matcher for component name`fun hasComponent(function: `[`ComponentNameBuilder`](../-component-name-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches intent with given component

### Parameters

`function` - Builder for a component to match