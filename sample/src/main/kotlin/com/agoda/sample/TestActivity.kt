package com.agoda.sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class TestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun onResume() {
        super.onResume()
        findViewById<ImageView>(R.id.map).tag = "test_tag"
        (findViewById<Button>(R.id.button)).setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }
        (findViewById<Button>(R.id.web_button)).setOnClickListener {
            startActivity(Intent(this, WebAcitivty::class.java))
        }
    }
}