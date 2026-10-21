package me.AndresCala.tallerviewmodel

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen(
    viewModel: CounterViewModel,
    onNavigate: () -> Unit
) {

    val contador by viewModel.contador.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Contador: $contador",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Button(
                onClick = {
                    viewModel.disminuir()
                }
            ) {
                Text("-")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = {
                    viewModel.incrementar()
                }
            ) {
                Text("+")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = onNavigate) {
            Text("¿Qué hace el ViewModel?")
        }
    }
}