package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class InstagramActivity : AppCompatActivity() {
    lateinit var arrowBackInstagram : ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        val arrowBackInstagram = findViewById<ImageButton>(R.id.arrowBackInsta)

        arrowBackInstagram.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}