package jsy.test.mvvmsample.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _mainText = MutableLiveData<String>()
    val mainText: LiveData<String>
        get() = _mainText


    init {
        _mainText.value = "1234"
    }

    fun changeMainText(){
        _mainText.value = "5555"
    }
}