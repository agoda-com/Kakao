---
title: RootBuilder - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">RootBuilder</a></div>

# RootBuilder

<div class="signature"><code><span class="keyword">class </span><span class="identifier">RootBuilder</span></code></div>

Class for building root matchers

This class helps to build matches for root.
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
<div class="signature"><code><span class="identifier">RootBuilder</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

Class for building root matchers


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="get-root-matcher.html">getRootMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">getRootMatcher</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">Matcher</span><span class="symbol">&lt;</span><span class="identifier">Root</span><span class="symbol">&gt;</span></code></div>

Returns combined root matchers with AllOf.allOf()


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-dialog.html">isDialog</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isDialog</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is dialog


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-focusable.html">isFocusable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isFocusable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is focusable


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-dialog.html">isNotDialog</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isNotDialog</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is not dialog


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-focusable.html">isNotFocusable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isNotFocusable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is not focusable


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-platform-popup.html">isNotPlatformPopup</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isNotPlatformPopup</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is not platform popup


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-touchable.html">isNotTouchable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isNotTouchable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is not touchable


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-platform-popup.html">isPlatformPopup</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isPlatformPopup</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is platform popup


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-touchable.html">isTouchable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isTouchable</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that is touchable


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-decor-view.html">withDecorView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withDecorView</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RootBuilder$withDecorView(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<a href="../-view-builder/index.html"><span class="identifier">ViewBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root that has decor view matching given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-matcher.html">withMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withMatcher</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.RootBuilder$withMatcher(org.hamcrest.Matcher((android.support.test.espresso.Root)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><span class="identifier">Root</span><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches root with given custom matcher


</td>
</tr>
</tbody>
</table>
