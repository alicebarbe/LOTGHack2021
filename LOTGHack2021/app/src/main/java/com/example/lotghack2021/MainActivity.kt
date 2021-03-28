package com.example.lotghack2021

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE = "com.example.lotghack2021.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pregameView(view: View) {
        val intent = Intent(this, pregamePrimer::class.java)
        startActivity(intent)
    }

    fun assessmentView(view: View) {
        val intent = Intent(this, assessmentTools::class.java)
        startActivity(intent)
    }

    fun furtherInfoView(view: View) {
        val intent = Intent(this, furtherInfo::class.java)
        startActivity(intent)
    }

    fun nearestAEView(view: View) {
        val intent = Intent(this, nearestAE::class.java)
        startActivity(intent)
    }
}