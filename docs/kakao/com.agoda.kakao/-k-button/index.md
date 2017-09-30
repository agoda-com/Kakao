---
title: KButton - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KButton</a></div>

# KButton

<div class="signature"><code><span class="keyword">class </span><span class="identifier">KButton</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><span class="identifier">KButton</span><span class="symbol">&gt;</span><span class="symbol">, </span><a href="../-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a></code></div>

View with BaseActions and TextViewAssertions

**See Also**

<a href="../-base-actions/index.html">BaseActions</a>

<a href="../-text-view-assertions/index.html">TextViewAssertions</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KButton</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KButton$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KButton</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KButton$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KButton$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KButton</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KButton$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">DataInteraction</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KButton$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Inherited Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-k-base-view/view.html">view</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">val </span><span class="identifier">view</span><span class="symbol">: </span><span class="identifier">ViewInteraction</span></code></div>

</td>
</tr>
</tbody>
</table>

### Inherited Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/contains-text.html">containsText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">containsText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$containsText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view contains given text


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/has-any-text.html">hasAnyText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasAnyText</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has any text


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/has-content-description.html">hasContentDescription</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasContentDescription</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasContentDescription(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given content description


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/has-empty-text.html">hasEmptyText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasEmptyText</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view have not any text


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/has-no-text.html">hasNoText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasNoText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasNoText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasNoText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasNoText(kotlin.Int)/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view does not have a given text


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/has-text.html">hasText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasText(kotlin.Int)/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given text

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$hasText(org.hamcrest.Matcher((kotlin.String)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has text that matches given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-text-view-assertions/starts-with-text.html">startsWithText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">startsWithText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.TextViewAssertions$startsWithText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view text start with given substring


</td>
</tr>
</tbody>
</table>
