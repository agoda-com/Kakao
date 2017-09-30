---
title: KRecyclerView.perform - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KRecyclerView</a> / <a href=".">perform</a></div>

# perform

<div class="signature"><code><span class="keyword">infix</span> <span class="keyword">fun </span><span class="identifier">perform</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KRecyclerView$perform(kotlin.Function1((com.agoda.kakao.KRecyclerView, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="index.html"><span class="identifier">KRecyclerView</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="index.html"><span class="identifier">KRecyclerView</span></a></code></div>

Infix function for invoking lambda on your view

Sometimes instance of view is a result of a function or constructor.
In this specific case you can't call invoke() since it will be considered as
tail lambda of your fun/constructor. In such cases please use this function.

### Parameters

<code>function</code> - Tail lambda with receiver which is your view

**Return**
This object

