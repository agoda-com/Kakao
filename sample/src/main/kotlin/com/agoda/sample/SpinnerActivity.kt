package com.agoda.sample

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_spinner_item,
            listOf(
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5",
                "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            )
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
    }
}
