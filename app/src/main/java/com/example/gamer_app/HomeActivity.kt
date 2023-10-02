package com.example.gamer_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gamer_app.databinding.ActivityHomeBinding
import com.example.gamer_app.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}