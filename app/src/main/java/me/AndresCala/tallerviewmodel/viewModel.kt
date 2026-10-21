package me.AndresCala.tallerviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModel : ViewModel() {

    private val _contador = MutableStateFlow(0)

    val contador: StateFlow<Int> = _contador

    fun incrementar() {
        _contador.value++
    }

    fun disminuir() {
        _contador.value--
    }
}