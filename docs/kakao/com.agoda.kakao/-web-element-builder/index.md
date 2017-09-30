---
title: WebElementBuilder - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">WebElementBuilder</a></div>

# WebElementBuilder

<div class="signature"><code><span class="keyword">class </span><span class="identifier">WebElementBuilder</span></code></div>

Class for building WebView element matchers

### Parameters

<code>web</code> - WebInteraction where elements should be matched

### Types

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-k-web-interaction/index.html">KWebInteraction</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">inner</span> <span class="keyword">class </span><span class="identifier">KWebInteraction</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-web-actions/index.html"><span class="identifier">WebActions</span></a><span class="symbol">, </span><a href="../-web-assertions/index.html"><span class="identifier">WebAssertions</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">WebElementBuilder</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.WebElementBuilder$<init>(android.support.test.espresso.web.sugar.Web.WebInteraction((kotlin.Any)))/web">web</span><span class="symbol">:</span>&nbsp;<span class="identifier">WebInteraction</span><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">)</span></code></div>

Class for building WebView element matchers


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="web.html">web</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">web</span><span class="symbol">: </span><span class="identifier">WebInteraction</span><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="with-element.html">withElement</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withElement</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder$withElement(android.support.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.WebElementBuilder.KWebInteraction, kotlin.Unit)))/locator">locator</span><span class="symbol">:</span>&nbsp;<span class="identifier">Locator</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder$withElement(android.support.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.WebElementBuilder.KWebInteraction, kotlin.Unit)))/value">value</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder$withElement(android.support.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.WebElementBuilder.KWebInteraction, kotlin.Unit)))/interaction">interaction</span><span class="symbol">:</span>&nbsp;<a href="-k-web-interaction/index.html"><span class="identifier">KWebInteraction</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Looks up web view element and performs actions/assertions on it


</td>
</tr>
</tbody>
</table>
