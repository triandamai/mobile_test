package com.trian.myapplication.ui.pages.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trian.myapplication.R
import com.trian.myapplication.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    private lateinit var _b:FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _b= FragmentSplashBinding.inflate(layoutInflater)
        return _b.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            SplashFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}