---
title: KRecyclerItemTypeBuilder.itemType - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KRecyclerItemTypeBuilder</a> / <a href=".">itemType</a></div>

# itemType

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="keyword">reified</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span> <span class="identifier">itemType</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">noinline</span> <span class="parameterName" id="com.agoda.kakao.KRecyclerItemTypeBuilder$itemType(kotlin.Function1((org.hamcrest.Matcher((android.view.View)), com.agoda.kakao.KRecyclerItemTypeBuilder.itemType.T)))/provideItem">provideItem</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">T</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds entry that helps KRecyclerView to automatically build child views

To make it work, you need to pass here function (lambda, constructor), that takes matcher and returns
instance of your item type. In this case, matcher actually matches root view of your adapter item.

### Parameters

<code>provideItem</code> - Function that takes matcher of item's root view and returns instance of item view