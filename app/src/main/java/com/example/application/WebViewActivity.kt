package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class WebViewActivity : AppCompatActivity() {

    lateinit var loc: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        loc = findViewById(R.id.web)

        loc.webViewClient = WebViewClient()
        loc.loadUrl("https://www.google.com/search?q=tourist+sites+in+kenya&oq=tourist+sites+&aqs=chrome.1.69i57j0i512l9.8207j0j7&sourceid=chrome&ie=UTF-8")
        loc.settings.javaScriptEnabled = true
        loc.settings.setSupportZoom(true)



    }
}