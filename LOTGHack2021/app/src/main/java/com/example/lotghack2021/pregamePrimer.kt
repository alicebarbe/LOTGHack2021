package com.example.lotghack2021

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class pregamePrimer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregame_primer)
        val textView: TextView = findViewById(R.id.textView) as TextView
        textView.movementMethod = ScrollingMovementMethod()
    }
}