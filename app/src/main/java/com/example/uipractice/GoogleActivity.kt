package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GoogleActivity : AppCompatActivity() {

    lateinit var arrowBackGoogle : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google)
        val arrowBackGoogle = findViewById<ImageButton>(R.id.arrowBackGoogle)

        arrowBackGoogle.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}