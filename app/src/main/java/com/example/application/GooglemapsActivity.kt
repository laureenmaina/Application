package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class GooglemapsActivity : AppCompatActivity() {

    lateinit var map: Button
    lateinit var maps: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_googlemaps)


        map = findViewById(R.id.btn_location)
        maps = findViewById(R.id.maps)

        map.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)

            maps.webViewClient = WebViewClient()
            maps.loadUrl("https://www.google.com/maps/@-1.2723647,36.7927116,15z?entry=ttu")
            maps.settings.javaScriptEnabled = true
            maps.settings.setSupportZoom(true)

        }

        }
    }
