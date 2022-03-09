package com.example.demo.views.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController

import org.koin.android.ext.android.inject

import com.example.demo.R
import com.example.demo.controllers.navigation.PersonNavigation
import com.example.demo.views.viewmodel.PersonViewModel

import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(R.layout.main_activity) {
    private val personNavigation: PersonNavigation by inject()

    suspend fun navigateForward(coroutineContext: CoroutineContext, viewModel: PersonViewModel) {
        withContext(coroutineContext) {
            personNavigation.navigateForward(coroutineContext, viewModel, this@MainActivity)
        }
    }

    fun navigateBackward(viewModel: PersonViewModel) {
        personNavigation.navigateBackward(viewModel, this)
    }

    override fun onSupportNavigateUp() = findNavController(this, R.id.navigationDemo).navigateUp()
}