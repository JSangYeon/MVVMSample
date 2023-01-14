package jsy.test.mvvmsample.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import jsy.test.mvvmsample.MvvmSampleApplication
import jsy.test.mvvmsample.R
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
) : ViewModel() {

    private val _mainText = MutableLiveData<String>()
    val mainText: LiveData<String>
        get() = _mainText

    init {
        _mainText.value = "1234"
    }

    fun changeMainText(){
        _mainText.value = MvvmSampleApplication.instance.getString(R.string.test_provider)
    }
}