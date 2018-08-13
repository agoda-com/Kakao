package com.agoda.sample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class IntentActivity : AppCompatActivity() {
    private val resultText by lazy { findViewById<TextView>(R.id.result_text) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        findViewById<Button>(R.id.intent_button).setOnClickListener {
            startActivity(Intent(this, TestActivity::class.java).apply {
                action = "ACTION_TEST"
                addCategory("TEST")
                addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                putExtra("test", "test")
            })
        }

        findViewById<Button>(R.id.intent_result_button).setOnClickListener {
            startActivityForResult(Intent(this, TestActivity::class.java).apply {
                action = "ACTION_TEST_RESULT"
                addCategory("TEST_RESULT")
                addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                putExtra("test", "test")
                putExtra("test2", "test2")
            }, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                resultText.text = data?.getStringExtra("text") ?: "null"
            } else {
                resultText.text = data?.getStringExtra("error") ?: "null"
            }
        }
    }

    companion object {
        const val REQUEST_CODE = 200
    }
}