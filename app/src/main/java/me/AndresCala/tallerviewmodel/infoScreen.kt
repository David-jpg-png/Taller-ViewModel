package me.AndresCala.tallerviewmodel

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InfoScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text(
            text = "¿Qué es un ViewModel?",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = """
                El contador no está guardado en la pantalla.
                
                El valor se encuentra dentro de CounterViewModel.
                
                La pantalla simplemente observa los cambios y los muestra.
                
                Esta es la principal ventaja del patrón MVVM:
                
                • UI separada de la lógica.
                • Código más organizado.
                • Estado persistente durante cambios de configuración.
            """.trimIndent()
        )
    }
}