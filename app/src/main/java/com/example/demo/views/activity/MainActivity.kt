package com.example.demo.views.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController

import javax.inject.Inject
import dagger.hilt.android.AndroidEntryPoint

import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

import com.example.demo.R
import com.example.demo.controllers.navigation.PersonNavigation
import com.example.demo.views.viewmodel.PersonViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.main_activity) {

    @Inject
    lateinit var personNavigation: PersonNavigation

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