package com.example.lotghack2021

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

var PHYSICAL_SYMPTOMS = false
class assessmentTools : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assessment_tools)
    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            println("checked is: " + checked.toString())
            PHYSICAL_SYMPTOMS = checked
        }
    }
    fun onNextClicked(view: View) {
        if (PHYSICAL_SYMPTOMS) {
            // seek immediate medical attention, get off the field
            val intent2 = Intent(this, getOffField::class.java)
            PHYSICAL_SYMPTOMS = false
            startActivity(intent2)
        } else  {
            // no symptoms
            val intent2 = Intent(this, assessmentTools2::class.java)
            PHYSICAL_SYMPTOMS = false
            startActivity(intent2)
        }
    }

}