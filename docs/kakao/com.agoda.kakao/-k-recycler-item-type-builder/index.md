---
title: KRecyclerItemTypeBuilder - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KRecyclerItemTypeBuilder</a></div>

# KRecyclerItemTypeBuilder

<div class="signature"><code><span class="keyword">class </span><span class="identifier">KRecyclerItemTypeBuilder</span></code></div>

Class that maps types to providing functions

To be able to support different item types in KRecyclerView, this class
adds support for mapping item type classes to functions that provide them.
KEmptyRecyclerItem is added by default.

**See Also**

<a href="item-type.html">itemType</a>

<a href="../-k-empty-recycler-item/index.html">KEmptyRecyclerItem</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KRecyclerItemTypeBuilder</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

Class that maps types to providing functions


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="item-types.html">itemTypes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">itemTypes</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html"><span class="identifier">MutableMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<a href="../-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span><span class="symbol">,</span>&nbsp;<a href="../-k-recycler-item-type/index.html"><span class="identifier">KRecyclerItemType</span></a><span class="symbol">&lt;</span><a href="../-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="item-type.html">itemType</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span> <span class="identifier">itemType</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KRecyclerItemTypeBuilder$itemType(kotlin.Function1((org.hamcrest.Matcher((android.view.View)), com.agoda.kakao.KRecyclerItemTypeBuilder.itemType.T)))/provideItem">provideItem</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">T</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds entry that helps KRecyclerView to automatically build child views


</td>
</tr>
</tbody>
</table>
