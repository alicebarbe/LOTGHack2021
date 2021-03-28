package com.example.lotghack2021

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class getOffField : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_off_field)
    }
    fun nearestAEView(view: View) {
        val intent = Intent(this, nearestAE::class.java)
        startActivity(intent)
    }
    fun homeView(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun visitWebsite(view: View) {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.englandrugby.com/participation/playing/headcase"))
        startActivity(i)
    }
}