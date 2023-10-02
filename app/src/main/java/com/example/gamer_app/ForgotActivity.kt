package com.example.gamer_app

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gamer_app.databinding.ActivityMainBinding
import com.example.gamer_app.databinding.ForgotPasswordBinding

class ForgotActivity : AppCompatActivity() {
    private lateinit var binding:ForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}