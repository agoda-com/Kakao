package com.agoda.sample

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView

class DrawableMatcherIssueActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawable_matcher_activity)
        findViewById<ImageView>(R.id.image).setImageResource(R.drawable.ic_menu)
    }
}
