---
title: WebElementBuilder.KWebInteraction - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../../index.html">kakao</a> / <a href="../../index.html">com.agoda.kakao</a> / <a href="../index.html">WebElementBuilder</a> / <a href=".">KWebInteraction</a></div>

# KWebInteraction

<div class="signature"><code><span class="keyword">inner</span> <span class="keyword">class </span><span class="identifier">KWebInteraction</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../../-web-actions/index.html"><span class="identifier">WebActions</span></a><span class="symbol">, </span><a href="../../-web-assertions/index.html"><span class="identifier">WebAssertions</span></a></code></div>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KWebInteraction</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder.KWebInteraction$<init>(android.support.test.espresso.web.sugar.Web.WebInteraction((kotlin.Any)), android.support.test.espresso.web.model.Atom((android.support.test.espresso.web.model.ElementReference)))/web">web</span><span class="symbol">:</span>&nbsp;<span class="identifier">WebInteraction</span><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder.KWebInteraction$<init>(android.support.test.espresso.web.sugar.Web.WebInteraction((kotlin.Any)), android.support.test.espresso.web.model.Atom((android.support.test.espresso.web.model.ElementReference)))/ref">ref</span><span class="symbol">:</span>&nbsp;<span class="identifier">Atom</span><span class="symbol">&lt;</span><span class="identifier">ElementReference</span><span class="symbol">&gt;</span><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="ref.html">ref</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">ref</span><span class="symbol">: </span><span class="identifier">Atom</span><span class="symbol">&lt;</span><span class="identifier">ElementReference</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
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

### Inherited Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../../-web-actions/clear.html">clear</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">clear</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Clears the element


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../-web-actions/click.html">click</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">click</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Clicks on element


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../-web-assertions/contains-text.html">containsText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">containsText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.WebAssertions$containsText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if element contains given text


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../-web-assertions/has-text.html">hasText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.WebAssertions$hasText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if element has given text


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../-web-actions/keys.html">keys</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">keys</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.WebActions$keys(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Input keys with element in focus


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../-web-assertions/matches.html">matches</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <span class="identifier">matches</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebAssertions$matches(android.support.test.espresso.web.model.Atom((com.agoda.kakao.WebAssertions.matches.T)), org.hamcrest.Matcher((com.agoda.kakao.WebAssertions.matches.T)))/value">value</span><span class="symbol">:</span>&nbsp;<span class="identifier">Atom</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebAssertions$matches(android.support.test.espresso.web.model.Atom((com.agoda.kakao.WebAssertions.matches.T)), org.hamcrest.Matcher((com.agoda.kakao.WebAssertions.matches.T)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if element matches given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../-web-actions/scroll.html">scroll</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scroll</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the element inside WebView


</td>
</tr>
</tbody>
</table>
