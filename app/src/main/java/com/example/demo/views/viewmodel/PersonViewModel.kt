package com.example.demo.views.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonViewModel: ViewModel() {
    private val _name = MutableLiveData("Vivek")

    val name: LiveData<String> = _name
}