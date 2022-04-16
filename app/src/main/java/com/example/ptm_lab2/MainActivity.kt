package com.rollthedice

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.ptm_lab2.R
import java.lang.invoke.ConstantCallSite

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val button1 = findViewById<Button>(R.id.button_1)
    val button2 = findViewById<Button>(R.id.button_2)
    val button3 = findViewById<Button>(R.id.button_3)
    val button4 = findViewById<Button>(R.id.button_4)
    val button5 = findViewById<Button>(R.id.button_5)
    val button6 = findViewById<Button>(R.id.button_6)
    val button7 = findViewById<Button>(R.id.button_7)
    val button8 = findViewById<Button>(R.id.button_8)
    val button9 = findViewById<Button>(R.id.button_9)
}



