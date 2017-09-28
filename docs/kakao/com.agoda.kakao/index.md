---
title: com.agoda.kakao - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">kakao</a> / <a href=".">com.agoda.kakao</a></div>

## Package com.agoda.kakao

### Types

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-any-text-matcher/index.html">AnyTextMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">AnyTextMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BoundedMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">,</span>&nbsp;<a href="https://developer.android.com/reference/android/widget/TextView.html"><span class="identifier">TextView</span></a><span class="symbol">&gt;</span></code></div>

Matches TextView views which contains any text


</td>
</tr>
<tr>
<td markdown="1">

<a href="-base-actions/index.html">BaseActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">BaseActions</span></code></div>

Base interface for performing actions on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="-base-assertions/index.html">BaseAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">BaseAssertions</span></code></div>

Base interface for asserting views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-checkable-actions/index.html">CheckableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">CheckableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a></code></div>

Provides action for checking views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-checkable-assertions/index.html">CheckableAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">CheckableAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Provides checkable based assertions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-data-builder/index.html">DataBuilder</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">DataBuilder</span></code></div>

Class for building data matchers


</td>
</tr>
<tr>
<td markdown="1">

<a href="-drawable-matcher/index.html">DrawableMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">DrawableMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">TypeSafeMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches given drawable with current one


</td>
</tr>
<tr>
<td markdown="1">

<a href="-drawer-actions/index.html">DrawerActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">DrawerActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a></code></div>

Provides actions for navigation drawer


</td>
</tr>
<tr>
<td markdown="1">

<a href="-editable-actions/index.html">EditableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">EditableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a></code></div>

Provides editable actions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-editable-assertions/index.html">EditableAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">EditableAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a></code></div>

Provides editable based assertions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-first-view-matcher/index.html">FirstViewMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">FirstViewMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BoundedMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">,</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches first view


</td>
</tr>
<tr>
<td markdown="1">

<a href="-image-view-assertions/index.html">ImageViewAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ImageViewAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Provides assertion for image views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-index-matcher/index.html">IndexMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">IndexMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">TypeSafeMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches index'th view that matches given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="-item-matcher/index.html">ItemMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">ItemMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BoundedMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">,</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches first RecyclerView descendant which matches specific matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-adapter-item/index.html">KAdapterItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KAdapterItem</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for KRecyclerView adapter items


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-adapter-item-type/index.html">KAdapterItemType</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KAdapterItemType</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

For internal use. Don't use manually.


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-adapter-item-type-builder/index.html">KAdapterItemTypeBuilder</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KAdapterItemTypeBuilder</span></code></div>

Class that maps types to providing functions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-base-view/index.html">KBaseView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KBaseView</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for all Kakao views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-button/index.html">KButton</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KButton</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-button/index.html"><span class="identifier">KButton</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a></code></div>

View with BaseActions and TextViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-check-box/index.html">KCheckBox</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KCheckBox</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-check-box/index.html"><span class="identifier">KCheckBox</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-checkable-actions/index.html"><span class="identifier">CheckableActions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-checkable-assertions/index.html"><span class="identifier">CheckableAssertions</span></a></code></div>

View with CheckableActions, CheckableAssertions and TextViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-drawer-view/index.html">KDrawerView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KDrawerView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-drawer-view/index.html"><span class="identifier">KDrawerView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="-drawer-actions/index.html"><span class="identifier">DrawerActions</span></a></code></div>

View with DrawerActions and BaseAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-edit-text/index.html">KEditText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KEditText</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-edit-text/index.html"><span class="identifier">KEditText</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-editable-actions/index.html"><span class="identifier">EditableActions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-editable-assertions/index.html"><span class="identifier">EditableAssertions</span></a></code></div>

View with EditableActions and EditableAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-empty-adapter-item/index.html">KEmptyAdapterItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KEmptyAdapterItem</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><a href="-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a><span class="symbol">&gt;</span></code></div>

Empty implementation of KAdapterItem


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-empty-recycler-item/index.html">KEmptyRecyclerItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KEmptyRecyclerItem</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><a href="-k-empty-recycler-item/index.html"><span class="identifier">KEmptyRecyclerItem</span></a><span class="symbol">&gt;</span></code></div>

Empty implementation of KRecyclerItem


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-image-view/index.html">KImageView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KImageView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-image-view/index.html"><span class="identifier">KImageView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="-image-view-assertions/index.html"><span class="identifier">ImageViewAssertions</span></a></code></div>

