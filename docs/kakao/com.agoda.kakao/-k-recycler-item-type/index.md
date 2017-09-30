---
title: KRecyclerItemType - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KRecyclerItemType</a></div>

# KRecyclerItemType

<div class="signature"><code><span class="keyword">class </span><span class="identifier">KRecyclerItemType</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

For internal use. Don't use manually.

Holds type and corresponding provider function

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KRecyclerItemType</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KRecyclerItemType$<init>(kotlin.Function1((org.hamcrest.Matcher((android.view.View)), com.agoda.kakao.KRecyclerItemType.T)))/provideItem">provideItem</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">T</span><span class="symbol">)</span></code></div>

For internal use. Don't use manually.


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="provide-item.html">provideItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">provideItem</span><span class="symbol">: </span><span class="symbol">(</span><span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">T</span></code></div>

</td>
</tr>
</tbody>
</table>
