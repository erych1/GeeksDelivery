package com.myself223.main.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.myself223.main.R
import com.myself223.main.databinding.FragmentMainFlowBinding

class MainFlowFragment:Fragment() {
    private val binding:FragmentMainFlowBinding by lazy {
        FragmentMainFlowBinding.inflate(layoutInflater)
    }
/*    private val navController: NavController by lazy {
        val navHostFragment =
            childFragmentManager.findFragmentById(R.id.main_graph) as NavHostFragment
        navHostFragment.navController
    }*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

   /* private fun initBottomNav() {
        binding.bottomNav.apply {
            setupWithNavController(navController)
            itemIconTintList = null
        }
    }*/
}