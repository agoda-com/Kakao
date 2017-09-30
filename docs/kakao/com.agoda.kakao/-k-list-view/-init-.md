---
title: KListView.<init> - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KListView</a> / <a href=".">&lt;init&gt;</a></div>

# &lt;init&gt;

<div class="signature"><code><span class="identifier">KListView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KListView$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)), kotlin.Function1((com.agoda.kakao.KAdapterItemTypeBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KListView$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)), kotlin.Function1((com.agoda.kakao.KAdapterItemTypeBuilder, kotlin.Unit)))/itemTypeBuilder">itemTypeBuilder</span><span class="symbol">:</span>&nbsp;<a href="../-k-adapter-item-type-builder/index.html"><span class="identifier">KAdapterItemTypeBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

View with ScrollViewActions and BaseAssertions. Gives access to it's children

### Parameters

<code>builder</code> - ViewBuilder which will match your list view

<code>itemTypeBuilder</code> - Lambda with receiver where you pass your item providers

**See Also**

<a href="../-scroll-view-actions/index.html">ScrollViewActions</a>

<a href="../-base-assertions/index.html">BaseAssertions</a>

<a href="../-k-adapter-item/index.html">KAdapterItem</a>

<a href="../-k-adapter-item-type-builder/index.html">KAdapterItemTypeBuilder</a>

