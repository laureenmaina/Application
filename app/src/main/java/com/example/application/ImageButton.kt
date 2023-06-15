package com.example.application

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImageButton : AppCompatActivity() {

    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var image:ImageButton
    lateinit var image2:ImageButton
    lateinit var image3:ImageButton
    lateinit var image4:ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)

        num1=findViewById(R.id.num1)
        num2=findViewById(R.id.num2)
        image=findViewById(R.id.imgbtn)
        image2=findViewById(R.id.imgbtn2)
        image3=findViewById(R.id.imgbtn3)
        image4=findViewById(R.id.imgbtn4)

        image.setOnClickListener{
            if (num1.text.toString().isEmpty()||num2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num1 = Integer.parseInt(num1.text.toString())
                var num2 = Integer.parseInt(num2.text.toString())
                Toast.makeText(applicationContext, "Sum of the two numbers is " + (num1+num2),
                        Toast.LENGTH_LONG
                    ).show()
                }
        }

        image2.setOnClickListener{
            if (num1.text.toString().isEmpty()||num2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num1 = Integer.parseInt(num1.text.toString())
                var num2 = Integer.parseInt(num2.text.toString())
                Toast.makeText(applicationContext, "Subtraction of the two numbers is " + (num1-num2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        image3.setOnClickListener{
            if (num1.text.toString().isEmpty()||num2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num1 = Integer.parseInt(num1.text.toString())
                var num2 = Integer.parseInt(num2.text.toString())
                Toast.makeText(applicationContext, "Multiplication of the two numbers is " + (num1*num2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        image4.setOnClickListener{
            if (num1.text.toString().isEmpty()||num2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num1 = Integer.parseInt(num1.text.toString())
                var num2 = Integer.parseInt(num2.text.toString())
                Toast.makeText(applicationContext, "Division of the two numbers is " + (num1/num2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }



    }
}