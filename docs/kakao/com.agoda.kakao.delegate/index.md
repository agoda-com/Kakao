[kakao](../index.md) / [com.agoda.kakao.delegate](./index.md)

## Package com.agoda.kakao.delegate

### Types

| Name | Summary |
|---|---|
| [DataInteractionDelegate](-data-interaction-delegate/index.md) | `class DataInteractionDelegate : `[`Delegate`](-delegate/index.md)`<DataInteraction, ViewAssertion, ViewAction>`<br>Delegation class for [DataInteraction](#). Wraps all available public calls and intercepts [check](-data-interaction-delegate/check.md) and [perform](-data-interaction-delegate/perform.md). |
| [Delegate](-delegate/index.md) | `interface Delegate<INTERACTION, ASSERTION, ACTION>`<br>Base delegate interface. |
| [ViewInteractionDelegate](-view-interaction-delegate/index.md) | `class ViewInteractionDelegate : `[`Delegate`](-delegate/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Delegation class for [ViewInteraction](#). Wraps all available public calls and intercepts [check](-view-interaction-delegate/check.md) and [perform](-view-interaction-delegate/perform.md). |
| [WebInteractionDelegate](-web-interaction-delegate/index.md) | `class WebInteractionDelegate : `[`Delegate`](-delegate/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>`<br>Delegation class for [Web.WebInteraction](#). Wraps all available public calls and intercepts [check](-web-interaction-delegate/check.md) and [perform](-web-interaction-delegate/perform.md). |
