package com.example.praktikum5.ui.theme.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.praktikum5.model.Mahasiswa

@Composable
fun TampilMahasiswaView(
    mhs:Mahasiswa,
    navController: NavHostController

){
    Column(modifier = Modifier.fillMaxSize()){
        TampilData(
            Judul = "Nama",
            Isinya = mhs.nama
        )
        TampilData(
            Judul = "NIM",
            Isinya = mhs.NIM
        )
        TampilData(
            Judul = "Jenis Kelamin",
            Isinya = mhs.gender
        )
        TampilData(
            Judul = "noHp",
            Isinya = mhs.noHp
        )
        TampilData(
            Judul = "EMAIL",
            Isinya = mhs.email
        )
        TampilData(
            Judul = "Alamat",
            Isinya = mhs.alamat
        )
        Button(onClick = {navController.popBackStack()},
            modifier = Modifier.padding(16.dp))
        {
            Text("Kembali")
        }

    }

}
@Composable
fun TampilData(
    Judul : String,
    Isinya : String
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(Judul, modifier = Modifier.weight(0.8f))
        Text(" : ", modifier = Modifier.weight(0.8f))
        Text(Isinya, modifier = Modifier.weight(2f))
    }
}