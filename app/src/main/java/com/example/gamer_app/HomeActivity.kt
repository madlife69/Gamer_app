package com.example.gamer_app

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gamer_app.databinding.ActivityHomeBinding
import com.example.gamer_app.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        // Set up the initial fragment
        val homeFragment = homeFragment()
        changeFragment(homeFragment, "homeFragment")

        // Initialize BottomNavigationView
        val navView: BottomNavigationView = findViewById(R.id.bottomNav)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        // Set the initial tab (fragment) based on your requirements
        // For example, you can use storeFragment here
       // changeFragment(storeFragment, "storefragment")
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home -> {
                val homeFragment = homeFragment()
                changeFragment(homeFragment, "homeFragment")
                binding.toolbar.menu.clear()
                menuInflater.inflate(R.menu.menu_toolbar, binding.toolbar.menu)

                return@OnNavigationItemSelectedListener true
            }
            R.id.trend -> {
                val storeFragment = Storefragment()
                changeFragment(storeFragment, "storeFragment")
                binding.toolbar.menu.clear()
                menuInflater.inflate(R.menu.menu_toolbar_newicon, binding.toolbar.menu)

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun changeFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .replace(binding.frameLayout.id, fragment, tag)
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home2 -> {
                val homeFragment = homeFragment()
                changeFragment(homeFragment, "homeFragment")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
