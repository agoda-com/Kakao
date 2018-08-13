package com.agoda.sample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

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