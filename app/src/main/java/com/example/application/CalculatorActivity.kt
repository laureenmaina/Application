package com.example.application

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class CalculatorActivity : AppCompatActivity() {
    lateinit var number1:EditText
    lateinit var number2:EditText
    lateinit var image:ImageButton
    lateinit var difference:ImageButton
    lateinit var product:ImageButton
    lateinit var quotient:ImageButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        number1=findViewById(R.id.imgbtn5)
        number2=findViewById(R.id.imgbtn6)
        image=findViewById(R.id.btnadd)
        difference=findViewById(R.id.btnsub)
        product=findViewById(R.id.btnmul)
        quotient=findViewById(R.id.btndiv)

        image.setOnClickListener{
            if (number1.text.toString().isEmpty()||number2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num4 = Integer.parseInt(number1.text.toString())
                var num5 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "Sum of the two numbers is " + (num4+num5),
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        difference.setOnClickListener{
            if (number1.text.toString().isEmpty()||number2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num4 = Integer.parseInt(number1.text.toString())
                var num5 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "Subtraction of the two numbers is " + (num4-num5),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        product.setOnClickListener{
            if (number1.text.toString().isEmpty()||number2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num4 = Integer.parseInt(number1.text.toString())
                var num5 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "Multiplication of the two numbers is " + (num4*num5),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        quotient.setOnClickListener{
            if (number1.text.toString().isEmpty()||number2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else{
                var num4 = Integer.parseInt(number1.text.toString())
                var num5 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "Division of the two numbers is " + (num4/num5),
                    Toast.LENGTH_LONG
                ).show()
            }
        }



    }
}

