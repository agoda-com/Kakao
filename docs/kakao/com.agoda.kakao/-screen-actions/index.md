---
title: ScreenActions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">ScreenActions</a></div>

# ScreenActions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ScreenActions</span></code></div>

Interface with common actions for all screens

Provides basic actions that can be performed on each and every screen

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="view.html">view</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">val </span><span class="identifier">view</span><span class="symbol">: </span><span class="identifier">ViewInteraction</span></code></div>

ViewInteraction on which all actions are performed (root view by default)


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="close-soft-keyboard.html">closeSoftKeyboard</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">closeSoftKeyboard</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Closes soft keyboard, if opened


</td>
</tr>
<tr>
<td markdown="1">

<a href="idle.html">idle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">idle</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ScreenActions$idle(kotlin.Long)/duration">duration</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a>&nbsp;<span class="symbol">=</span>&nbsp;1000L<span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Idles for given amount of time


</td>
</tr>
<tr>
<td markdown="1">

<a href="press-back.html">pressBack</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">pressBack</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs click on device's back button


</td>
</tr>
</tbody>
</table>

### Inheritors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-screen/index.html">Screen</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">Screen</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-screen/index.html"><span class="identifier">Screen</span></a><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">ScreenActions</span></code></div>

Container class for UI elements.


</td>
</tr>
</tbody>
</table>
