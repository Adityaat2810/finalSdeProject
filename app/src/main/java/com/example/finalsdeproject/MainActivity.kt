package com.example.finalsdeproject


import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.finalsdeproject.R.*
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnClickMe = findViewById<Button>(R.id.aboutMeButton)
        btnClickMe.setOnClickListener {
            val intent = Intent(this,aboutMe::class.java)
            startActivity(intent)
            Toast.makeText(this, "Oh , you want to know about me", Toast.LENGTH_LONG).show()
        }

        val btnClickMe2 = findViewById<Button>(R.id.button)
        btnClickMe2.setOnClickListener {
            val intent2 = Intent(this,expectation::class.java)
            startActivity(intent2)
            Toast.makeText(this, "socha tha college jaunga toh phulo se swagat hoga", Toast.LENGTH_LONG).show()
        }

        val btnClickMe3= findViewById<Button>(R.id.button2)
        btnClickMe3.setOnClickListener {
            val intent3 = Intent(this,Reality::class.java)
            startActivity(intent3)
            Toast.makeText(this, "mid sems exam se swagat hua", Toast.LENGTH_LONG).show()
        }
    }
    }
