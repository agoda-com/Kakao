---
title: BaseActions.onFailure - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">BaseActions</a> / <a href=".">onFailure</a></div>

# onFailure

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">onFailure</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$onFailure(kotlin.Function2((kotlin.Throwable, org.hamcrest.Matcher((android.view.View)), kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">error</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html"><span class="identifier">Throwable</span></a><span class="symbol">,</span>&nbsp;<span class="parameterName">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds failure handler to the view

### Parameters

<code>function</code> - Lambda that handles this view's errors