[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KProgressBar](.)

# KProgressBar

`class KProgressBar : `[`KBaseView`](../-k-base-view/index.md)`<KProgressBar>, `[`ProgressBarActions`](../-progress-bar-actions/index.md)`, `[`ProgressBarAssertions`](../-progress-bar-assertions/index.md)

View with ProgressBarActions and ProgressBarAssertions

**See Also**

[ProgressBarActions](../-progress-bar-actions/index.md)

[ProgressBarAssertions](../-progress-bar-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KProgressBar(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KProgressBar(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KProgressBar(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [hasProgress](../-progress-bar-assertions/has-progress.md) | `open fun hasProgress(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if view has number of progress as expected |
| [setProgress](../-progress-bar-actions/set-progress.md) | `open fun setProgress(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set progress for ProgressBar |
