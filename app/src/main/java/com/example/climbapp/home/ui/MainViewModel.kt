package com.example.climbapp.home.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _selectedScreen = MutableLiveData<Int>()
    val selectedScreen: LiveData<Int> = _selectedScreen
    fun updateIndex(newValue: Int){
        _selectedScreen.value = newValue
    }

}