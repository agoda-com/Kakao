[kakao](../index.md) / [com.agoda.kakao](.)

## Package com.agoda.kakao

### Types

| Name | Summary |
|---|---|
| [AnyTextMatcher](-any-text-matcher/index.md) | `class AnyTextMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)`>`<br>Matches TextView views which contains any text |
| [BaseActions](-base-actions/index.md) | `interface BaseActions`<br>Base interface for performing actions on view |
| [BaseAssertions](-base-assertions/index.md) | `interface BaseAssertions`<br>Base interface for asserting views |
| [CheckableActions](-checkable-actions/index.md) | `interface CheckableActions : `[`BaseActions`](-base-actions/index.md)<br>Provides action for checking views |
| [CheckableAssertions](-checkable-assertions/index.md) | `interface CheckableAssertions : `[`BaseAssertions`](-base-assertions/index.md)<br>Provides checkable based assertions for views |
| [DataBuilder](-data-builder/index.md) | `class DataBuilder`<br>Class for building data matchers |
| [DrawableMatcher](-drawable-matcher/index.md) | `class DrawableMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches given drawable with current one |
| [DrawerActions](-drawer-actions/index.md) | `interface DrawerActions : `[`BaseActions`](-base-actions/index.md)<br>Provides actions for navigation drawer |
| [EditableActions](-editable-actions/index.md) | `interface EditableActions : `[`BaseActions`](-base-actions/index.md)<br>Provides editable actions for views |
| [EditableAssertions](-editable-assertions/index.md) | `interface EditableAssertions : `[`TextViewAssertions`](-text-view-assertions/index.md)<br>Provides editable based assertions for views |
| [FirstViewMatcher](-first-view-matcher/index.md) | `class FirstViewMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches first view |
| [ImageViewAssertions](-image-view-assertions/index.md) | `interface ImageViewAssertions : `[`BaseAssertions`](-base-assertions/index.md)<br>Provides assertion for image views |
| [IndexMatcher](-index-matcher/index.md) | `class IndexMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches index'th view that matches given matcher |
| [ItemMatcher](-item-matcher/index.md) | `class ItemMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches first RecyclerView descendant which matches specific matcher |
| [KAdapterItem](-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](-base-actions/index.md)`, `[`BaseAssertions`](-base-assertions/index.md)<br>Base class for KRecyclerView adapter items |
| [KAdapterItemType](-k-adapter-item-type/index.md) | `class KAdapterItemType<out T : `[`KAdapterItem`](-k-adapter-item/index.md)`<*>>`<br>For internal use. Don't use manually. |
| [KAdapterItemTypeBuilder](-k-adapter-item-type-builder/index.md) | `class KAdapterItemTypeBuilder`<br>Class that maps types to providing functions |
| [KBaseView](-k-base-view/index.md) | `open class KBaseView<out T> : `[`BaseActions`](-base-actions/index.md)`, `[`BaseAssertions`](-base-assertions/index.md)<br>Base class for all Kakao views |
| [KButton](-k-button/index.md) | `class KButton : `[`KBaseView`](-k-base-view/index.md)`<`[`KButton`](-k-button/index.md)`>, `[`TextViewAssertions`](-text-view-assertions/index.md)<br>View with BaseActions and TextViewAssertions |
| [KCheckBox](-k-check-box/index.md) | `class KCheckBox : `[`KBaseView`](-k-base-view/index.md)`<`[`KCheckBox`](-k-check-box/index.md)`>, `[`CheckableActions`](-checkable-actions/index.md)`, `[`TextViewAssertions`](-text-view-assertions/index.md)`, `[`CheckableAssertions`](-checkable-assertions/index.md)<br>View with CheckableActions, CheckableAssertions and TextViewAssertions |
| [KDrawerView](-k-drawer-view/index.md) | `class KDrawerView : `[`KBaseView`](-k-base-view/index.md)`<`[`KDrawerView`](-k-drawer-view/index.md)`>, `[`DrawerActions`](-drawer-actions/index.md)<br>View with DrawerActions and BaseAssertions |
| [KEditText](-k-edit-text/index.md) | `class KEditText : `[`KBaseView`](-k-base-view/index.md)`<`[`KEditText`](-k-edit-text/index.md)`>, `[`EditableActions`](-editable-actions/index.md)`, `[`EditableAssertions`](-editable-assertions/index.md)<br>View with EditableActions and EditableAssertions |
| [KEmptyAdapterItem](-k-empty-adapter-item/index.md) | `class KEmptyAdapterItem : `[`KAdapterItem`](-k-adapter-item/index.md)`<`[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`>`<br>Empty implementation of KAdapterItem |
| [KEmptyRecyclerItem](-k-empty-recycler-item/index.md) | `class KEmptyRecyclerItem : `[`KRecyclerItem`](-k-recycler-item/index.md)`<`[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`>`<br>Empty implementation of KRecyclerItem |
| [KImageView](-k-image-view/index.md) | `class KImageView : `[`KBaseView`](-k-base-view/index.md)`<`[`KImageView`](-k-image-view/index.md)`>, `[`ImageViewAssertions`](-image-view-assertions/index.md)<br>View with BaseActions and ImageViewAssertions |
| [KListView](-k-list-view/index.md) | `class KListView : `[`ScrollViewActions`](-scroll-view-actions/index.md)`, `[`BaseAssertions`](-base-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KRecyclerItem](-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](-base-actions/index.md)`, `[`BaseAssertions`](-base-assertions/index.md)<br>Base class for KRecyclerView adapter items |
| [KRecyclerItemType](-k-recycler-item-type/index.md) | `class KRecyclerItemType<out T : `[`KRecyclerItem`](-k-recycler-item/index.md)`<*>>`<br>For internal use. Don't use manually. |
| [KRecyclerItemTypeBuilder](-k-recycler-item-type-builder/index.md) | `class KRecyclerItemTypeBuilder`<br>Class that maps types to providing functions |
| [KRecyclerView](-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](-recycler-actions/index.md)`, `[`BaseAssertions`](-base-assertions/index.md)<br>View with RecyclerActions and BaseAssertions. Gives access to it's children |
| [KSwipeView](-k-swipe-view/index.md) | `class KSwipeView : `[`KBaseView`](-k-base-view/index.md)`<`[`KSwipeView`](-k-swipe-view/index.md)`>, `[`SwipeableActions`](-swipeable-actions/index.md)<br>View with SwipeableActions and BaseAssertions |
| [KTextView](-k-text-view/index.md) | `class KTextView : `[`KBaseView`](-k-base-view/index.md)`<`[`KTextView`](-k-text-view/index.md)`>, `[`TextViewAssertions`](-text-view-assertions/index.md)<br>View with BaseActions and TextViewAssertions |
| [KView](-k-view/index.md) | `class KView : `[`KBaseView`](-k-base-view/index.md)`<`[`KView`](-k-view/index.md)`>`<br>Simple view with BaseActions and BaseAssertions |
| [KViewPager](-k-view-pager/index.md) | `class KViewPager : `[`KBaseView`](-k-base-view/index.md)`<`[`KViewPager`](-k-view-pager/index.md)`>, `[`SwipeableActions`](-swipeable-actions/index.md)`, `[`ViewPagerAssertions`](-view-pager-assertions/index.md)<br>View with SwipeableActions and ViewPagerAssertions |
| [KWebView](-k-web-view/index.md) | `open class KWebView`<br>Class for interacting with WebViews |
| [PageMatcher](-page-matcher/index.md) | `class PageMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`ViewPager`](https://developer.android.com/reference/android/support/v4/view/ViewPager.html)`>`<br>Matches ViewPager which page index equals given |
| [PositionMatcher](-position-matcher/index.md) | `class PositionMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches RecyclerView descendant at given position in adapter |
| [RecyclerActions](-recycler-actions/index.md) | `interface RecyclerActions : `[`ScrollableActions`](-scrollable-actions/index.md)<br>Provides ScrollableActions implementation for RecyclerView |
| [RootBuilder](-root-builder/index.md) | `class RootBuilder`<br>Class for building root matchers |
| [Screen](-screen/index.md) | `open class Screen<out T : `[`Screen`](-screen/index.md)`<T>> : `[`ScreenActions`](-screen-actions/index.md)<br>Container class for UI elements. |
| [ScreenActions](-screen-actions/index.md) | `interface ScreenActions`<br>Interface with common actions for all screens |
| [ScrollViewActions](-scroll-view-actions/index.md) | `interface ScrollViewActions : `[`ScrollableActions`](-scrollable-actions/index.md)<br>Provides ScrollableActions implementation for ScrollView |
| [ScrollableActions](-scrollable-actions/index.md) | `interface ScrollableActions : `[`BaseActions`](-base-actions/index.md)<br>Provides scrolling actions for view |
| [SwipeableActions](-swipeable-actions/index.md) | `interface SwipeableActions : `[`BaseActions`](-base-actions/index.md)<br>Provides swipe actions for views |
| [TextViewAssertions](-text-view-assertions/index.md) | `interface TextViewAssertions : `[`BaseAssertions`](-base-assertions/index.md)<br>Provides text based assertions for views |
| [ViewBuilder](-view-builder/index.md) | `class ViewBuilder`<br>Class for building view matchers and interactions |
| [ViewPagerAssertions](-view-pager-assertions/index.md) | `interface ViewPagerAssertions : `[`BaseAssertions`](-base-assertions/index.md)<br>Provides assertions for view pagers |
| [WebActions](-web-actions/index.md) | `interface WebActions`<br>Provides action for interacting with WebViews |
| [WebAssertions](-web-assertions/index.md) | `interface WebAssertions`<br>Interface that provides assertions for WebViews |
| [WebElementBuilder](-web-element-builder/index.md) | `class WebElementBuilder`<br>Class for building WebView element matchers |

### Functions

| Name | Summary |
|---|---|
| [emptyChildAt](empty-child-at.md) | `fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`KListView`](-k-list-view/index.md)`.emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls childAt() on your view with base child |
| [emptyChildWith](empty-child-with.md) | `fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyChildWith(builder: `[`ViewBuilder`](-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)<br>`fun `[`KListView`](-k-list-view/index.md)`.emptyChildWith(builder: `[`DataBuilder`](-data-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)<br>Calls childWith() on your view with base child |
| [emptyFirstChild](empty-first-child.md) | `fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyFirstChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`KListView`](-k-list-view/index.md)`.emptyFirstChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls firstChild() on your view with base child |
| [emptyLastChild](empty-last-child.md) | `fun `[`KRecyclerView`](-k-recycler-view/index.md)`.emptyLastChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`KListView`](-k-list-view/index.md)`.emptyLastChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls lastChild() on your view with base child |
