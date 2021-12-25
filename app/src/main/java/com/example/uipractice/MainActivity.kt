package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var googleUI : Button
    lateinit var facebookUI :Button
    lateinit var instagramUI :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        googleUI=findViewById(R.id.googleBtn)
        facebookUI=findViewById(R.id.facebookBtn)
        instagramUI=findViewById(R.id.instagramBtn)

        googleUI.setOnClickListener {
            startActivity(Intent(this,GoogleActivity::class.java))
        }
        facebookUI.setOnClickListener {
            startActivity(Intent(this, FacebookActivity::class.java))
        }
        instagramUI.setOnClickListener {
            startActivity(Intent(this,InstagramActivity::class.java))
        }
    }
}