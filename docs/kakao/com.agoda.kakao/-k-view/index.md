---
title: KView - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KView</a></div>

# KView

<div class="signature"><code><span class="keyword">class </span><span class="identifier">KView</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><span class="identifier">KView</span><span class="symbol">&gt;</span></code></div>

Simple view with BaseActions and BaseAssertions

**See Also**

<a href="../-base-actions/index.html">BaseActions</a>

<a href="../-base-assertions/index.html">BaseAssertions</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KView</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KView$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">DataInteraction</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

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
