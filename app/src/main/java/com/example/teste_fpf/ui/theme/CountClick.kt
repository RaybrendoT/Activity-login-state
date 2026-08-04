package com.example.teste_fpf.ui.theme


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun CountClick() {

    var n by rememberSaveable {
        mutableIntStateOf(0)
    }

    Button(
        onClick = {
            n++
        }
    ) {
        Text(
            text = "Cliques: $n"
        )
    }
}