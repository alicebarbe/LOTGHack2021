package com.example.lotghack2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class furtherInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_further_info)
        val textView: TextView = findViewById(R.id.textView) as TextView
        textView.movementMethod = ScrollingMovementMethod()
    }
}