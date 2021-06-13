package com.trian.myapplication.utils

import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

import androidx.lifecycle.ViewModel

abstract class MyActivity<VM :ViewModel>:AppCompatActivity() {

    protected lateinit var _viewModel:VM

}