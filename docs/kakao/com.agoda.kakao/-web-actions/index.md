---
title: WebActions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">WebActions</a></div>

# WebActions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">WebActions</span></code></div>

Provides action for interacting with WebViews

**See Also**

<a href="#">WebView</a>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="ref.html">ref</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">val </span><span class="identifier">ref</span><span class="symbol">: </span><span class="identifier">Atom</span><span class="symbol">&lt;</span><span class="identifier">ElementReference</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="web.html">web</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">val </span><span class="identifier">web</span><span class="symbol">: </span><span class="identifier">WebInteraction</span><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="clear.html">clear</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">clear</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Clears the element


</td>
</tr>
<tr>
<td markdown="1">

<a href="click.html">click</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">click</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Clicks on element


</td>
</tr>
<tr>
<td markdown="1">

<a href="keys.html">keys</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">keys</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.WebActions$keys(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Input keys with element in focus


</td>
</tr>
<tr>
<td markdown="1">

<a href="scroll.html">scroll</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scroll</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the element inside WebView


</td>
</tr>
</tbody>
</table>

### Inheritors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-web-element-builder/-k-web-interaction/index.html">KWebInteraction</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">inner</span> <span class="keyword">class </span><span class="identifier">KWebInteraction</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">WebActions</span><span class="symbol">, </span><a href="../-web-assertions/index.html"><span class="identifier">WebAssertions</span></a></code></div>

</td>
</tr>
</tbody>
</table>
