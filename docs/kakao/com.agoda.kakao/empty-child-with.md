---
title: emptyChildWith - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">kakao</a> / <a href="index.html">com.agoda.kakao</a> / <a href=".">emptyChildWith</a></div>

# emptyChildWith

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><a href="-k-recycler-view/index.html"><span class="identifier">KRecyclerView</span></a><span class="symbol">.</span><span class="identifier">emptyChildWith</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildWith(com.agoda.kakao.KRecyclerView, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-k-empty-recycler-item/index.html"><span class="identifier">KEmptyRecyclerItem</span></a></code></div>

Calls childWith() on your view with base child

Calls childWith() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

<code>builder</code> - View builder that will match the child view

**Return**
Matched KEmptyRecyclerItem

**See Also**

<a href="-k-empty-recycler-item/index.html">KEmptyRecyclerItem</a>

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><a href="-k-list-view/index.html"><span class="identifier">KListView</span></a><span class="symbol">.</span><span class="identifier">emptyChildWith</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyChildWith(com.agoda.kakao.KListView, kotlin.Function1((com.agoda.kakao.DataBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="-data-builder/index.html"><span class="identifier">DataBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a></code></div>

Calls childWith() on your view with base child

Calls childWith() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

<code>builder</code> - Data builder that will match the child view

**Return**
Matched KEmptyAdapterItem

**See Also**

<a href="-k-empty-adapter-item/index.html">KEmptyAdapterItem</a>

</div>
