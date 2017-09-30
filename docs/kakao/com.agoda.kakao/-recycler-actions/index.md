---
title: RecyclerActions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">RecyclerActions</a></div>

# RecyclerActions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">RecyclerActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-scrollable-actions/index.html"><span class="identifier">ScrollableActions</span></a></code></div>

Provides ScrollableActions implementation for RecyclerView

**See Also**

<a href="../-scrollable-actions/index.html">ScrollableActions</a>

<a href="https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html">RecyclerView</a>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="get-size.html">getSize</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">getSize</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

Returns the size of RecyclerView


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll-to.html">scrollTo</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RecyclerActions$scrollTo(kotlin.Int)/position">position</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the specific position of the view

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RecyclerActions$scrollTo(org.hamcrest.Matcher((android.view.View)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RecyclerActions$scrollTo(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/viewBuilder">viewBuilder</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to specific view holder that matches given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll-to-end.html">scrollToEnd</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollToEnd</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the last position of the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll-to-start.html">scrollToStart</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollToStart</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the starting position of the view


</td>
</tr>
</tbody>
</table>

### Inheritors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-k-recycler-view/index.html">KRecyclerView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KRecyclerView</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">RecyclerActions</span><span class="symbol">, </span><a href="../-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

View with RecyclerActions and BaseAssertions. Gives access to it's children


</td>
</tr>
</tbody>
</table>
