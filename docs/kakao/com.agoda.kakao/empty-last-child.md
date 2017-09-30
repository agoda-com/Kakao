---
title: emptyLastChild - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">kakao</a> / <a href="index.html">com.agoda.kakao</a> / <a href=".">emptyLastChild</a></div>

# emptyLastChild

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><a href="-k-recycler-view/index.html"><span class="identifier">KRecyclerView</span></a><span class="symbol">.</span><span class="identifier">emptyLastChild</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyLastChild(com.agoda.kakao.KRecyclerView, kotlin.Function1((com.agoda.kakao.KEmptyRecyclerItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-recycler-item/index.html"><span class="identifier">KEmptyRecyclerItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Calls lastChild() on your view with base child

Calls lastChild() on your KRecyclerView and casts received item to KEmptyRecyclerItem

### Parameters

<code>tail</code> - Lambda with KEmptyRecyclerItem receiver

**See Also**

<a href="-k-empty-recycler-item/index.html">KEmptyRecyclerItem</a>

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><a href="-k-list-view/index.html"><span class="identifier">KListView</span></a><span class="symbol">.</span><span class="identifier">emptyLastChild</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao$emptyLastChild(com.agoda.kakao.KListView, kotlin.Function1((com.agoda.kakao.KEmptyAdapterItem, kotlin.Unit)))/tail">tail</span><span class="symbol">:</span>&nbsp;<a href="-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Calls lastChild() on your view with base child

Calls lastChild() on your KListView and casts received item to KEmptyAdapterItem

### Parameters

<code>tail</code> - Lambda with KEmptyAdapterItem receiver

**See Also**

<a href="-k-empty-adapter-item/index.html">KEmptyAdapterItem</a>

</div>
