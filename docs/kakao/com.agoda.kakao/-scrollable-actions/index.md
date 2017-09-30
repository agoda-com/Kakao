---
title: ScrollableActions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">ScrollableActions</a></div>

# ScrollableActions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScrollableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-base-actions/index.html"><span class="identifier">BaseActions</span></a></code></div>

Provides scrolling actions for view

Important: does not hold any implementation

**See Also**

<a href="../-recycler-actions/index.html">RecyclerActions</a>

<a href="../-scroll-view-actions/index.html">ScrollViewActions</a>

### Inherited Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-base-actions/view.html">view</a>


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

<a href="scroll-to.html">scrollTo</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ScrollableActions$scrollTo(kotlin.Int)/position">position</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the specific position of the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll-to-end.html">scrollToEnd</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">fun </span><span class="identifier">scrollToEnd</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the last position of the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll-to-start.html">scrollToStart</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">fun </span><span class="identifier">scrollToStart</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the starting position of the view


</td>
</tr>
</tbody>
</table>

### Inherited Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-base-actions/act.html">act</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">act</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseActions$act(kotlin.Function0((android.support.test.espresso.ViewAction)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">ViewAction</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs custom action on a view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/click.html">click</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">click</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$click(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/double-click.html">doubleClick</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">doubleClick</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$doubleClick(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs double click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/long-click.html">longClick</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">longClick</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$longClick(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs long click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/on-failure.html">onFailure</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">onFailure</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$onFailure(kotlin.Function2((kotlin.Throwable, org.hamcrest.Matcher((android.view.View)), kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">error</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html"><span class="identifier">Throwable</span></a><span class="symbol">,</span>&nbsp;<span class="parameterName">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds failure handler to the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/scroll-to.html">scrollTo</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the view, if possible


</td>
</tr>
</tbody>
</table>

### Inheritors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-recycler-actions/index.html">RecyclerActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">RecyclerActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">ScrollableActions</span></code></div>

Provides ScrollableActions implementation for RecyclerView


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-scroll-view-actions/index.html">ScrollViewActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScrollViewActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">ScrollableActions</span></code></div>

Provides ScrollableActions implementation for ScrollView


</td>
</tr>
</tbody>
</table>
