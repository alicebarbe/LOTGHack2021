package com.example.lotghack2021

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class pregamePrimer : AppCompatActivity() {
    var sports = arrayOf("Rugby", "Football", "Cricket", "Hockey")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregame_primer)

        val spinner = findViewById<Spinner>(R.id.spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, sports
            )
            spinner.adapter = adapter
        }
        spinner.setSelection(0)
    }
}