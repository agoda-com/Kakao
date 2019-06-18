package com.agoda.kakao.core


object Kakao{
    val configuration = Configuration()

    fun config(configuration: Configuration.() -> Unit){
        this.configuration.apply(configuration)
    }
}
