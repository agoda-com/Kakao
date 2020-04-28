[kakao](../index.md) / [com.agoda.kakao.common.matchers](./index.md)

## Package com.agoda.kakao.common.matchers

### Types

| Name | Summary |
|---|---|
| [AbsListViewAdapterSizeMatcher](-abs-list-view-adapter-size-matcher/index.md) | `class AbsListViewAdapterSizeMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`AbsListView`](https://developer.android.com/reference/android/widget/AbsListView.html)`>`<br>Matches AbsListView with count of children |
| [AnyTextMatcher](-any-text-matcher/index.md) | `class AnyTextMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)`>`<br>Matches TextView views which contains any text |
| [BackgroundColorMatcher](-background-color-matcher/index.md) | `class BackgroundColorMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches given background color with the current one |
| [ChildCountMatcher](-child-count-matcher/index.md) | `class ChildCountMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches view with size no of children |
| [DrawableMatcher](-drawable-matcher/index.md) | `class DrawableMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches given drawable with current one |
| [FirstViewMatcher](-first-view-matcher/index.md) | `class FirstViewMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches first view |
| [IndexMatcher](-index-matcher/index.md) | `class IndexMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches index'th view that matches given matcher |
| [ItemMatcher](-item-matcher/index.md) | `class ItemMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches first RecyclerView descendant which matches specific matcher |
| [NavigationItemMatcher](-navigation-item-matcher/index.md) | `class NavigationItemMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, NavigationView>`<br>Matches NavigationView with given item id checked |
| [PageMatcher](-page-matcher/index.md) | `class PageMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, ViewPager>`<br>Matches ViewPager which page index equals given |
| [PositionMatcher](-position-matcher/index.md) | `class PositionMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>Matches RecyclerView descendant at given position in adapter |
| [ProgressMatcher](-progress-matcher/index.md) | `class ProgressMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`ProgressBar`](https://developer.android.com/reference/android/widget/ProgressBar.html)`>`<br>Matcher of value progress of given matcher |
| [RatingBarMatcher](-rating-bar-matcher/index.md) | `class RatingBarMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`RatingBar`](https://developer.android.com/reference/android/widget/RatingBar.html)`>`<br>Matcher of value rating of given matcher |
| [RecyclerViewAdapterSizeMatcher](-recycler-view-adapter-size-matcher/index.md) | `class RecyclerViewAdapterSizeMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, RecyclerView>`<br>Matches RecyclerView with count of children |
| [SelectedChipMatcher](-selected-chip-matcher/index.md) | `class SelectedChipMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, Chip>`<br>Matches checked chip |
| [SpinnerAdapterSizeMatcher](-spinner-adapter-size-matcher/index.md) | `class SpinnerAdapterSizeMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, `[`Spinner`](https://developer.android.com/reference/android/widget/Spinner.html)`>`<br>Matches Spinner with count of children |
| [SpinnerPopupMatcher](-spinner-popup-matcher/index.md) | `class SpinnerPopupMatcher : TypeSafeMatcher<Root>`<br>Matches Root View is popup window and contains DropDownView |
| [SwipeRefreshLayoutMatcher](-swipe-refresh-layout-matcher/index.md) | `class SwipeRefreshLayoutMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [TextInputLayoutCounterEnabledMatcher](-text-input-layout-counter-enabled-matcher/index.md) | `class TextInputLayoutCounterEnabledMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [TextInputLayoutErrorEnabledMatcher](-text-input-layout-error-enabled-matcher/index.md) | `class TextInputLayoutErrorEnabledMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [TextInputLayoutHintEnabledMatcher](-text-input-layout-hint-enabled-matcher/index.md) | `class TextInputLayoutHintEnabledMatcher : TypeSafeMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [ToolbarSubtitleMatcher](-toolbar-subtitle-matcher/index.md) | `class ToolbarSubtitleMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, Toolbar>` |
| [ToolbarTitleMatcher](-toolbar-title-matcher/index.md) | `class ToolbarTitleMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, Toolbar>` |
| [ViewPager2AdapterSizeMatcher](-view-pager2-adapter-size-matcher/index.md) | `class ViewPager2AdapterSizeMatcher : BoundedMatcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`, ViewPager2>`<br>Matches ViewPager2 with count of children |
