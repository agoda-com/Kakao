---
title: KRecyclerView.lastChild - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KRecyclerView</a> / <a href=".">lastChild</a></div>

# lastChild

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="keyword">reified</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-recycler-item/index.html"><span class="identifier">KRecyclerItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span> <span class="identifier">lastChild</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KRecyclerView$lastChild(kotlin.Function1((com.agoda.kakao.KRecyclerView.lastChild.T, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">T</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs given actions/assertion on last child in adapter

### Parameters

<code>T</code> - Type of item at last position. Must be registered via constructor.

<code>function</code> - Tail lambda which receiver will be matched item with given type T