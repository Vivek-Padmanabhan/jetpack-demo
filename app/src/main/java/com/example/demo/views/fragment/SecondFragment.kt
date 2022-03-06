package com.example.demo.views.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

import com.example.demo.R
import com.example.demo.controllers.navigateBackward
import com.example.demo.databinding.SecondFragmentBinding
import com.example.demo.views.viewmodel.PersonViewModel

class SecondFragment : Fragment(R.layout.second_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = SecondFragmentBinding.bind(view)
        val viewModel: PersonViewModel by activityViewModels()
        binding.viewmodel = viewModel

        val btnNext: Button = view.findViewById(R.id.button2)
        btnNext.setOnClickListener {
            navigateBackward(viewModel, requireActivity())
        }
    }
}