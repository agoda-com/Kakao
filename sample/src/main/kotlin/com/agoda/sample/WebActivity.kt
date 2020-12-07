package com.agoda.sample

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val webView = findViewById<WebView>(R.id.webView).apply {
            settings.javaScriptEnabled = true
        }
        webView.loadData(
            """
            <html>
            <body>

            <p id="text">Hello</p>
            <a href="#">My Home</a>

            </body>
            </html>
        """, "text/html", "utf-8"
        )
    }
}
