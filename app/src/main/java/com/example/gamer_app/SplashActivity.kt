package com.example.gamer_app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
//        imageView_splash.alpha = 0f
        val iv_note = findViewById<ImageView>(R.id.imageView_splash)
        iv_note.alpha = 0f
        iv_note.animate().setDuration(2000).alpha(1f).withEndAction{
            val i = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }


//  }
//    private fun goToMain() {
//        Thread.sleep(2000)
//        val i = Intent(this@SplashActivity, MainActivity::class.java)
//        finish()
//        startActivity(i)
//    }
    }
}