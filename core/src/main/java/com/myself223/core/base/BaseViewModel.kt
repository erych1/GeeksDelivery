/*
package com.myself223.geeksdelivery.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myself223.geeksdelivery.core.base.Either
import com.myself223.geeksdelivery.presentation.utils.UiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel :ViewModel(){
    protected fun <T> mutableStateFlow() = MutableStateFlow<UiState<T>>(UiState.Idle())
    protected fun <T,S> Flow<Either<String , T>>.gatherRequest(
        state : MutableStateFlow<UiState<S>>,
        mappedData:(data:T) -> S

    ){
        viewModelScope.launch(Dispatchers.IO) {
            state.value = UiState.Loading()
            this@gatherRequest.collect{
                when(it){
                    is Either.Left-> state.value = UiState.Error(it.value)
                    is Either.Right-> state.value = UiState.Success(mappedData(it.value))
                }
            }
        }
    }
}*/
package com.myself223.core.base

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myself223.common.Either
import com.myself223.core.UiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {
    protected fun <T> mutableStateFlow() = MutableStateFlow<UiState<T>>(UiState.Idle())
    protected fun <T, S> Flow<Either<String, T>>.gatherRequest(
        state: MutableStateFlow<UiState<S>>,
        mappedData: (data: T) -> S
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            state.value = UiState.Loading()
            this@gatherRequest.collect {
                when (it) {
                    is Either.Left -> {
                        Log.e("BaseViewModel", "Error: ${it.value}")
                        state.value = UiState.Error(it.value)
                    }
                    is Either.Right -> {
                        Log.e("BaseViewModel", "Data received: ${it.value}")
                        state.value = UiState.Success(mappedData(it.value))
                    }
                }
            }
        }
    }
}
