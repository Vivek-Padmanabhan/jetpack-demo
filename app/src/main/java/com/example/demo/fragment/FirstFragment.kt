package com.example.demo.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.fragment.app.Fragment

import com.example.demo.R
import com.example.demo.navigation.navigateForward

class FirstFragment : Fragment(R.layout.first_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext: Button = view.findViewById(R.id.button)
        btnNext.setOnClickListener {
            navigateForward(requireActivity())
        }
    }
}