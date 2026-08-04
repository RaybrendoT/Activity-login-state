package com.example.teste_fpf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.teste_fpf.ui.theme.HomeScreen

class HomeActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        val email = intent.getStringExtra("EMAIL") ?: ""


        setContent {

            HomeScreen(

                email = email,

                onLogout = {

                    finish()

                }

            )

        }

    }

}