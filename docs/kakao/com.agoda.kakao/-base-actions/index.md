---
title: BaseActions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">BaseActions</a></div>

# BaseActions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">BaseActions</span></code></div>

Base interface for performing actions on view

Provides a lot of basic action methods, such as click(), scrollTo(), etc.

**See Also**

<a href="../-editable-actions/index.html">EditableActions</a>

<a href="../-swipeable-actions/index.html">SwipeableActions</a>

<a href="../-scrollable-actions/index.html">ScrollableActions</a>

<a href="../-checkable-actions/index.html">CheckableActions</a>

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

<a href="act.html">act</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">act</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseActions$act(kotlin.Function0((android.support.test.espresso.ViewAction)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">ViewAction</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs custom action on a view


</td>
</tr>
<tr>
<td markdown="1">

<a href="click.html">click</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">click</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$click(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="double-click.html">doubleClick</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">doubleClick</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$doubleClick(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs double click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="long-click.html">longClick</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">longClick</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$longClick(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs long click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="on-failure.html">onFailure</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">onFailure</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$onFailure(kotlin.Function2((kotlin.Throwable, org.hamcrest.Matcher((android.view.View)), kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">error</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html"><span class="identifier">Throwable</span></a><span class="symbol">,</span>&nbsp;<span class="parameterName">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds failure handler to the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll-to.html">scrollTo</a>


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

<a href="../-checkable-actions/index.html">CheckableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">CheckableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span></code></div>

Provides action for checking views


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-drawer-actions/index.html">DrawerActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">DrawerActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span></code></div>

Provides actions for navigation drawer


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-editable-actions/index.html">EditableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">EditableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span></code></div>

Provides editable actions for views


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-adapter-item/index.html">KAdapterItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KAdapterItem</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span><span class="symbol">, </span><a href="../-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for KRecyclerView adapter items


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-base-view/index.html">KBaseView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KBaseView</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span><span class="symbol">, </span><a href="../-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for all Kakao views


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-recycler-item/index.html">KRecyclerItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KRecyclerItem</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span><span class="symbol">, </span><a href="../-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for KRecyclerView adapter items


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-scrollable-actions/index.html">ScrollableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScrollableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span></code></div>

Provides scrolling actions for view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-swipeable-actions/index.html">SwipeableActions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">SwipeableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BaseActions</span></code></div>

Provides swipe actions for views


</td>
</tr>
</tbody>
</table>
