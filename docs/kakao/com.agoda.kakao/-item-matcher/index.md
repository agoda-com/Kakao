---
title: ItemMatcher - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">ItemMatcher</a></div>

# ItemMatcher

<div class="signature"><code><span class="keyword">class </span><span class="identifier">ItemMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BoundedMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">,</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches first RecyclerView descendant which matches specific matcher

### Parameters

<code>parent</code> - Matcher of the recycler view

<code>item</code> - Matcher of the item in adapter

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">ItemMatcher</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ItemMatcher$<init>(org.hamcrest.Matcher((android.view.View)), org.hamcrest.Matcher((android.view.View)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><span class="parameterName" id="com.agoda.kakao.ItemMatcher$<init>(org.hamcrest.Matcher((android.view.View)), org.hamcrest.Matcher((android.view.View)))/item">item</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span></code></div>

Matches first RecyclerView descendant which matches specific matcher


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="position.html">position</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">position</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

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
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">describeTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ItemMatcher$describeTo(org.hamcrest.Description)/desc">desc</span><span class="symbol">:</span>&nbsp;<span class="identifier">Description</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="matches-safely.html">matchesSafely</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">matchesSafely</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ItemMatcher$matchesSafely(android.view.View)/view">view</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
</tbody>
</table>
