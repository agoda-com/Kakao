package com.agoda.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class ChipGroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip_group)
        val chipGroup = findViewById<ChipGroup>(R.id.chip_group)
        val chips = listOf("Chip1", "Chip2", "Chip3", "Chip4")
        chips.forEach {
            val chip = Chip(this)
            chip.text = it
            chip.isCheckable = true
            chipGroup.addView(chip)
        }
    }
}
