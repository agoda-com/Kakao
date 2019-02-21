[kakao](../../index.md) / [com.agoda.kakao.progress](../index.md) / [SeekBarActions](./index.md)

# SeekBarActions

`interface SeekBarActions : `[`ProgressBarActions`](../-progress-bar-actions/index.md)

Provides action for SeekBar

### Functions

| Name | Summary |
|---|---|
| [dragProgressTo](drag-progress-to.md) | `open fun dragProgressTo(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Drags progress to defined position. Please note that this dragging is emulated via Espresso's swipe action and might not be accurate, if progress max value is too high or device's density is too low. |

### Inherited Functions

| Name | Summary |
|---|---|
| [setProgress](../-progress-bar-actions/set-progress.md) | `open fun setProgress(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set progress for ProgressBar |

### Inheritors

| Name | Summary |
|---|---|
| [KSeekBar](../-k-seek-bar/index.md) | `class KSeekBar : `[`KBaseView`](../../com.agoda.kakao.common.views/-k-base-view/index.md)`<`[`KSeekBar`](../-k-seek-bar/index.md)`>, `[`SeekBarActions`](./index.md)`, `[`ProgressBarAssertions`](../-progress-bar-assertions/index.md)<br>View with SeekBarActions and ProgressBarAssertions |
