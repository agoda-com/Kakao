package com.agoda.kakao.intercept

data class Interception<T>(val override: Boolean, val interceptor: T)
