package com.example.gamer_app

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gamer_app.databinding.ActivityMainBinding
import com.example.gamer_app.databinding.ValidationBinding

class ValidationActivity : AppCompatActivity() {
    private lateinit var binding : ValidationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ValidationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}