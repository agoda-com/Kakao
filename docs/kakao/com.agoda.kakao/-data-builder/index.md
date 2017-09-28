---
title: DataBuilder - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">DataBuilder</a></div>

# DataBuilder

<div class="signature"><code><span class="keyword">class </span><span class="identifier">DataBuilder</span></code></div>

Class for building data matchers

This class helps to build matches for data.
Please note that any function invoking will add specific matcher to the list
and after that all of them will be combined with help of AllOf.allOf()

**See Also**

<a href="#">AllOf.allOf</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">DataBuilder</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

Class for building data matchers


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="equals.html">equals</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">equals</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DataBuilder$equals(kotlin.Any)/obj">obj</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches data which is equal to given object


</td>
</tr>
<tr>
<td markdown="1">

<a href="get-data-matcher.html">getDataMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">getDataMatcher</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">&gt;</span></code></div>

Returns combined data matchers with AllOf.allOf()


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-instance-of.html">isInstanceOf</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isInstanceOf</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DataBuilder$isInstanceOf(java.lang.Class((kotlin.Any)))/clazz">clazz</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/java/lang/Class.html"><span class="identifier">Class</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches data whose class matches given class


</td>
</tr>
<tr>
<td markdown="1">

<a href="not-equals.html">notEquals</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">notEquals</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DataBuilder$notEquals(kotlin.Any)/obj">obj</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches data which is not equal to given object


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-matcher.html">withMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withMatcher</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DataBuilder$withMatcher(org.hamcrest.Matcher((kotlin.Any)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches data with given custom matcher


</td>
</tr>
</tbody>
</table>
