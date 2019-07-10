[kakao](../index.md) / [com.agoda.kakao.recycler](./index.md)

## Package com.agoda.kakao.recycler

### Types

| Name | Summary |
|---|---|
| [KEmptyRecyclerItem](-k-empty-recycler-item/index.md) | `class KEmptyRecyclerItem : `[`KRecyclerItem`](-k-recycler-item/index.md)`<`[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`>`<br>Empty implementation of KRecyclerItem |
| [KRecyclerItem](-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](../com.agoda.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../com.agoda.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KRecyclerView adapter items |
| [KRecyclerItemType](-k-recycler-item-type/index.md) | `class KRecyclerItemType<out T : `[`KRecyclerItem`](-k-recycler-item/index.md)`<*>>`<br>For internal use. Don't use manually. |
| [KRecyclerItemTypeBuilder](-k-recycler-item-type-builder/index.md) | `class KRecyclerItemTypeBuilder`<br>Class that maps types to providing functions |
| [KRecyclerView](-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](-recycler-actions/index.md)`, `[`BaseAssertions`](../com.agoda.kakao.common.assertions/-base-assertions/index.md)`, `[`RecyclerAdapterAssertions`](-recycler-adapter-assertions/index.md)<br>View with RecyclerActions, BaseAssertions and RecyclerAdapterAssertions. Gives access to it's children |
| [RecyclerActions](-recycler-actions/index.md) | `interface RecyclerActions : `[`ScrollableActions`](../com.agoda.kakao.common.actions/-scrollable-actions/index.md)`, `[`SwipeableActions`](../com.agoda.kakao.common.actions/-swipeable-actions/index.md)<br>Provides ScrollableActions implementation for RecyclerView |
| [RecyclerAdapterAssertions](-recycler-adapter-assertions/index.md) | `interface RecyclerAdapterAssertions : `[`AdapterAssertions`](../com.agoda.kakao.common.assertions/-adapter-assertions/index.md)<br>Provides assertions for recyclerView adapter |
