---
title: KRecyclerItem.<init> - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KRecyclerItem</a> / <a href=".">&lt;init&gt;</a></div>

# &lt;init&gt;

<div class="signature"><code><span class="identifier">KRecyclerItem</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KRecyclerItem$<init>(org.hamcrest.Matcher((android.view.View)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span></code></div>

Base class for KRecyclerView adapter items

Please extend this class to provide custom recycler view item types

### Parameters

<code>T</code> - type of your item. Used to enable invoke() and perform() on descendants

<code>matcher</code> - Matcher of root view of adapter item. Can be used as parent for all views inside item.

**See Also**

<a href="../-k-recycler-item-type-builder/index.html">KRecyclerItemTypeBuilder</a>

