package com.myself223.geeksdelivery.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.myself223.geeksdelivery.R
import com.myself223.geeksdelivery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val navController: NavController by lazy {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.main_content) as NavHostFragment
        navHostFragment.navController
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        initBottomNav()

    }
    private fun initBottomNav() {
        binding.bottomNav.apply {
            setupWithNavController(navController)
            itemIconTintList = null
        }
    }
}