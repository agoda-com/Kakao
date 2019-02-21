[kakao](../../index.md) / [com.agoda.kakao.progress](../index.md) / [SeekBarActions](index.md) / [dragProgressTo](./drag-progress-to.md)

# dragProgressTo

`open fun dragProgressTo(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Drags progress to defined position.
Please note that this dragging is emulated via Espresso's swipe action
and might not be accurate, if progress max value is too high or device's
density is too low.

### Parameters

`number` - of progress to drag to

**See Also**

[GeneralSwipeAction](#)

