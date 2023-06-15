package com.example.application

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable.cancel

class DashboardActivity : AppCompatActivity() {

    lateinit var home:CardView
    lateinit var chart:CardView
    lateinit var profile:CardView
    lateinit var widgets:CardView
    lateinit var settings:CardView
    lateinit var logout:CardView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home=findViewById(R.id.cardHome)
        chart=findViewById(R.id.cardChat)
        profile=findViewById(R.id.cardProfile)
        widgets=findViewById(R.id.cardWidgets)
        settings=findViewById(R.id.cardSettings)
        logout=findViewById(R.id.cardLogout)



        home.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Home",Toast.LENGTH_LONG).show()
            var frags=Intent(this,FragmentActivity::class.java)
            startActivity(frags)

        }

        chart.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Chart",Toast.LENGTH_LONG).show()

            val intent=Intent(this,WebViewActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Profile",Toast.LENGTH_LONG).show()
            val intent=Intent(this,ListViewActivity::class.java)
            startActivity(intent)
        }

        widgets.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Widgets",Toast.LENGTH_LONG).show()
            val intent=Intent(this,ScrollActivity::class.java)
            startActivity(intent)
        }

        settings.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Settings",Toast.LENGTH_LONG).show()
        }

        logout.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Logout",Toast.LENGTH_LONG).show()
            var box= AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { dialog, id ->finish()  })
            box.setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alerts=box.create()
            alerts.setTitle("App")
            alerts.show()
        }














    }
}