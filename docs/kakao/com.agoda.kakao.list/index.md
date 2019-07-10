[kakao](../index.md) / [com.agoda.kakao.list](./index.md)

## Package com.agoda.kakao.list

### Types

| Name | Summary |
|---|---|
| [AbsListViewAdapterActions](-abs-list-view-adapter-actions/index.md) | `interface AbsListViewAdapterActions` |
| [AbsListViewAdapterAssertions](-abs-list-view-adapter-assertions/index.md) | `interface AbsListViewAdapterAssertions : `[`AdapterAssertions`](../com.agoda.kakao.common.assertions/-adapter-assertions/index.md)<br>Provides assertions for AbsListView adapter |
| [DataBuilder](-data-builder/index.md) | `class DataBuilder`<br>Class for building data matchers |
| [KAbsListView](-k-abs-list-view/index.md) | `class KAbsListView : `[`ScrollViewActions`](../com.agoda.kakao.scroll/-scroll-view-actions/index.md)`, `[`AbsListViewAdapterActions`](-abs-list-view-adapter-actions/index.md)`, `[`BaseAssertions`](../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`AbsListViewAdapterAssertions`](-abs-list-view-adapter-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KAdapterItem](-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KAbsListView adapter items |
| [KAdapterItemType](-k-adapter-item-type/index.md) | `class KAdapterItemType<out T : `[`KAdapterItem`](-k-adapter-item/index.md)`<*>>`<br>For internal use. Don't use manually. |
| [KAdapterItemTypeBuilder](-k-adapter-item-type-builder/index.md) | `class KAdapterItemTypeBuilder`<br>Class that maps types to providing functions |
| [KEmptyAdapterItem](-k-empty-adapter-item/index.md) | `class KEmptyAdapterItem : `[`KAdapterItem`](-k-adapter-item/index.md)`<`[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`>`<br>Empty implementation of KAdapterItem |
