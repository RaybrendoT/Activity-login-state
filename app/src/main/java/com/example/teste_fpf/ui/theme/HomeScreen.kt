package com.example.teste_fpf.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class Usuario(
    val email: String
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    email: String,
    onLogout: () -> Unit
) {

    val usuario = Usuario(email)


    Scaffold(


    ) { padding ->


        Box(

            modifier = Modifier
                .fillMaxSize()
                .padding(padding),

            contentAlignment = Alignment.Center

        ) {


            Card(

                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),

                shape = MaterialTheme.shapes.large,

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                )

            ) {


                Column(

                    modifier = Modifier
                        .padding(32.dp),

                    horizontalAlignment = Alignment.CenterHorizontally

                ) {


                    Icon(

                        imageVector = Icons.Default.AccountCircle,

                        contentDescription = null,

                        modifier = Modifier
                            .size(100.dp)

                    )


                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )


                    Text(

                        text = "Bem-vindo!",

                        style = MaterialTheme.typography.headlineMedium

                    )


                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )


                    Text(

                        text = usuario.email,

                        style = MaterialTheme.typography.bodyLarge

                    )


                    Spacer(
                        modifier = Modifier.height(30.dp)
                    )


                    Button(

                        onClick = {
                            onLogout()
                        },

                        modifier = Modifier
                            .fillMaxWidth()

                    ) {

                        Icon(
                            Icons.Default.ExitToApp,
                            contentDescription = null
                        )

                        Spacer(
                            Modifier.width(8.dp)
                        )

                        Text("Sair")

                    }

                }

            }

        }

    }

}



@Preview(showBackground = true)
@Composable
fun PreviewHome() {

    MaterialTheme {

        HomeScreen(
            email = "usuario@email.com",
            onLogout = {}
        )

    }

}