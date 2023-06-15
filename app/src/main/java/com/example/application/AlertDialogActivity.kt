package com.example.application

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogActivity : AppCompatActivity() {

    lateinit var alert:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)


        alert=findViewById(R.id.btnalert)

        alert.setOnClickListener {
            var box=AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED",DialogInterface.OnClickListener { dialog, id ->finish() })
            box.setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alerts=box.create()
            alerts.setTitle("Application")
            alerts.show()




        }
    }
}