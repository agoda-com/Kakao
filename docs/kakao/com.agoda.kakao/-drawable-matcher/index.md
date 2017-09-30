---
title: DrawableMatcher - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href=".">DrawableMatcher</a></div>

# DrawableMatcher

<div class="signature"><code><span class="keyword">class </span><span class="identifier">DrawableMatcher</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">TypeSafeMatcher</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span></code></div>

Matches given drawable with current one

### Parameters

<code>resId</code> - Drawable resource to be matched (default is -1)

<code>drawable</code> - Drawable instance to be matched (default is null)

<code>toBitmap</code> - Lambda with custom Drawable -&gt; Bitmap converter (default is null)

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">DrawableMatcher</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.DrawableMatcher$<init>(kotlin.Int, android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a>&nbsp;<span class="symbol">=</span>&nbsp;-1<span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.DrawableMatcher$<init>(kotlin.Int, android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/drawable">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">?</span>&nbsp;<span class="symbol">=</span>&nbsp;null<span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.DrawableMatcher$<init>(kotlin.Int, android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/toBitmap">toBitmap</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/Bitmap.html"><span class="identifier">Bitmap</span></a>&nbsp;<span class="symbol">=</span>&nbsp;null<span class="symbol">)</span></code></div>

Matches given drawable with current one


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
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">describeTo</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DrawableMatcher$describeTo(org.hamcrest.Description)/desc">desc</span><span class="symbol">:</span>&nbsp;<span class="identifier">Description</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="drawable-to-bitmap.html">drawableToBitmap</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">drawableToBitmap</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DrawableMatcher$drawableToBitmap(android.graphics.drawable.Drawable)/drawable">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://developer.android.com/reference/android/graphics/Bitmap.html"><span class="identifier">Bitmap</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="matches-safely.html">matchesSafely</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">matchesSafely</span><span class="symbol">(</span><span class="parameterName" id="com.agoda.kakao.DrawableMatcher$matchesSafely(android.view.View)/view">view</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
</tbody>
</table>
