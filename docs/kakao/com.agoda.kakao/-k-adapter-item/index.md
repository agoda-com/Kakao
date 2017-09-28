---
title: KAdapterItem - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">KAdapterItem</a></div>

# KAdapterItem

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">KAdapterItem</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-base-actions/index.html"><span class="identifier">BaseActions</span></a><span class="symbol">, </span><a href="../-base-assertions/index.html"><span class="identifier">BaseAssertions</span></a></code></div>

Base class for KRecyclerView adapter items

Please extend this class to provide custom recycler view item types

### Parameters

<code>T</code> - type of your item. Used to enable invoke() and perform() on descendants

<code>interaction</code> - Data interaction of item. Can be used as parent for all views inside item.

**See Also**

<a href="../-k-recycler-item-type-builder/index.html">KRecyclerItemTypeBuilder</a>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">KAdapterItem</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KAdapterItem$<init>(android.support.test.espresso.DataInteraction)/interaction">interaction</span><span class="symbol">:</span>&nbsp;<span class="identifier">DataInteraction</span><span class="symbol">)</span></code></div>

Base class for KRecyclerView adapter items


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
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="identifier">invoke</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KAdapterItem$invoke(kotlin.Function1((com.agoda.kakao.KAdapterItem.T, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">T</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Operator that allows usage of DSL style


</td>
</tr>
<tr>
<td markdown="1">

<a href="perform.html">perform</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">infix</span> <span class="keyword">fun </span><span class="identifier">perform</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.KAdapterItem$perform(kotlin.Function1((com.agoda.kakao.KAdapterItem.T, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">T</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">T</span></code></div>

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

<a href="../-k-empty-adapter-item/index.html">KEmptyAdapterItem</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">KEmptyAdapterItem</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">KAdapterItem</span><span class="symbol">&lt;</span><a href="../-k-empty-adapter-item/index.html"><span class="identifier">KEmptyAdapterItem</span></a><span class="symbol">&gt;</span></code></div>

Empty implementation of KAdapterItem


</td>
</tr>
</tbody>
</table>
