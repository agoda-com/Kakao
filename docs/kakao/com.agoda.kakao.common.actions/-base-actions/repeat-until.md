[kakao](../../index.md) / [com.agoda.kakao.common.actions](../index.md) / [BaseActions](index.md) / [repeatUntil](./repeat-until.md)

# repeatUntil

`open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Repeats given action on the view until this view will match the given matcher

### Parameters

`maxAttempts` - Maximum repeat count of the action

`action` - Action to be performed

`matcher` - ViewBuilder that will be used as matcher

**See Also**

[ViewActions.repeatedlyUntil](#)

