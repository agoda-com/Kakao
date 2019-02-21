[kakao](../index.md) / [com.agoda.kakao.list](./index.md)

## Package com.agoda.kakao.list

### Types

| Name | Summary |
|---|---|
| [DataBuilder](-data-builder/index.md) | `class DataBuilder`<br>Class for building data matchers |
| [KAdapterItem](-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../com.agoda.kakao.common.assertions/-base-assertions/index.md)<br>Base class for KRecyclerView adapter items |
| [KAdapterItemType](-k-adapter-item-type/index.md) | `class KAdapterItemType<out T : `[`KAdapterItem`](-k-adapter-item/index.md)`<*>>`<br>For internal use. Don't use manually. |
| [KAdapterItemTypeBuilder](-k-adapter-item-type-builder/index.md) | `class KAdapterItemTypeBuilder`<br>Class that maps types to providing functions |
| [KEmptyAdapterItem](-k-empty-adapter-item/index.md) | `class KEmptyAdapterItem : `[`KAdapterItem`](-k-adapter-item/index.md)`<`[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`>`<br>Empty implementation of KAdapterItem |
| [KListView](-k-list-view/index.md) | `class KListView : `[`ScrollViewActions`](-scroll-view-actions/index.md)`, `[`BaseAssertions`](../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`ListViewAdapterAssertions`](-list-view-adapter-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [ListViewAdapterAssertions](-list-view-adapter-assertions/index.md) | `interface ListViewAdapterAssertions : `[`AdapterAssertions`](../com.agoda.kakao.common.assertions/-adapter-assertions/index.md)<br>Provides assertions for listView adapter |
| [ScrollViewActions](-scroll-view-actions/index.md) | `interface ScrollViewActions : `[`ScrollableActions`](../com.agoda.kakao.common.actions/-scrollable-actions/index.md)`, `[`SwipeableActions`](../com.agoda.kakao.common.actions/-swipeable-actions/index.md)<br>Provides ScrollableActions implementation for ScrollView |
