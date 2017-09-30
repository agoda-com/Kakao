---
title: KListView.childAt - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KListView</a> / <a href=".">childAt</a></div>

# childAt

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="keyword">reified</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span> <span class="identifier">childAt</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KListView$childAt(kotlin.Int, kotlin.Function1((com.agoda.kakao.KListView.childAt.T, kotlin.Unit)))/position">position</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KListView$childAt(kotlin.Int, kotlin.Function1((com.agoda.kakao.KListView.childAt.T, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">T</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs given actions/assertion on child at given position

### Parameters

<code>T</code> - Type of item at given position. Must be registered via constructor.

<code>position</code> - Position of item in adapter

<code>function</code> - Tail lambda which receiver will be matched item with given type T