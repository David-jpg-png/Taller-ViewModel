package me.AndresCala.tallerviewmodel

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    val counterViewModel: CounterViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "counter"
    ) {

        composable("counter") {
            CounterScreen(
                viewModel = counterViewModel,
                onNavigate = {
                    navController.navigate("info")
                }
            )
        }

        composable("info") {
            InfoScreen()
        }
    }
}