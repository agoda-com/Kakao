package com.agoda.sample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun onResume() {
        super.onResume()
        findViewById<ImageView>(R.id.map).tag = "test_tag"

        findViewById<Button>(R.id.recycler).setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }

        findViewById<Button>(R.id.recycler_complex).setOnClickListener {
            startActivity(Intent(this, RecyclerComplexActivity::class.java))
        }

        findViewById<Button>(R.id.auto_complete).setOnClickListener {
            startActivity(Intent(this, AutoCompleteActivity::class.java))
        }

        findViewById<Button>(R.id.web_button).setOnClickListener {
            startActivity(Intent(this, WebAcitivty::class.java))
        }

        findViewById<Button>(R.id.picker_button).setOnClickListener {
            startActivity(Intent(this, PickersActivity::class.java))
        }

        findViewById<Button>(R.id.alert_dialog_button).setOnClickListener {
            startActivity(Intent(this, AlertDialogActivity::class.java))
        }

        findViewById<Button>(R.id.snackbar_button).setOnClickListener {
            val snackbar = Snackbar.make(
                findViewById(android.R.id.content),
                "This is snackbar!", Snackbar.LENGTH_LONG
            )

            snackbar.setAction("DISMISS") {
                snackbar.dismiss()
            }

            snackbar.show()
        }

        findViewById<SeekBar>(R.id.seek_bar).setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.d("KAKAO", "SeekBar progress is: $progress")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}
