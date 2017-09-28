---
title: com.agoda.kakao - kakao
---

[kakao](../index.html) / [com.agoda.kakao](.)

## Package com.agoda.kakao

### Types

| [AnyTextMatcher](-any-text-matcher/index.html) | `class AnyTextMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)`>`<br>Matches TextView views which contains any text |
| [BaseActions](-base-actions/index.html) | `interface BaseActions`<br>Base interface for performing actions on view |
| [BaseAssertions](-base-assertions/index.html) | `interface BaseAssertions`<br>Base interface for asserting views |
| [CheckableActions](-checkable-actions/index.html) | `interface CheckableActions : `[`BaseActions`](-base-actions/index.html)<br>Provides action for checking views |
| [CheckableAssertions](-checkable-assertions/index.html) | `interface CheckableAssertions : `[`BaseAssertions`](-base-assertions/index.html)<br>Provides checkable based assertions for views |
| [DataBuilder](-data-builder/index.html) | `class DataBuilder`<br>Class for building data matchers |
| [DrawableMatcher](-drawable-matcher/index.html) | `class DrawableMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches given drawable with current one |
| [DrawerActions](-drawer-actions/index.html) | `interface DrawerActions : `[`BaseActions`](-base-actions/index.html)<br>Provides actions for navigation drawer |
| [EditableActions](-editable-actions/index.html) | `interface EditableActions : `[`BaseActions`](-base-actions/index.html)<br>Provides editable actions for views |
| [EditableAssertions](-editable-assertions/index.html) | `interface EditableAssertions : `[`TextViewAssertions`](-text-view-assertions/index.html)<br>Provides editable based assertions for views |
| [FirstViewMatcher](-first-view-matcher/index.html) | `class FirstViewMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches first view |
| [ImageViewAssertions](-image-view-assertions/index.html) | `interface ImageViewAssertions : `[`BaseAssertions`](-base-assertions/index.html)<br>Provides assertion for image views |
| [IndexMatcher](-index-matcher/index.html) | `class IndexMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches index'th view that matches given matcher |
| [ItemMatcher](-item-matcher/index.html) | `class ItemMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches first RecyclerView descendant which matches specific matcher |
| [KAdapterItem](-k-adapter-item/index.html) | `open class KAdapterItem<out T> : `[`BaseActions`](-base-actions/index.html)`, `[`BaseAssertions`](-base-assertions/index.html)<br>Base class for KRecyclerView adapter items |
| [KAdapterItemType](-k-adapter-item-type/index.html) | `class KAdapterItemType<out T : `[`KAdapterItem`](-k-adapter-item/index.html)`<*>>`<br>For internal use. Don't use manually. |
| [KAdapterItemTypeBuilder](-k-adapter-item-type-builder/index.html) | `class KAdapterItemTypeBuilder`<br>Class that maps types to providing functions |
| [KBaseView](-k-base-view/index.html) | `open class KBaseView<out T> : `[`BaseActions`](-base-actions/index.html)`, `[`BaseAssertions`](-base-assertions/index.html)<br>Base class for all Kakao views |
| [KButton](-k-button/index.html) | `class KButton : `[`KBaseView`](-k-base-view/index.html)`<`[`KButton`](-k-button/index.html)`>, `[`TextViewAssertions`](-text-view-assertions/index.html)<br>View with BaseActions and TextViewAssertions |
| [KCheckBox](-k-check-box/index.html) | `class KCheckBox : `[`KBaseView`](-k-base-view/index.html)`<`[`KCheckBox`](-k-check-box/index.html)`>, `[`CheckableActions`](-checkable-actions/index.html)`, `[`TextViewAssertions`](-text-view-assertions/index.html)`, `[`CheckableAssertions`](-checkable-assertions/index.html)<br>View with CheckableActions, CheckableAssertions and TextViewAssertions |
| [KDrawerView](-k-drawer-view/index.html) | `class KDrawerView : `[`KBaseView`](-k-base-view/index.html)`<`[`KDrawerView`](-k-drawer-view/index.html)`>, `[`DrawerActions`](-drawer-actions/index.html)<br>View with DrawerActions and BaseAssertions |
| [KEditText](-k-edit-text/index.html) | `class KEditText : `[`KBaseView`](-k-base-view/index.html)`<`[`KEditText`](-k-edit-text/index.html)`>, `[`EditableActions`](-editable-actions/index.html)`, `[`EditableAssertions`](-editable-assertions/index.html)<br>View with EditableActions and EditableAssertions |
| [KEmptyAdapterItem](-k-empty-adapter-item/index.html) | `class KEmptyAdapterItem : `[`KAdapterItem`](-k-adapter-item/index.html)`<`[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)`>`<br>Empty implementation of KAdapterItem |
| [KEmptyRecyclerItem](-k-empty-recycler-item/index.html) | `class KEmptyRecyclerItem : `[`KRecyclerItem`](-k-recycler-item/index.html)`<`[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)`>`<br>Empty implementation of KRecyclerItem |
| [KImageView](-k-image-view/index.html) | `class KImageView : `[`KBaseView`](-k-base-view/index.html)`<`[`KImageView`](-k-image-view/index.html)`>, `[`ImageViewAssertions`](-image-view-assertions/index.html)<br>View with BaseActions and ImageViewAssertions |
| [KListView](-k-list-view/index.html) | `class KListView : `[`ScrollViewActions`](-scroll-view-actions/index.html)`, `[`BaseAssertions`](-base-assertions/index.html)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KRecyclerItem](-k-recycler-item/index.html) | `open class KRecyclerItem<out T> : `[`BaseActions`](-base-actions/index.html)`, `[`BaseAssertions`](-base-assertions/index.html)<br>Base class for KRecyclerView adapter items |
| [KRecyclerItemType](-k-recycler-item-type/index.html) | `class KRecyclerItemType<out T : `[`KRecyclerItem`](-k-recycler-item/index.html)`<*>>`<br>For internal use. Don't use manually. |
| [KRecyclerItemTypeBuilder](-k-recycler-item-type-builder/index.html) | `class KRecyclerItemTypeBuilder`<br>Class that maps types to providing functions |
| [KRecyclerView](-k-recycler-view/index.html) | `class KRecyclerView : `[`RecyclerActions`](-recycler-actions/index.html)`, `[`BaseAssertions`](-base-assertions/index.html)<br>View with RecyclerActions and BaseAssertions. Gives access to it's children |
| [KSwipeView](-k-swipe-view/index.html) | `class KSwipeView : `[`KBaseView`](-k-base-view/index.html)`<`[`KSwipeView`](-k-swipe-view/index.html)`>, `[`SwipeableActions`](-swipeable-actions/index.html)<br>View with SwipeableActions and BaseAssertions |
| [KTextView](-k-text-view/index.html) | `class KTextView : `[`KBaseView`](-k-base-view/index.html)`<`[`KTextView`](-k-text-view/index.html)`>, `[`TextViewAssertions`](-text-view-assertions/index.html)<br>View with BaseActions and TextViewAssertions |
| [KView](-k-view/index.html) | `class KView : `[`KBaseView`](-k-base-view/index.html)`<`[`KView`](-k-view/index.html)`>`<br>Simple view with BaseActions and BaseAssertions |
| [KViewPager](-k-view-pager/index.html) | `class KViewPager : `[`KBaseView`](-k-base-view/index.html)`<`[`KViewPager`](-k-view-pager/index.html)`>, `[`SwipeableActions`](-swipeable-actions/index.html)`, `[`ViewPagerAssertions`](-view-pager-assertions/index.html)<br>View with SwipeableActions and ViewPagerAssertions |
| [KWebView](-k-web-view/index.html) | `open class KWebView`<br>Class for interacting with WebViews |
| [PageMatcher](-page-matcher/index.html) | `class PageMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`ViewPager`](https://developer.android.com/reference/android/support/v4/view/ViewPager.html)`>`<br>Matches ViewPager which page index equals given |
| [PositionMatcher](-position-matcher/index.html) | `class PositionMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches RecyclerView descendant at given position in adapter |
| [RecyclerActions](-recycler-actions/index.html) | `interface RecyclerActions : `[`ScrollableActions`](-scrollable-actions/index.html)<br>Provides ScrollableActions implementation for RecyclerView |
| [RootBuilder](-root-builder/index.html) | `class RootBuilder`<br>Class for building root matchers |
| [Screen](-screen/index.html) | `open class Screen<out T : `[`Screen`](-screen/index.html)`<T>> : `[`ScreenActions`](-screen-actions/index.html)<br>Container class for UI elements. |
| [ScreenActions](-screen-actions/index.html) | `interface ScreenActions`<br>Interface with common actions for all screens |
| [ScrollViewActions](-scroll-view-actions/index.html) | `interface ScrollViewActions : `[`ScrollableActions`](-scrollable-actions/index.html)<br>Provides ScrollableActions implementation for ScrollView |
| [ScrollableActions](-scrollable-actions/index.html) | `interface ScrollableActions : `[`BaseActions`](-base-actions/index.html)<br>Provides scrolling actions for view |
| [SwipeableActions](-swipeable-actions/index.html) | `interface SwipeableActions : `[`BaseActions`](-base-actions/index.html)<br>Provides swipe actions for views |
| [TextViewAssertions](-text-view-assertions/index.html) | `interface TextViewAssertions : `[`BaseAssertions`](-base-assertions/index.html)<br>Provides text based assertions for views |
| [ViewBuilder](-view-builder/index.html) | `class ViewBuilder`<br>Class for building view matchers and interactions |
| [ViewPagerAssertions](-view-pager-assertions/index.html) | `interface ViewPagerAssertions : `[`BaseAssertions`](-base-assertions/index.html)<br>Provides assertions for view pagers |
| [WebActions](-web-actions/index.html) | `interface WebActions`<br>Provides action for interacting with WebViews |
| [WebAssertions](-web-assertions/index.html) | `interface WebAssertions`<br>Interface that provides assertions for WebViews |
| [WebElementBuilder](-web-element-builder/index.html) | `class WebElementBuilder`<br>Class for building WebView element matchers |

### Functions

| [emptyChildAt](empty-child-at.html) | `fun `[`KRecyclerView`](-k-recycler-view/index.html)`.emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`KListView`](-k-list-view/index.html)`.emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls childAt() on your view with base child |
| [emptyChildWith](empty-child-with.html) | `fun `[`KRecyclerView`](-k-recycler-view/index.html)`.emptyChildWith(builder: `[`ViewBuilder`](-view-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)<br>`fun `[`KListView`](-k-list-view/index.html)`.emptyChildWith(builder: `[`DataBuilder`](-data-builder/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)<br>Calls childWith() on your view with base child |
| [emptyFirstChild](empty-first-child.html) | `fun `[`KRecyclerView`](-k-recycler-view/index.html)`.emptyFirstChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`KListView`](-k-list-view/index.html)`.emptyFirstChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls firstChild() on your view with base child |
| [emptyLastChild](empty-last-child.html) | `fun `[`KRecyclerView`](-k-recycler-view/index.html)`.emptyLastChild(tail: `[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`KListView`](-k-list-view/index.html)`.emptyLastChild(tail: `[`KEmptyAdapterItem`](-k-empty-adapter-item/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls lastChild() on your view with base child |

