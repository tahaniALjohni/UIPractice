package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class FacebookActivity : AppCompatActivity() {
    lateinit var arrowBackFacebook :ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)

        val arrowBackFacebook = findViewById<ImageButton>(R.id.arrowBackFace)
        arrowBackFacebook.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}