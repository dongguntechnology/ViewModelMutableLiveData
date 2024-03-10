package com.dongguninnovatiion.viewmodelmutablelivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel {
    private var _testMutableLiveData = MutableLiveData(0)

    val testLiveData : LiveData<Int> get() = _testMutableLiveData

    fun plusLiveDataValue(){
        _testMutableLiveData.value = _testMutableLiveData.value!!.plus(1)
    }


}