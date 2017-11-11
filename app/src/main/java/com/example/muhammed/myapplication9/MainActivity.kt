package com.example.muhammed.myapplication9

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var chkb : CheckBox
    lateinit var chkb1 : CheckBox
    lateinit var chkb2 : CheckBox
    lateinit var btn : Button
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         chkb    = findViewById(R.id.checkbox1)
         chkb1   = findViewById(R.id.checkBox2)
         chkb2   = findViewById(R.id.checkBox3)
         btn  = findViewById(R.id.button)
         textView
    }
}
