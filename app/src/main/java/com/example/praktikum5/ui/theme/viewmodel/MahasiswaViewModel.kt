package com.example.praktikum5.ui.theme.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.praktikum5.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class MahasiswaViewModel: ViewModel() {
    private val _uistate = MutableStateFlow(Mahasiswa())

    val  uistate: StateFlow<Mahasiswa> = _uistate.asStateFlow()

    fun saveDataMahasiswa(
        ls :MutableList<String>
    ){
        _uistate.update { data ->
            data.copy(
                nama = ls[0],
                nim
                gender = ls[1],
                alamat = ls[2]
            )
        }
    }
}