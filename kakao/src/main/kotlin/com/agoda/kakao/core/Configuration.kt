package com.agoda.kakao.core

import com.agoda.kakao.common.interactors.Interactor

class Configuration{
    val interactor = Interactor()
    fun onInteraction(onInteraction: Interactor.() -> Unit){
        this.interactor.apply(onInteraction)
    }
}
