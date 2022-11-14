package com.example.a20012011032_practical_4_mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val Data = intent
        val message1 = intent.getStringExtra("msg1")

        val myData : TextView = findViewById(R.id.textData)
        myData.text = "URL : "+message1

    }
}