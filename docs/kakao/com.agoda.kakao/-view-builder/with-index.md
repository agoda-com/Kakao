[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [ViewBuilder](index.md) / [withIndex](./with-index.md)

# withIndex

`fun withIndex(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, function: `[`ViewBuilder`](index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Matches only view at given [index](with-index.md#com.agoda.kakao.ViewBuilder$withIndex(kotlin.Int, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/index), if there are multiple views that matches

IMPORTANT: this matcher is single-use only, since it does not reset it's
index counter due to specific espresso's matching process. Thus only one action
and/or assertion can be performed on such a [KView](../-k-view/index.md).

If you need to match view with index multiple times, each time you should match
with new instance of [withIndex](./with-index.md)

Take a look at the example:

```
class InputScreen : Screen<InputScreen>() {
    fun inputLayout(lambda: KEditText.() -> Unit) = KEditText { withIndex(0, { withId(R.id.input_layout) }) }.invoke(lambda)
}

@Test
fun test() {
    screen {
        inputLayout {
            replaceText("EXAMPLE")
        }

        inputLayout {
            hasAnyText()
        }
    }
}
```

### Parameters

`index` - Index of the view to match

`function` - [ViewBuilder](index.md) that will result in matcher