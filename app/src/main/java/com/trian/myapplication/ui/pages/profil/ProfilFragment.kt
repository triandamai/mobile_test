package com.trian.myapplication.ui.pages.profil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trian.myapplication.R
import com.trian.myapplication.databinding.FragmentProfilBinding


class ProfilFragment : Fragment() {
private lateinit var _b:FragmentProfilBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _b= FragmentProfilBinding.inflate(layoutInflater)
        return _b.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ProfilFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}