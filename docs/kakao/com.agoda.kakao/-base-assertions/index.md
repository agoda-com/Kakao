---
title: BaseAssertions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">BaseAssertions</a></div>

# BaseAssertions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">BaseAssertions</span></code></div>

Base interface for asserting views

Provides basic assertions that can be performed on any view

**See Also**

<a href="../-text-view-assertions/index.html">TextViewAssertions</a>

<a href="../-editable-assertions/index.html">EditableAssertions</a>

<a href="../-checkable-assertions/index.html">CheckableAssertions</a>

<a href="../-view-pager-assertions/index.html">ViewPagerAssertions</a>

<a href="../-image-view-assertions/index.html">ImageViewAssertions</a>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="view.html">view</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">val </span><span class="identifier">view</span><span class="symbol">: </span><span class="identifier">ViewInteraction</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="assert.html">assert</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">assert</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$assert(kotlin.Function0((android.support.test.espresso.ViewAssertion)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">ViewAssertion</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check the view with the given custom assertion


</td>
</tr>
<tr>
<td markdown="1">

<a href="does-not-exists.html">doesNotExists</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">doesNotExists</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the matched view does not exists


</td>
</tr>
<tr>
<td markdown="1">

<a href="has-any-tag.html">hasAnyTag</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasAnyTag</span><span class="symbol">(</span><span class="keyword">vararg</span> <span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasAnyTag(kotlin.Array((kotlin.String)))/tags">tags</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has at least one of the given tags


</td>
</tr>
<tr>
<td markdown="1">

<a href="has-descendant.html">hasDescendant</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasDescendant</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasDescendant(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given descendant


</td>
</tr>
<tr>
<td markdown="1">

<a href="has-not-descendant.html">hasNotDescendant</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasNotDescendant</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasNotDescendant(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has not given descendant


</td>
</tr>
<tr>
<td markdown="1">

<a href="has-not-sibling.html">hasNotSibling</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasNotSibling</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasNotSibling(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has not given sibling


</td>
</tr>
<tr>
<td markdown="1">

<a href="has-sibling.html">hasSibling</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasSibling</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasSibling(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given sibling


</td>
</tr>
<tr>
<td markdown="1">

<a href="has-tag.html">hasTag</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasTag</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasTag(kotlin.String)/tag">tag</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given tag


</td>
</tr>
<tr>
<td markdown="1">

<a href="in-root.html">inRoot</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">inRoot</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$inRoot(kotlin.Function1((com.agoda.kakao.RootBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-root-builder/index.html"><span class="identifier">RootBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check if the view is in given root


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-clickable.html">isClickable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isClickable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is clickable


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-completely-displayed.html">isCompletelyDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isCompletelyDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is completely displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-disabled.html">isDisabled</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isDisabled</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is disabled


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-displayed.html">isDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-enabled.html">isEnabled</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isEnabled</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is enabled


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-focusable.html">isFocusable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isFocusable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is focusable


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-focused.html">isFocused</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isFocused</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is focused


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-gone.html">isGone</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isGone</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has GONE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-invisible.html">isInvisible</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isInvisible</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has INVISIBLE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-clickable.html">isNotClickable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotClickable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not clickable


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-completely-displayed.html">isNotCompletelyDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotCompletelyDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not completely displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-displayed.html">isNotDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-focusable.html">isNotFocusable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotFocusable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not focusable


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-focused.html">isNotFocused</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotFocused</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not focused


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-selected.html">isNotSelected</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotSelected</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not selected


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-selected.html">isSelected</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isSelected</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is selected


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-visible.html">isVisible</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isVisible</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has VISIBLE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="matches.html">matches</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">matches</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$matches(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check if the view matches given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="not-matches.html">notMatches</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">notMatches</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$notMatches(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check if the view does not match given matcher


</td>
</tr>
</tbody>
</table>

### Inheritors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-checkable-assertions/index.html">CheckableAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">CheckableAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseAssertions</span></code></div>

Provides checkable based assertions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-image-view-assertions/index.html">ImageViewAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ImageViewAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseAssertions</span></code></div>

Provides assertion for image views


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-adapter-item/index.html">KAdapterItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KAdapterItem</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><span class="identifier">BaseAssertions</span></code></div>

Base class for KRecyclerView adapter items


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-base-view/index.html">KBaseView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KBaseView</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><span class="identifier">BaseAssertions</span></code></div>

Base class for all Kakao views


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-list-view/index.html">KListView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KListView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-scroll-view-actions/index.html"><span class="identifier">ScrollViewActions</span></a><span class="symbol">, </span><span class="identifier">BaseAssertions</span></code></div>

View with ScrollViewActions and BaseAssertions. Gives access to it's children


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-recycler-item/index.html">KRecyclerItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KRecyclerItem</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><span class="identifier">BaseAssertions</span></code></div>

Base class for KRecyclerView adapter items


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-recycler-view/index.html">KRecyclerView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KRecyclerView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-recycler-actions/index.html"><span class="identifier">RecyclerActions</span></a><span class="symbol">, </span><span class="identifier">BaseAssertions</span></code></div>

View with RecyclerActions and BaseAssertions. Gives access to it's children


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/index.html">TextViewAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">TextViewAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseAssertions</span></code></div>

Provides text based assertions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-view-pager-assertions/index.html">ViewPagerAssertions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ViewPagerAssertions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseAssertions</span></code></div>

Provides assertions for view pagers


</td>
</tr>
</tbody>
</table>
