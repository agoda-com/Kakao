---
title: KEditText - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KEditText</a></div>

# KEditText

<div class="signature"><code><span class="keyword">class </span><span class="identifier">KEditText</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><span class="identifier">KEditText</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-editable-actions/index.html"><span class="identifier">EditableActions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-editable-assertions/index.html"><span class="identifier">EditableAssertions</span></a></code></div>

View with EditableActions and EditableAssertions

**See Also**

<a href="../-editable-actions/index.html">EditableActions</a>

<a href="../-editable-assertions/index.html">EditableAssertions</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KEditText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KEditText$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KEditText</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KEditText$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KEditText$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KEditText</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KEditText$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">DataInteraction</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KEditText$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

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

<a href="../-editable-actions/clear-text.html">clearText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">clearText</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Clears current text in the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-editable-assertions/has-hint.html">hasHint</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasHint</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.EditableAssertions$hasHint(kotlin.String)/hint">hint</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasHint</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.EditableAssertions$hasHint(kotlin.Int)/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given hint


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-editable-actions/replace-text.html">replaceText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">replaceText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.EditableActions$replaceText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Replaces the current view text with given


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-editable-actions/type-text.html">typeText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">typeText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.EditableActions$typeText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Types the given text into the view


</td>
</tr>
</tbody>
</table>
