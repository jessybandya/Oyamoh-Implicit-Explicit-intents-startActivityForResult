package com.example.oyamoh_implicit_explicit_intents_startactivityforresult

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.oyamoh_implicit_explicit_intents_startactivityforresult.databinding.ActivityMainBinding


class SecondActivity : Activity() {
    var editText1: EditText? = null
    var button1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        editText1 = findViewById<View>(R.id.editText1) as EditText
        button1 = findViewById<View>(R.id.button1) as Button

        button1!!.setOnClickListener {
            val message = editText1!!.text.toString()
            val intent = Intent()
            intent.putExtra("MESSAGE", message)
            setResult(2, intent)
            finish() //finishing activity
        }
    }


}