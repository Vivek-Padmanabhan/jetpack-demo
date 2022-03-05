package com.example.demo.views.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Person: ViewModel() {
    private val _name = MutableLiveData("Vivek")

    val name: LiveData<String> = _name
}