---
title: ViewBuilder - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">ViewBuilder</a></div>

# ViewBuilder

<div class="signature"><code><span class="keyword">class </span><span class="identifier">ViewBuilder</span></code></div>

Class for building view matchers and interactions

This class helps to build matches for views and get their interactions.
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
<div class="signature"><code><span class="identifier">ViewBuilder</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

Class for building view matchers and interactions


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="contains-text.html">containsText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">containsText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$containsText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view which contain given text


</td>
</tr>
<tr>
<td markdown="1">

<a href="get-view-interaction.html">getViewInteraction</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">getViewInteraction</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">ViewInteraction</span></code></div>

Returns view interaction based on all given matchers


</td>
</tr>
<tr>
<td markdown="1">

<a href="get-view-matcher.html">getViewMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">getViewMatcher</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Returns combined view matcher with AllOf.allOf()


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-completely-displayed.html">isCompletelyDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isCompletelyDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view that is completely displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-descendant-of-a.html">isDescendantOfA</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isDescendantOfA</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$isDescendantOfA(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">ViewBuilder</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view which is descendant of given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-disabled.html">isDisabled</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isDisabled</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view if it is not in ENABLED state


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-displayed.html">isDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view that is displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-enabled.html">isEnabled</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isEnabled</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view if it is in ENABLED state


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-first.html">isFirst</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isFirst</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the first view


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-gone.html">isGone</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isGone</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with GONE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-instance-of.html">isInstanceOf</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isInstanceOf</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$isInstanceOf(java.lang.Class((kotlin.Any)))/clazz">clazz</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/java/lang/Class.html"><span class="identifier">Class</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view by class instance


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-invisible.html">isInvisible</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isInvisible</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with INVISIBLE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-completely-displayed.html">isNotCompletelyDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isNotCompletelyDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matchers the view that is not completely displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-not-displayed.html">isNotDisplayed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isNotDisplayed</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view that is not displayed


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-visible.html">isVisible</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">isVisible</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with VISIBLE visibility


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-any-text.html">withAnyText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withAnyText</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view which contains any text


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-class-name.html">withClassName</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withClassName</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withClassName(org.hamcrest.Matcher((kotlin.String)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view which class name matches given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-content-description.html">withContentDescription</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withContentDescription</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withContentDescription(kotlin.String)/description">description</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given content description


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-descendant.html">withDescendant</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withDescendant</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDescendant(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">ViewBuilder</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view which has descendant of given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-drawable.html">withDrawable</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withDrawable</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(kotlin.Int, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(kotlin.Int, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/toBitmap">toBitmap</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/Bitmap.html"><span class="identifier">Bitmap</span></a>&nbsp;<span class="symbol">=</span>&nbsp;null<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withDrawable</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/drawable">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/toBitmap">toBitmap</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/Bitmap.html"><span class="identifier">Bitmap</span></a>&nbsp;<span class="symbol">=</span>&nbsp;null<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given drawable


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-id.html">withId</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withId</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withId(kotlin.Int)/id">id</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given resource id


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-index.html">withIndex</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withIndex</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withIndex(kotlin.Int, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/index">index</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withIndex(kotlin.Int, kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">ViewBuilder</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches only view at given index, if there are multiple views that matches


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-matcher.html">withMatcher</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withMatcher</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withMatcher(org.hamcrest.Matcher((android.view.View)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given custom matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-parent.html">withParent</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withParent</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withParent(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">ViewBuilder</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view which has parent with given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-resource-name.html">withResourceName</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withResourceName</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withResourceName(kotlin.String)/name">name</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given resource name

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withResourceName</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withResourceName(org.hamcrest.Matcher((kotlin.String)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view by resource name with given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-sibling.html">withSibling</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withSibling</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withSibling(kotlin.Function1((com.agoda.kakao.ViewBuilder, kotlin.Unit)))/function">function</span><span class="symbol">:</span>&nbsp;<span class="identifier">ViewBuilder</span><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view which has sibling of given matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="with-text.html">withText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withText(kotlin.Int)/textId">textId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given text

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withText(org.hamcrest.Matcher((kotlin.String)))/matcher">matcher</span><span class="symbol">:</span>&nbsp;<span class="identifier">Matcher</span><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given text matcher


</td>
</tr>
<tr>
<td markdown="1">

<a href="without-text.html">withoutText</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withoutText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withoutText(kotlin.String)/text">text</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withoutText</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.ViewBuilder$withoutText(kotlin.Int)/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches if the view does not have a given text


</td>
</tr>
</tbody>
</table>