View with BaseActions and ImageViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-list-view/index.html">KListView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KListView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-scroll-view-actions/index.html"><span class="identifier">ScrollViewActions</span></a><span class="symbol">, </span><a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

View with ScrollViewActions and BaseAssertions. Gives access to it's children


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-recycler-item/index.html">KRecyclerItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KRecyclerItem</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for KRecyclerView adapter items


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-recycler-item-type/index.html">KRecyclerItemType</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KRecyclerItemType</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

For internal use. Don't use manually.


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-recycler-item-type-builder/index.html">KRecyclerItemTypeBuilder</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KRecyclerItemTypeBuilder</span></code></div>

Class that maps types to providing functions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-recycler-view/index.html">KRecyclerView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KRecyclerView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-recycler-actions/index.html"><span class="identifier">RecyclerActions</span></a><span class="symbol">, </span><a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

View with RecyclerActions and BaseAssertions. Gives access to it's children


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-swipe-view/index.html">KSwipeView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KSwipeView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-swipe-view/index.html"><span class="identifier">KSwipeView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="-swipeable-actions/index.html"><span class="identifier">SwipeableActions</span></a></code></div>

View with SwipeableActions and BaseAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-text-view/index.html">KTextView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KTextView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-text-view/index.html"><span class="identifier">KTextView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a></code></div>

View with BaseActions and TextViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-view/index.html">KView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-view/index.html"><span class="identifier">KView</span></a><span class="symbol">&gt;</span></code></div>

Simple view with BaseActions and BaseAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-view-pager/index.html">KViewPager</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KViewPager</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="-k-view-pager/index.html"><span class="identifier">KViewPager</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-swipeable-actions/index.html"><span class="identifier">SwipeableActions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-view-pager-assertions/index.html"><span class="identifier">ViewPagerAssertions</span></a></code></div>

View with SwipeableActions and ViewPagerAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-k-web-view/index.html">KWebView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KWebView</span></code></div>

Class for interacting with WebViews


</td>
</tr>
<tr>
<td markdown="1">

<a href="-page-matcher/index.html">PageMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">PageMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BoundedMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">,</span>&nbsp;<a href="https://developer.android.com/reference/android/support/v4/view/ViewPager.html"><span class="identifier">ViewPager</span></a><span class="symbol">&gt;</span></code></div>

Matches ViewPager which page index equals given


</td>
</tr>
<tr>
<td markdown="1">

<a href="-position-matcher/index.html">PositionMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">PositionMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BoundedMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">,</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches RecyclerView descendant at given position in adapter


</td>
</tr>
<tr>
<td markdown="1">

<a href="-recycler-actions/index.html">RecyclerActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">RecyclerActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-scrollable-actions/index.html"><span class="identifier">ScrollableActions</span></a></code></div>

Provides ScrollableActions implementation for RecyclerView


</td>
</tr>
<tr>
<td markdown="1">

<a href="-root-builder/index.html">RootBuilder</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">RootBuilder</span></code></div>

Class for building root matchers


</td>
</tr>
<tr>
<td markdown="1">

<a href="-screen/index.html">Screen</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">Screen</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-screen/index.html"><span class="identifier">Screen</span></a><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-screen-actions/index.html"><span class="identifier">ScreenActions</span></a></code></div>

Container class for UI elements.


</td>
</tr>
<tr>
<td markdown="1">

<a href="-screen-actions/index.html">ScreenActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScreenActions</span></code></div>

Interface with common actions for all screens


</td>
</tr>
<tr>
<td markdown="1">

<a href="-scroll-view-actions/index.html">ScrollViewActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScrollViewActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-scrollable-actions/index.html"><span class="identifier">ScrollableActions</span></a></code></div>

Provides ScrollableActions implementation for ScrollView


</td>
</tr>
<tr>
<td markdown="1">

<a href="-scrollable-actions/index.html">ScrollableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScrollableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a></code></div>

Provides scrolling actions for view


</td>
</tr>
<tr>
<td markdown="1">

<a href="-swipeable-actions/index.html">SwipeableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">SwipeableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-actions/index.html"><span class="identifier">BaseActions</span></a></code></div>

Provides swipe actions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-text-view-assertions/index.html">TextViewAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">TextViewAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Provides text based assertions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="-view-builder/index.html">ViewBuilder</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">ViewBuilder</span></code></div>

