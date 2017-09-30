---
title: Screen - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">Screen</a></div>

# Screen

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">Screen</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">Screen</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-screen-actions/index.html"><span class="identifier">ScreenActions</span></a></code></div>

Container class for UI elements.

This class groups UI elements and grants access to basic actions,
such as tapBack() and closeSoftKeyboard()

### Parameters

<code>T</code> - type of your screen, done to enable invoke() for its children

**See Also**

<a href="../-screen-actions/index.html">ScreenActions</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">Screen</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

Container class for UI elements.


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="view.html">view</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">val </span><span class="identifier">view</span><span class="symbol">: </span><span class="identifier">ViewInteraction</span></code></div>

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

<a href="invoke.html">invoke</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="identifier">invoke</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.Screen$invoke(kotlin.Function1((com.agoda.kakao.Screen.T, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">T</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Inherited Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-screen-actions/close-soft-keyboard.html">closeSoftKeyboard</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">closeSoftKeyboard</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Closes soft keyboard, if opened


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-screen-actions/idle.html">idle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">idle</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ScreenActions$idle(kotlin.Long)/duration">duration</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a>&nbsp;<span class="symbol">=</span>&nbsp;1000L<span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Idles for given amount of time


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-screen-actions/press-back.html">pressBack</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">pressBack</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs click on device's back button


</td>
</tr>
</tbody>
</table>
