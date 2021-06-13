package com.trian.myapplication.ui.pages.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trian.myapplication.R
import com.trian.myapplication.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

private lateinit var _b:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      _b =  FragmentHomeBinding.inflate(layoutInflater)
        return _b.root;
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}