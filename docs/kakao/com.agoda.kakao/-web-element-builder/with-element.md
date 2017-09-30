---
title: WebElementBuilder.withElement - kakao
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">kakao</a> / <a href="../index.html">com.agoda.kakao</a> / <a href="index.html">WebElementBuilder</a> / <a href=".">withElement</a></div>

# withElement

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">withElement</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder$withElement(android.support.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.WebElementBuilder.KWebInteraction, kotlin.Unit)))/locator">locator</span><span class="symbol">:</span>&nbsp;<span class="identifier">Locator</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder$withElement(android.support.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.WebElementBuilder.KWebInteraction, kotlin.Unit)))/value">value</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.agoda.kakao.WebElementBuilder$withElement(android.support.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.WebElementBuilder.KWebInteraction, kotlin.Unit)))/interaction">interaction</span><span class="symbol">:</span>&nbsp;<a href="-k-web-interaction/index.html"><span class="identifier">KWebInteraction</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

Looks up web view element and performs actions/assertions on it

### Parameters

<code>locator</code> - Locator of web view element

<code>value</code> - Value to be searched for in web view

<code>interaction</code> - Tail lambda where you can perform actions/assertions