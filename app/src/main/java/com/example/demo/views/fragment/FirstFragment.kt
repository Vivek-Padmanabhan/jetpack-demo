package com.example.demo.views.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.demo.R
import com.example.demo.controllers.navigation.navigateForward
import com.example.demo.databinding.FirstFragmentBinding
import com.example.demo.views.data.Person

class FirstFragment : Fragment(R.layout.first_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FirstFragmentBinding.bind(view)
        val viewModel = ViewModelProvider(this).get(Person::class.java)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        val btnNext: Button = view.findViewById(R.id.button)
        btnNext.setOnClickListener {
            navigateForward(requireActivity())
        }
    }
}