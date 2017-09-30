---
title: KAdapterItemTypeBuilder.itemType - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KAdapterItemTypeBuilder</a> / <a href=".">itemType</a></div>

# itemType

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="keyword">reified</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span> <span class="identifier">itemType</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">noinline</span> <span class="parameterName" id="com.agoda.kakao.KAdapterItemTypeBuilder$itemType(kotlin.Function1((android.support.test.espresso.DataInteraction, com.agoda.kakao.KAdapterItemTypeBuilder.itemType.T)))/provideItem">provideItem</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="identifier">DataInteraction</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">T</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds entry that helps KListView to automatically build child views

To make it work, you need to pass here function (lambda, constructor), that takes matcher and returns
instance of your item type. In this case, matcher actually matches your KListView and additional
matchers that were used (in firstChild(), childAt(), etc.)

### Parameters

<code>provideItem</code> - Function that takes data interaction of list view and returns instance of item view