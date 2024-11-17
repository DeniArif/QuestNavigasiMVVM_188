package com.example.praktikum5.ui.theme.view


import android.R
import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.selects.select


@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    pilihanJK:List<String>,
    onClikButton: (MutableList<String>) -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var nohp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisK by remember { mutableStateOf("") }
    var NIM by remember { mutableStateOf("") }


    var ListData : MutableList<String> = mutableListOf(nama, NIM, jenisK, nohp, alamat)

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Biodata",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.padding(20.dp))

        TextField(
            value = nama,
            onValueChange =  {nama = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Nama")
            },
            placeholder = {
                Text("Masukkan Nama Anda")
            }
        )

        TextField(
            value = NIM,
            onValueChange =  {NIM = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("NIM")
            },
            placeholder = {
                Text("Masukkan NIM Anda")
            }
        )

        Row{
            pilihanJK.forEach{selectedJK ->
                Row (
                    verticalAlignment = Alignment.CenterVertically){
                    RadioButton(selected = jenisK == selectedJK,
                        onClick = {
                            jenisK = selectedJK
                        })
                    Text(selectedJK)
                }}
        }

        TextField(
            value = nohp,
            onValueChange =  {nohp = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("No HP")
            },
            placeholder = {
                Text("Masukkan No HP Anda")
            }

        )
        TextField(
            value = email,
            onValueChange =  {email = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Email")
            },
            placeholder = {
                Text("Masukkan Email Anda")
            }
        )
        TextField(
            value = nohp,
            onValueChange =  {nohp = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("NoHp")
            },
            placeholder = {
                Text("Masukkan NoHP Anda")
            }
        )
        TextField(
            value = alamat,
            onValueChange =  {alamat = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Alamat")
            },
            placeholder = {
                Text("Masukkan Alamat Anda")
            }
        )
        Button(onClick ={
            onClikButton(ListData)

        },modifier = Modifier.padding(vertical = 10.dp) ) {
            Text("Simpan")
        }
    }

}
