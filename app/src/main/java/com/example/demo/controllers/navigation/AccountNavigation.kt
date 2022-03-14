package com.example.demo.controllers.navigation

import javax.inject.Inject
import android.app.Activity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.demo.R

import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

import com.example.demo.views.viewmodel.PersonViewModel
import com.example.demo.models.data.repository.AccountRepository

class AccountNavigation @Inject constructor(private val accountRepository: AccountRepository) {
    suspend fun navigateForward(coroutineContext: CoroutineContext, viewModel: PersonViewModel, activity: Activity) {
        // Network Call
        val account = withContext(coroutineContext) {
            accountRepository.getAccount("")
        }

        // Navigate
        val navController: NavController = Navigation.findNavController(activity, R.id.navigationDemo)
        navController.navigate(R.id.action_mainFragment_to_secondFragment)
    }
}