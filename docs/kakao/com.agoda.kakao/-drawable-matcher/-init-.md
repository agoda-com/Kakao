---
title: DrawableMatcher.<init> - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">DrawableMatcher</a> / <a href=".">&lt;init&gt;</a></div>

# &lt;init&gt;

<div class="signature"><code><span class="identifier">DrawableMatcher</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="identifier">@DrawableRes</span> <span class="parameterName" id="com.agoda.kakao.DrawableMatcher$<init>(kotlin.Int, android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/resId">resId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a>&nbsp;<span class="symbol">=</span>&nbsp;-1<span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.DrawableMatcher$<init>(kotlin.Int, android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/drawable">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">?</span>&nbsp;<span class="symbol">=</span>&nbsp;null<span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.DrawableMatcher$<init>(kotlin.Int, android.graphics.drawable.Drawable, kotlin.Function1((android.graphics.drawable.Drawable, android.graphics.Bitmap)))/toBitmap">toBitmap</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="parameterName">drawable</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/Bitmap.html"><span class="identifier">Bitmap</span></a>&nbsp;<span class="symbol">=</span>&nbsp;null<span class="symbol">)</span></code></div>

Matches given drawable with current one

### Parameters

<code>resId</code> - Drawable resource to be matched (default is -1)

<code>drawable</code> - Drawable instance to be matched (default is null)

<code>toBitmap</code> - Lambda with custom Drawable -&gt; Bitmap converter (default is null)