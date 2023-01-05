package com.example.hoteladvisor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent = Intent(this,onestar::class.java)
            startActivity(Intent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val Intent = Intent(this,twostar::class.java)
            startActivity(Intent)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val Intent = Intent(this,threestar::class.java)
            startActivity(Intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val Intent = Intent(this,fourstar::class.java)
            startActivity(Intent)
        }

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val Intent = Intent(this,fivestar::class.java)
            startActivity(Intent)
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val Intent = Intent(this, Instructions::class.java)
            startActivity(Intent)
        }
    }
}