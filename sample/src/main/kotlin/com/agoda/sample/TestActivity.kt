package com.agoda.sample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun onResume() {
        super.onResume()

        supportActionBar?.apply {
            subtitle = "Subtitle"
            setDisplayHomeAsUpEnabled(true)
        }

        findViewById<ImageView>(R.id.map).tag = "test_tag"

        addRoute(R.id.multi_type_recycler, MultitypeRecyclerActivity::class.java)
        addRoute(R.id.single_type_recycler, SingleTypeRecyclerActivity::class.java)
        addRoute(R.id.auto_complete, AutoCompleteActivity::class.java)
        addRoute(R.id.drawableList, DrawableListActivity::class.java)
        addRoute(R.id.web_button, WebAcitivty::class.java)
        addRoute(R.id.picker_button, PickersActivity::class.java)
        addRoute(R.id.spinner_button, SpinnerActivity::class.java)
        addRoute(R.id.alert_dialog_button, AlertDialogActivity::class.java)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun addRoute(@IdRes id: Int, activity: Class<*>){
        findViewById<Button>(id).setOnClickListener {
            startActivity(Intent(this, activity))
        }
    }
}
