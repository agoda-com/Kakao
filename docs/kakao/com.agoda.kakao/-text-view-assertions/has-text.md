---
title: TextViewAssertions.hasText - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">TextViewAssertions</a> / <a href=".">hasText</a></div>

# hasText

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given text

### Parameters

<code>text</code> - Text to be matched

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasText</span><span class="symbol">(</span><span class="identifier">@StringRes</span> <span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasText(kotlin.Int)/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given text

### Parameters

<code>resId</code> - String resource to be matched

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasText(org.hamcrest.Matcher((kotlin.String)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has text that matches given matcher

</div>
