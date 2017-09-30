---
title: KWebView.invoke - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KWebView</a> / <a href=".">invoke</a></div>

# invoke

<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="identifier">invoke</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KWebView$invoke(kotlin.Function1((com.agoda.kakao.WebElementBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-web-element-builder/index.html"><span class="identifier">WebElementBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Operator that allows usage of DSL style

### Parameters

<code>function</code> - WebElementBuilder which will give you access to match elements
and perform actions/assertions on it.