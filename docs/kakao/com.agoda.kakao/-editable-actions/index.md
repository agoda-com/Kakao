---
title: EditableActions - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">EditableActions</a></div>

# EditableActions

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">EditableActions</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-base-actions/index.html"><span class="identifier">BaseActions</span></a></code></div>

Provides editable actions for views

### Inherited Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-base-actions/view.html">view</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">val </span><span class="identifier">view</span><span class="symbol">: </span><span class="identifier">ViewInteraction</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="clear-text.html">clearText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">clearText</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Clears current text in the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="replace-text.html">replaceText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">replaceText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.EditableActions$replaceText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Replaces the current view text with given


</td>
</tr>
<tr>
<td markdown="1">

<a href="type-text.html">typeText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">typeText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.EditableActions$typeText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Types the given text into the view


</td>
</tr>
</tbody>
</table>

### Inherited Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-base-actions/act.html">act</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">act</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseActions$act(kotlin.Function0((android.support.test.espresso.ViewAction)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">ViewAction</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs custom action on a view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/click.html">click</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">click</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$click(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/double-click.html">doubleClick</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">doubleClick</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$doubleClick(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs double click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/long-click.html">longClick</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">longClick</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$longClick(android.support.test.espresso.action.GeneralLocation)/location">location</span><span class="symbol">:</span>&nbsp;<span class="identifier">GeneralLocation</span>&nbsp;<span class="symbol">=</span>&nbsp;GeneralLocation.VISIBLE_CENTER<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Performs long click on view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/on-failure.html">onFailure</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">onFailure</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseActions$onFailure(kotlin.Function2((kotlin.Throwable, org.hamcrest.Matcher((android.view.View)), kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">error</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html"><span class="identifier">Throwable</span></a><span class="symbol">,</span>&nbsp;<span class="parameterName">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Adds failure handler to the view


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-actions/scroll-to.html">scrollTo</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">scrollTo</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Scrolls to the view, if possible


</td>
</tr>
</tbody>
</table>

### Inheritors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-k-edit-text/index.html">KEditText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KEditText</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-k-base-view/index.html"><span class="identifier">KBaseView</span></a><span class="symbol">&lt;</span><a href="../-k-edit-text/index.html"><span class="identifier">KEditText</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="identifier">EditableActions</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-editable-assertions/index.html"><span class="identifier">EditableAssertions</span></a></code></div>

View with EditableActions and EditableAssertions


</td>
</tr>
</tbody>
</table>
