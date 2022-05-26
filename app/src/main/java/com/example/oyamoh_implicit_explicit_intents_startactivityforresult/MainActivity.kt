package com.example.oyamoh_implicit_explicit_intents_startactivityforresult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oyamoh_implicit_explicit_intents_startactivityforresult.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {

        }
    }
}