package com.trian.myapplication.ui.pages.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trian.myapplication.R


class OnTestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_test, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            OnTestFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}