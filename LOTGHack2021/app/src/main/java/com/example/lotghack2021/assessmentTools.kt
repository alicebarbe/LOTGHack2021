package com.example.lotghack2021

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class assessmentTools : AppCompatActivity() {
    var PHYSICAL_SYMPTOMS = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assessment_tools)
        PHYSICAL_SYMPTOMS = false
    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            println("checked is: " + checked.toString())
            PHYSICAL_SYMPTOMS = checked
            // bug: PHYSICAL_SYMPTOMS changes to false on checkbox unclicking, regardless of whether others are clicked
        }
    }
    fun onNextClicked(view: View) {
        if (PHYSICAL_SYMPTOMS) {
            // seek immediate medical attention, get off the field
            val intent2 = Intent(this, getOffField::class.java)
            startActivity(intent2)
        } else  {
            // no symptoms
            val intent2 = Intent(this, assessmentTools2::class.java)
            startActivity(intent2)
        }
    }

}