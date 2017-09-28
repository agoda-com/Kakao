---
title: RecyclerActions.scrollTo - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">RecyclerActions</a> / <a href=".">scrollTo</a></div>

# scrollTo

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RecyclerActions$scrollTo(kotlin.Int)/position">position</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Overrides <a href="../-scrollable-actions/scroll-to.html">ScrollableActions.scrollTo</a>

Scrolls to the specific position of the view

### Parameters

<code>position</code> - Scrolling destination

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RecyclerActions$scrollTo(org.hamcrest.Matcher((android.view.View)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to specific view holder that matches given matcher

### Parameters

<code>matcher</code> - Matcher for view holder, which is scroll destination

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RecyclerActions$scrollTo(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/viewBuilder">viewBuilder</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to specific view holder that matches given matcher

### Parameters

<code>viewBuilder</code> - Builder that will be used to match view to scroll

</div>
