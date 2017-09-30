---
title: IndexMatcher - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">IndexMatcher</a></div>

# IndexMatcher

<div class="signature"><code><span class="keyword">class </span><span class="identifier">IndexMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">TypeSafeMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches index'th view that matches given matcher

### Parameters

<code>matcher</code> - Matcher that have several matching views

<code>index</code> - index of view that must be matched

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">IndexMatcher</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.IndexMatcher$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Int)/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><span class="parameterName" id="com.agoda.kakao.IndexMatcher$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Int)/index">index</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span></code></div>

Matches index'th view that matches given matcher


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="current-index.html">currentIndex</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">currentIndex</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="describe-to.html">describeTo</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">describeTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.IndexMatcher$describeTo(org.hamcrest.Description)/desc">desc</span><span class="symbol">:</span>&nbsp;<span class="identifier">Description</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="matches-safely.html">matchesSafely</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">matchesSafely</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.IndexMatcher$matchesSafely(android.view.View)/view">view</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
</tbody>
</table>
