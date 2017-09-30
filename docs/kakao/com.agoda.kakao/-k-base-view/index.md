---
title: KBaseView - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KBaseView</a></div>

# KBaseView

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KBaseView</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><a href="../-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for all Kakao views

This base class allows create new custom view with ease. All you
have to do is to extend this class, implement all necessarily additional
actions/assertions interfaces and override necessary constructors

### Parameters

<code>T</code> - Type of your custom view. Needs to be defined to enable invoke() and perform() for descendants

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KBaseView</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

Constructs view class with view interaction from given ViewBuilder

<div class="signature"><code><span class="identifier">KBaseView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(org.hamcrest.Matcher((android.view.View)), kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">KBaseView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/parent">parent</span><span class="symbol">:</span>&nbsp;<span class="identifier">DataInteraction</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.KBaseView$<init>(android.support.test.espresso.DataInteraction, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span></code></div>

Constructs view class with parent and view interaction from given ViewBuilder


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
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="identifier">invoke</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KBaseView$invoke(kotlin.Function1((com.agoda.kakao.KBaseView.T, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">T</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Operator that allows usage of DSL style


</td>
</tr>
<tr>
<td markdown="1">

<a href="perform.html">perform</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">infix</span> <span class="keyword">fun </span><span class="identifier">perform</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KBaseView$perform(kotlin.Function1((com.agoda.kakao.KBaseView.T, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">T</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">T</span></code></div>

Infix function for invoking lambda on your view


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

<a href="../-base-assertions/assert.html">assert</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">assert</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$assert(kotlin.Function0((android.support.test.espresso.ViewAssertion)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<span class="identifier">ViewAssertion</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check the view with the given custom assertion


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

<a href="../-base-assertions/does-not-exists.html">doesNotExists</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">doesNotExists</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the matched view does not exists


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

<a href="../-base-assertions/has-any-tag.html">hasAnyTag</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasAnyTag</span><span class="symbol">(</span><span class="keyword">vararg</span> <span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasAnyTag(kotlin.Array((kotlin.String)))/tags">tags</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has at least one of the given tags


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/has-descendant.html">hasDescendant</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasDescendant</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasDescendant(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given descendant


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/has-not-descendant.html">hasNotDescendant</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasNotDescendant</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasNotDescendant(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has not given descendant


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/has-not-sibling.html">hasNotSibling</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasNotSibling</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasNotSibling(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has not given sibling


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/has-sibling.html">hasSibling</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasSibling</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasSibling(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given sibling


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/has-tag.html">hasTag</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">hasTag</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$hasTag(kotlin.String)/tag">tag</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has given tag


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/in-root.html">inRoot</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">inRoot</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$inRoot(kotlin.Function1((com.agoda.kakao.RootBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-root-builder/index.html"><span class="identifier">RootBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check if the view is in given root


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-clickable.html">isClickable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isClickable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is clickable


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-completely-displayed.html">isCompletelyDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isCompletelyDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is completely displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-disabled.html">isDisabled</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isDisabled</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is disabled


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-displayed.html">isDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-enabled.html">isEnabled</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isEnabled</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is enabled


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-focusable.html">isFocusable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isFocusable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is focusable


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-focused.html">isFocused</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isFocused</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is focused


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-gone.html">isGone</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isGone</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has GONE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-invisible.html">isInvisible</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isInvisible</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has INVISIBLE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-not-clickable.html">isNotClickable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotClickable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not clickable


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-not-completely-displayed.html">isNotCompletelyDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotCompletelyDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not completely displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-not-displayed.html">isNotDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-not-focusable.html">isNotFocusable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotFocusable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not focusable


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-not-focused.html">isNotFocused</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotFocused</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not focused


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-not-selected.html">isNotSelected</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isNotSelected</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is not selected


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-selected.html">isSelected</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isSelected</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view is selected


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/is-visible.html">isVisible</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">isVisible</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Checks if the view has VISIBLE visibility


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

<a href="../-base-assertions/matches.html">matches</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">matches</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$matches(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check if the view matches given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-base-assertions/not-matches.html">notMatches</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">notMatches</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.BaseAssertions$notMatches(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Check if the view does not match given matcher


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

<a href="../-k-button/index.html">KButton</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KButton</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-button/index.html"><span class="identifier">KButton</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="../-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a></code></div>

View with BaseActions and TextViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-check-box/index.html">KCheckBox</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KCheckBox</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-check-box/index.html"><span class="identifier">KCheckBox</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-checkable-actions/index.html"><span class="identifier">CheckableActions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-checkable-assertions/index.html"><span class="identifier">CheckableAssertions</span></a></code></div>

View with CheckableActions, CheckableAssertions and TextViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-drawer-view/index.html">KDrawerView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KDrawerView</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-drawer-view/index.html"><span class="identifier">KDrawerView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="../-drawer-actions/index.html"><span class="identifier">DrawerActions</span></a></code></div>

View with DrawerActions and BaseAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-edit-text/index.html">KEditText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KEditText</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-edit-text/index.html"><span class="identifier">KEditText</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-editable-actions/index.html"><span class="identifier">EditableActions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-editable-assertions/index.html"><span class="identifier">EditableAssertions</span></a></code></div>

View with EditableActions and EditableAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-image-view/index.html">KImageView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KImageView</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-image-view/index.html"><span class="identifier">KImageView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="../-image-view-assertions/index.html"><span class="identifier">ImageViewAssertions</span></a></code></div>

View with BaseActions and ImageViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-swipe-view/index.html">KSwipeView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KSwipeView</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-swipe-view/index.html"><span class="identifier">KSwipeView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="../-swipeable-actions/index.html"><span class="identifier">SwipeableActions</span></a></code></div>

View with SwipeableActions and BaseAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-text-view/index.html">KTextView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KTextView</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-text-view/index.html"><span class="identifier">KTextView</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><a href="../-text-view-assertions/index.html"><span class="identifier">TextViewAssertions</span></a></code></div>

View with BaseActions and TextViewAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-view/index.html">KView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KView</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-view/index.html"><span class="identifier">KView</span></a><span class="symbol">&gt;</span></code></div>

Simple view with BaseActions and BaseAssertions


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-k-view-pager/index.html">KViewPager</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KViewPager</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="identifier">KBaseView</span><span class="symbol">&lt;</span><a href="../-k-view-pager/index.html"><span class="identifier">KViewPager</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-swipeable-actions/index.html"><span class="identifier">SwipeableActions</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../-view-pager-assertions/index.html"><span class="identifier">ViewPagerAssertions</span></a></code></div>

View with SwipeableActions and ViewPagerAssertions


</td>
</tr>
</tbody>
</table>
