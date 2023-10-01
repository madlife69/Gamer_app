package com.example.gamer_app

import android.graphics.Color
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gamer_app.databinding.ActivityMainBinding
import com.example.gamer_app.databinding.SplashActivityBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        EmailListener()
        PasswordListener()
        binding.facebook.setOnClickListener() {

            val snackbar =
                Snackbar.make(binding.root, " SOON !!    ", Snackbar.LENGTH_LONG)
                    .setAction("action", null)
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.view
            snackbarView.setBackgroundColor(Color.WHITE)
            snackbar.show()

        }
        binding.google.setOnClickListener() {

            val snackbar =
                Snackbar.make(binding.root, " SOON !!  ", Snackbar.LENGTH_LONG)
                    .setAction("action", null)
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.view
            snackbarView.setBackgroundColor(Color.WHITE)
            snackbar.show()

        }



    }

    fun onTextViewClick(view: View?) {
        // Cette méthode sera appelée lorsque le TextView est cliqué.
        // Vous pouvez y placer le code que vous souhaitez exécuter lors du clic.
        Toast.makeText(this, "TextView cliqué !", Toast.LENGTH_SHORT).show()
    }
    fun EmailListener(){
        binding.textInputEmail.setOnFocusChangeListener{_,focused ->
            if(!focused)
            {
                binding.emailcontainer.helperText = validemail()
            }
        }
    }

    private fun validemail(): String? {
        val email = binding.textInputEmail.text.toString()
        if(email.length == 0 || email == " @esprit.tn" || email == "@esprit.tn"  )
        {
            return "email must not be empty !"
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            return "Invalid email address"
        }
            return null


    }
    fun PasswordListener(){
        binding.textInputPassword.setOnFocusChangeListener{_,focused ->
            if(!focused)
            {
                binding.passwordcontainer.helperText = valipassword()
            }
        }
    }

    private fun valipassword(): String? {
        val pwd = binding.textInputPassword.text.toString()
        if(pwd.length==0)
        {
            return "password must not be empty !"
        }
  return null

    }




}