Class for building view matchers and interactions


</td>
</tr>
<tr>
<td markdown="1">

<a href="-view-pager-assertions/index.html">ViewPagerAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ViewPagerAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Provides assertions for view pagers


</td>
</tr>
<tr>
<td markdown="1">

<a href="-web-actions/index.html">WebActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">WebActions</span></code></div>

Provides action for interacting with WebViews


</td>
</tr>
<tr>
<td markdown="1">

<a href="-web-assertions/index.html">WebAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">WebAssertions</span></code></div>

Interface that provides assertions for WebViews


</td>
</tr>
<tr>
<td markdown="1">

<a href="-web-element-builder/index.html">WebElementBuilder</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">WebElementBuilder</span></code></div>

Class for building WebView element matchers


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="empty-child-at.html">emptyChildAt</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="-k-recycler-view/index.html"><span class="identifier">KRecyclerView</span></a><span class="symbol">.</span><span class="identifier">emptyChildAt</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildAt(com.agoda.kakao.KRecyclerView, kotlin.Int, kotlin.Function1((com.agoda.kakao.KEmptyRecyclerItem, kotlin.Unit)))/position">position</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildAt(com.agoda.kakao.KRecyclerView, kotlin.Int, kotlin.Function1((com.agoda.kakao.KEmptyRecyclerItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-recycler-item/index.html"><span class="identifier">KEmptyRecyclerItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><a href="-k-list-view/index.html"><span class="identifier">KListView</span></a><span class="symbol">.</span><span class="identifier">emptyChildAt</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildAt(com.agoda.kakao.KListView, kotlin.Int, kotlin.Function1((com.agoda.kakao.KEmptyAdapterItem, kotlin.Unit)))/position">position</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildAt(com.agoda.kakao.KListView, kotlin.Int, kotlin.Function1((com.agoda.kakao.KEmptyAdapterItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Calls childAt() on your view with base child


</td>
</tr>
<tr>
<td markdown="1">

<a href="empty-child-with.html">emptyChildWith</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="-k-recycler-view/index.html"><span class="identifier">KRecyclerView</span></a><span class="symbol">.</span><span class="identifier">emptyChildWith</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildWith(com.agoda.kakao.KRecyclerView, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-k-empty-recycler-item/index.html"><span class="identifier">KEmptyRecyclerItem</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><a href="-k-list-view/index.html"><span class="identifier">KListView</span></a><span class="symbol">.</span><span class="identifier">emptyChildWith</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildWith(com.agoda.kakao.KListView, kotlin.Function1((com.agoda.kakao.DataBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="-data-builder/index.html"><span class="identifier">DataBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a></code></div>

Calls childWith() on your view with base child


</td>
</tr>
<tr>
<td markdown="1">

<a href="empty-first-child.html">emptyFirstChild</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="-k-recycler-view/index.html"><span class="identifier">KRecyclerView</span></a><span class="symbol">.</span><span class="identifier">emptyFirstChild</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyFirstChild(com.agoda.kakao.KRecyclerView, kotlin.Function1((com.agoda.kakao.KEmptyRecyclerItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-recycler-item/index.html"><span class="identifier">KEmptyRecyclerItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><a href="-k-list-view/index.html"><span class="identifier">KListView</span></a><span class="symbol">.</span><span class="identifier">emptyFirstChild</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyFirstChild(com.agoda.kakao.KListView, kotlin.Function1((com.agoda.kakao.KEmptyAdapterItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Calls firstChild() on your view with base child


</td>
</tr>
<tr>
<td markdown="1">

<a href="empty-last-child.html">emptyLastChild</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="-k-recycler-view/index.html"><span class="identifier">KRecyclerView</span></a><span class="symbol">.</span><span class="identifier">emptyLastChild</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyLastChild(com.agoda.kakao.KRecyclerView, kotlin.Function1((com.agoda.kakao.KEmptyRecyclerItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-recycler-item/index.html"><span class="identifier">KEmptyRecyclerItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><a href="-k-list-view/index.html"><span class="identifier">KListView</span></a><span class="symbol">.</span><span class="identifier">emptyLastChild</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyLastChild(com.agoda.kakao.KListView, kotlin.Function1((com.agoda.kakao.KEmptyAdapterItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Calls lastChild() on your view with base child


</td>
</tr>
</tbody>
</table>
