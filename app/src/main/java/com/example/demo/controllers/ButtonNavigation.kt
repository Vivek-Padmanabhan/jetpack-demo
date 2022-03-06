package com.example.demo.controllers

import android.util.Log
import android.app.Activity

import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController

import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

import com.example.demo.R
import com.example.demo.models.entity.Person
import com.example.demo.models.repository.PersonRepository
import com.example.demo.views.viewmodel.PersonViewModel

suspend fun navigateForward(coroutineContext: CoroutineContext, viewModel: PersonViewModel, activity: Activity) {
    // Update Name
    val person: Person = withContext(coroutineContext) {
        PersonRepository.search()
    }
    viewModel.updateName(person.name)

    // Navigate
    val navController: NavController = findNavController(activity, R.id.navigationDemo)
    navController.navigate(R.id.action_mainFragment_to_secondFragment)
}

fun navigateBackward(viewModel: PersonViewModel, activity: Activity) {
    // Update Name
    viewModel.updateName("Vivek")

    // Navigate
    val navController: NavController = findNavController(activity, R.id.navigationDemo)
    navController.navigate(R.id.action_secondFragment_to_mainFragment)
}
