---
title: KDrawerView - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KDrawerView</a></div>

# KDrawerView

<div class="signature"><code><span class="keyword">class </span><span class="identifier">KDrawerView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><span class="identifier">KDrawerView</span><span class="symbol">&gt;</span><span class="symbol">, </span><a href="../-drawer-actions/index.html"><span class="identifier">DrawerActions</span></a></code></div>

View with DrawerActions and BaseAssertions

**See Also**

<a href="../-drawer-actions/index.html">DrawerActions</a>

<a href="../-base-assertions/index.html">BaseAssertions</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KDrawerView</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KDrawerView$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KDrawerView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KDrawerView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KDrawerView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KDrawerView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KDrawerView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">DataInteraction</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KDrawerView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Inherited Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-k-base-view/view.html">view</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">val </span><span class="identifier">view</span><span class="symbol">: </span><span class="identifier">ViewInteraction</span></code></div>

</td>
</tr>
</tbody>
</table>

### Inherited Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-drawer-actions/close.html">close</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">close</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DrawerActions$close(kotlin.Int)/gravity">gravity</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a>&nbsp;<span class="symbol">=</span>&nbsp;Gravity.START<span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Closes the navigation drawer


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-drawer-actions/open.html">open</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">open</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DrawerActions$open(kotlin.Int)/gravity">gravity</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a>&nbsp;<span class="symbol">=</span>&nbsp;Gravity.START<span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Opens the navigation drawer


</td>
</tr>
</tbody>
</table>
