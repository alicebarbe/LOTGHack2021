package com.example.lotghack2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
var PHYSICAL_SYMPTOMS = false
class assessmentTools : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assessment_tools)
    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkBox1 -> {
                    PHYSICAL_SYMPTOMS = PHYSICAL_SYMPTOMS.or(checked)
                }
                R.id.checkBox2 -> {
                    PHYSICAL_SYMPTOMS = PHYSICAL_SYMPTOMS.or(checked)
                }
                R.id.checkBox3 -> {
                    PHYSICAL_SYMPTOMS = PHYSICAL_SYMPTOMS.or(checked)
                }
                R.id.checkBox4 -> {
                    PHYSICAL_SYMPTOMS = PHYSICAL_SYMPTOMS.or(checked)
                }
            }
        }
    }
    fun onNextClicked(view: View) {
        if (PHYSICAL_SYMPTOMS) {
            val intent2 = Intent(this, getOffField::class.java)
            println("get off field")
            PHYSICAL_SYMPTOMS = false
            startActivity(intent2)
        } else  {
            val intent2 = Intent(this, noIssues::class.java)
            println("no issues")
            PHYSICAL_SYMPTOMS = false
            startActivity(intent2)
        }
    }

}