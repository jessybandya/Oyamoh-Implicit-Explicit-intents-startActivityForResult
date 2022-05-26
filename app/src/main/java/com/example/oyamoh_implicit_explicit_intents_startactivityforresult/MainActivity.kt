package com.example.oyamoh_implicit_explicit_intents_startactivityforresult

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.oyamoh_implicit_explicit_intents_startactivityforresult.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()  {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            button1.setOnClickListener{
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivityForResult(intent, 2)
            }
        }
    }

    // Call Back method  to get the Message form other Activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        binding.apply {
            // check if the request code is same as what is passed  here it is 2
            if (requestCode == 2) {
                val message = data?.getStringExtra("MESSAGE")
                textView1.text = message
            }
        }

    }



}