package com.example.demo.views.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope

import kotlinx.coroutines.launch

import com.example.demo.R
import com.example.demo.views.viewmodel.PersonViewModel
import com.example.demo.databinding.FirstFragmentBinding
import com.example.demo.views.activity.MainActivity

class FirstFragment : Fragment(R.layout.first_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FirstFragmentBinding.bind(view)
        val viewModel: PersonViewModel by activityViewModels()
        binding.viewmodel = viewModel

        val btnNext: Button = view.findViewById(R.id.button)
        btnNext.setOnClickListener {
            viewLifecycleOwner.lifecycleScope.launch {
                if (activity is MainActivity) (activity as MainActivity).navigateForward(coroutineContext, viewModel)
            }
        }
    }
}