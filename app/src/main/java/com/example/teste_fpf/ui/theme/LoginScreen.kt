package com.example.teste_fpf.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class LoginState {

    var email by mutableStateOf("")
    var senha by mutableStateOf("")

    val podeEntrar: Boolean
        get() = email.isNotBlank() && senha.isNotBlank()
}


@Composable
fun LoginScreen(
    onLogin: (String) -> Unit,
    onForgotPassword: () -> Unit
) {

    val state = remember {
        LoginState()
    }


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                )
            ) {


                Column(
                    modifier = Modifier
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Text(
                        text = "LOGIN",
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = "Entre com sua conta",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Gray
                    )


                    Spacer(
                        Modifier.height(30.dp)
                    )


                    OutlinedTextField(

                        value = state.email,

                        onValueChange = {
                            state.email = it
                        },

                        label = {
                            Text("E-mail")
                        },

                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "Email"
                            )
                        },

                        singleLine = true,

                        modifier = Modifier
                            .fillMaxWidth(),

                        shape = RoundedCornerShape(12.dp)
                    )


                    Spacer(
                        Modifier.height(16.dp)
                    )


                    OutlinedTextField(

                        value = state.senha,

                        onValueChange = {
                            state.senha = it
                        },

                        label = {
                            Text("Senha")
                        },


                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "Senha"
                            )
                        },


                        visualTransformation = PasswordVisualTransformation(),


                        singleLine = true,


                        modifier = Modifier
                            .fillMaxWidth(),


                        shape = RoundedCornerShape(12.dp)
                    )


                    Spacer(
                        Modifier.height(24.dp)
                    )


                    Button(

                        enabled = state.podeEntrar,


                        onClick = {

                            onLogin(state.email)

                        },


                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),


                        shape = RoundedCornerShape(12.dp)

                    ) {

                        Text(
                            text = "Entrar",
                            fontWeight = FontWeight.Bold
                        )

                    }



                    Spacer(
                        Modifier.height(20.dp)
                    )



                    Text(

                        text = "Esqueci minha senha",

                        color = MaterialTheme.colorScheme.primary,

                        modifier = Modifier
                            .clickable {

                                onForgotPassword()

                            }

                    )

                }

            }

        }

    }
}



@Preview(
    showBackground = true
)
@Composable
fun PreviewLogin() {

    MaterialTheme {

        LoginScreen(
            {},
            {}
        )

    }
}