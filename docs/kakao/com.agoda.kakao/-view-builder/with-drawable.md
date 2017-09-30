---
title: ViewBuilder.withDrawable - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">ViewBuilder</a> / <a href=".">withDrawable</a></div>

# withDrawable

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withDrawable</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="identifier">@DrawableRes</span> <span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(kotlin.Int, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(kotlin.Int, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/toBitmap">toBitmap</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/Bitmap.html"><span class="identifier">Bitmap</span></a>&nbsp;<span class="symbol">=</span>&nbsp;null<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given drawable

### Parameters

<code>resId</code> - Drawable resource to match

<code>toBitmap</code> - Lambda with custom Drawable -&gt; Bitmap converter (default is null)

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withDrawable</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/drawable">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.ViewBuilder$withDrawable(android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/toBitmap">toBitmap</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/Bitmap.html"><span class="identifier">Bitmap</span></a>&nbsp;<span class="symbol">=</span>&nbsp;null<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Matches the view with given drawable

### Parameters

<code>resId</code> - Drawable to match

<code>toBitmap</code> - Lambda with custom Drawable -&gt; Bitmap converter (default is null)

</div>
