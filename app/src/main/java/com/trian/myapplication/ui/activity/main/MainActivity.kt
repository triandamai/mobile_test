package com.trian.myapplication.ui.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.trian.myapplication.R
import com.trian.myapplication.databinding.ActivityAuthBinding
import com.trian.myapplication.ui.activity.auth.AuthViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var _b:ActivityAuthBinding
    private lateinit var navController:NavController;
    private lateinit var authViewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _b= ActivityAuthBinding.inflate(layoutInflater)
        setContentView(_b.root)

        navController = findNavController(R.id.nav_host_fragment_container)
        navController.addOnDestinationChangedListener{
            _,destination,_->{

        }
        }
        authViewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        authViewModel.userAuth.observe(this,{
            it?.let {
                navController.navigate(R.id.homeFragment)

            }
        })

    }


}