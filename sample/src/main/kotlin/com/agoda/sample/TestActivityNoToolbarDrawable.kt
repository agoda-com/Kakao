package com.agoda.sample

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity

class TestActivityNoToolbarDrawable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun onResume() {
        super.onResume()

        supportActionBar?.apply {
            subtitle = "Subtitle"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
