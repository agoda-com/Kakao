---
title: KAdapterItemTypeBuilder - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KAdapterItemTypeBuilder</a></div>

# KAdapterItemTypeBuilder

<div class="signature"><code><span class="keyword">class </span><span class="identifier">KAdapterItemTypeBuilder</span></code></div>

Class that maps types to providing functions

To be able to support different item types in KListView, this class
adds support for mapping item type classes to functions that provide them.
KEmptyAdapterItem is added by default.

**See Also**

<a href="item-type.html">itemType</a>

<a href="../-k-empty-adapter-item/index.html">KEmptyAdapterItem</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KAdapterItemTypeBuilder</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

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
<div class="signature"><code><span class="keyword">val </span><span class="identifier">itemTypes</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html"><span class="identifier">MutableMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<a href="../-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span><span class="symbol">,</span>&nbsp;<a href="../-k-adapter-item-type/index.html"><span class="identifier">KAdapterItemType</span></a><span class="symbol">&lt;</span><a href="../-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

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
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span> <span class="identifier">itemType</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KAdapterItemTypeBuilder$itemType(kotlin.Function1((android.support.test.espresso.DataInteraction, com.agoda.kakao.KAdapterItemTypeBuilder.itemType.T)))/provideItem">provideItem</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="identifier">DataInteraction</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">T</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds entry that helps KListView to automatically build child views


</td>
</tr>
</tbody>
</table>
