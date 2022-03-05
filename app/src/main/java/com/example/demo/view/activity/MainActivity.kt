package com.example.demo.view.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import com.example.demo.R

class MainActivity : AppCompatActivity(R.layout.main_activity) {
    override fun onSupportNavigateUp() = findNavController(this, R.id.navigationDemo).navigateUp()
}