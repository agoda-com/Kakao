package com.agoda.sample

import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class TextInputLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)

        val layout = findViewById<TextInputLayout>(R.id.input_layout).apply {
            isCounterEnabled = true
            isHintEnabled = true
            isErrorEnabled = true
            counterMaxLength = 50
            hint = "This is the HINT!"
            error = "This is the ERROR!"
        }

        findViewById<Button>(R.id.toggle_counter).setOnClickListener {
            layout.isCounterEnabled = !layout.isCounterEnabled
        }

        findViewById<Button>(R.id.toggle_hint).setOnClickListener {
            layout.isHintEnabled = !layout.isHintEnabled
        }

        findViewById<Button>(R.id.toggle_error).setOnClickListener {
            layout.isErrorEnabled = !layout.isErrorEnabled
        }
    }
}