package com.example.teste_fpf

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.teste_fpf.HomeActivity
import com.example.teste_fpf.ui.theme.LoginScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            LoginScreen(
                onLogin = { email ->

                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("EMAIL", email)
                    startActivity(intent)

                },
                onForgotPassword = {

                    // ação futura

                }
            )
        }
    }
}