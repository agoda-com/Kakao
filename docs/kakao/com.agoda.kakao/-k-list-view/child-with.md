---
title: KListView.childWith - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KListView</a> / <a href=".">childWith</a></div>

# childWith

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="keyword">reified</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-adapter-item/index.html"><span class="identifier">KAdapterItem</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span> <span class="identifier">childWith</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KListView$childWith(kotlin.Function1((com.agoda.kakao.DataBuilder, kotlin.Unit)))/childMatcher">childMatcher</span><span class="symbol">:</span>&nbsp;<a href="../-data-builder/index.html"><span class="identifier">DataBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">T</span></code></div>

Performs given actions/assertion on child that matches given matcher

### Parameters

<code>T</code> - Type of item at given position. Must be registered via constructor.

<code>childMatcher</code> - Matcher for item in adapter

**Return**
Item with type T. To make actions/assertions on it immediately, use perform() infix function.

