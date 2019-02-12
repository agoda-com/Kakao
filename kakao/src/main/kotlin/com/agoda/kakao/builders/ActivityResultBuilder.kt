package com.agoda.kakao.builders

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import com.agoda.kakao.BuilderMarker

/**
 * Class for building ActivityResult
 */
@BuilderMarker
class ActivityResultBuilder {
    private var code = Activity.RESULT_OK
    private var data: Intent? = null

    /**
     * Sets given result code
     *
     * @param code Result code to be saved
     */
    fun withCode(code: Int) {
        this.code = code
    }

    /**
     * Sets given result data
     *
     * @param data Result data to be saved
     */
    fun withData(data: Intent) {
        this.data = data
    }

    fun getResult() = Instrumentation.ActivityResult(code, data)
}