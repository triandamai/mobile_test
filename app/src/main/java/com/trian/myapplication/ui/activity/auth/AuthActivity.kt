package com.trian.myapplication.ui.activity.auth


import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.trian.myapplication.databinding.ActivityAuthBinding
import com.trian.myapplication.ui.activity.main.MainActivity
import com.trian.myapplication.utils.MyActivity

class AuthActivity : MyActivity<AuthViewModel>() {
    lateinit var _binding:ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(_binding.root);
        _viewModel = ViewModelProvider(this).get(AuthViewModel::class.java);

        observe()
        _binding.btnMasuk.setOnClickListener {

            _viewModel.processAuth("","");
        }

    }
    fun observe(){
        _viewModel.userAuth.observe(this, Observer {
            it?.uid?.let {
                startActivity(Intent(this, MainActivity::class.java));
                finish();
            }
        })
    }
}