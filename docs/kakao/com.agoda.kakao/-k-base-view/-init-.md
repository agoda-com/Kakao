---
title: KBaseView.<init> - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">KBaseView</a> / <a href=".">&lt;init&gt;</a></div>

# &lt;init&gt;

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="identifier">KBaseView</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

Constructs view class with view interaction from given ViewBuilder

### Parameters

<code>function</code> - ViewBuilder which will result in view's interaction

**See Also**

<a href="../-view-builder/index.html">ViewBuilder</a>

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="identifier">KBaseView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

<code>parent</code> - Matcher that will be used as parent in isDescendantOfA() matcher

<code>function</code> - ViewBuilder which will result in view's interaction

**See Also**

<a href="../-view-builder/index.html">ViewBuilder</a>

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="identifier">KBaseView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">DataInteraction</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

Constructs view class with parent and view interaction from given ViewBuilder

### Parameters

<code>parent</code> - DataInteraction that will be used as parent to ViewBuilder

<code>function</code> - ViewBuilder which will result in view's interaction

**See Also**

<a href="../-view-builder/index.html">ViewBuilder</a>

</div>
