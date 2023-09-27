package com.example.gamer_app

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTextViewClick(view: View?) {
        // Cette méthode sera appelée lorsque le TextView est cliqué.
        // Vous pouvez y placer le code que vous souhaitez exécuter lors du clic.
        Toast.makeText(this, "TextView cliqué !", Toast.LENGTH_SHORT).show()
    }

}