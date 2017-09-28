---
title: PageMatcher - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">PageMatcher</a></div>

# PageMatcher

<div class="signature"><code><span class="keyword">class </span><span class="identifier">PageMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">BoundedMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">,</span>&nbsp;<a href="https://developer.android.com/reference/android/support/v4/view/ViewPager.html"><span class="identifier">ViewPager</span></a><span class="symbol">&gt;</span></code></div>

Matches ViewPager which page index equals given

### Parameters

<code>index</code> - Index of page

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">PageMatcher</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.PageMatcher$<init>(kotlin.Int)/index">index</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span></code></div>

Matches ViewPager which page index equals given


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
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">describeTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.PageMatcher$describeTo(org.hamcrest.Description)/desc">desc</span><span class="symbol">:</span>&nbsp;<span class="identifier">Description</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="matches-safely.html">matchesSafely</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">matchesSafely</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.PageMatcher$matchesSafely(android.support.v4.view.ViewPager)/view">view</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/support/v4/view/ViewPager.html"><span class="identifier">ViewPager</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
</tbody>
</table>
