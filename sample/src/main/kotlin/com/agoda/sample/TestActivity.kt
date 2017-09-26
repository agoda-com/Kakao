package com.agoda.sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class TestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun onResume() {
        super.onResume()
        findViewById(R.id.map).tag = "test_tag"
        (findViewById(R.id.button) as Button).setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }
        (findViewById(R.id.web_button) as Button).setOnClickListener {
            startActivity(Intent(this, WebAcitivty::class.java))
        }
    }
}