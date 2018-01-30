[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [KSeekBar](.)

# KSeekBar

`class KSeekBar : `[`KBaseView`](../-k-base-view/index.md)`<KSeekBar>, `[`SeekBarActions`](../-seek-bar-actions/index.md)`, `[`ProgressBarAssertions`](../-progress-bar-assertions/index.md)

View with SeekBarActions and ProgressBarAssertions

**See Also**

[SeekBarActions](../-seek-bar-actions/index.md)

[ProgressBarAssertions](../-progress-bar-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSeekBar(function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSeekBar(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSeekBar(parent: DataInteraction, function: `[`ViewBuilder`](../-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-k-base-view/view.md) | `open val view: ViewInteraction` |

### Inherited Functions

| Name | Summary |
|---|---|
| [dragProgressTo](../-seek-bar-actions/drag-progress-to.md) | `open fun dragProgressTo(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Drags progress to defined position. Please note that this dragging is emulated via Espresso's swipe action and might not be accurate, if progress max value is too high or device's density is too low. |
| [hasProgress](../-progress-bar-assertions/has-progress.md) | `open fun hasProgress(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if view has number of progress as expected |
