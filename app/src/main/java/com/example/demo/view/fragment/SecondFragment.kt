package com.example.demo.view.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.fragment.app.Fragment

import com.example.demo.R
import com.example.demo.view.navigation.navigateBackward

class SecondFragment : Fragment(R.layout.second_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext: Button = view.findViewById(R.id.button2)
        btnNext.setOnClickListener {
            navigateBackward(requireActivity())
        }
    }
}