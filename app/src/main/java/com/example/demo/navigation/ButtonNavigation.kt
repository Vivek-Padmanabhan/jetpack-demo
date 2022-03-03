package com.example.demo.navigation

import android.app.Activity

import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController

import com.example.demo.R

fun navigateForward(activity: Activity) {
    val navController: NavController = findNavController(activity, R.id.navigationDemo)
    // Business Logic
    navController.navigate(R.id.action_mainFragment_to_secondFragment)
}

fun navigateBackward(activity: Activity) {
    val navController: NavController = findNavController(activity, R.id.navigationDemo)
    // Business Logic
    navController.navigate(R.id.action_secondFragment_to_mainFragment)
}
