package com.example.demo.views.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonViewModel: ViewModel() {
    private val _name = MutableLiveData("Natash")

    val name: LiveData<String> = _name

    fun updateName(name: String) {
        _name.value = name
    }
}