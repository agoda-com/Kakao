---
title: ScrollViewActions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">ScrollViewActions</a></div>

# ScrollViewActions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScrollViewActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-scrollable-actions/index.html"><span class="identifier">ScrollableActions</span></a></code></div>

Provides ScrollableActions implementation for ScrollView

**See Also**

<a href="../-scrollable-actions/index.html">ScrollableActions</a>

<a href="https://developer.android.com/reference/android/widget/ScrollView.html">ScrollView</a>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="get-size.html">getSize</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">getSize</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

Returns the size of ScrollView


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll-to.html">scrollTo</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ScrollViewActions$scrollTo(kotlin.Int)/position">position</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the specific position of the view


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

<a href="../-k-list-view/index.html">KListView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KListView</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">ScrollViewActions</span><span class="symbol">, </span><a href="../-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

View with ScrollViewActions and BaseAssertions. Gives access to it's children


</td>
</tr>
</tbody>
</table>
