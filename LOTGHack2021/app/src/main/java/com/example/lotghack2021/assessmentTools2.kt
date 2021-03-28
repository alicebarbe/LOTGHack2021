package com.example.lotghack2021

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox

var MADDOCK_SYMPTOMS = false
class assessmentTools2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assessment_tools2)
    }
    fun visitWebsite(view: View) {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.englandrugby.com/participation/playing/headcase"))
        startActivity(i)
    }
    fun homeView(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}