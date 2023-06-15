package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ToolBarActivity : AppCompatActivity() {

    lateinit var tool1:TextView
    lateinit var tool2:TextView
    lateinit var tool3:TextView
    lateinit var tool4:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        tool1=findViewById(R.id.homebtn)
        tool2 =findViewById(R.id.aboutbtn)
        tool3 =findViewById(R.id.contactbtn)
        tool4 =findViewById(R.id.logoutbtn)



        tool1.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        tool2.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        tool3.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        tool4.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

    }

}