package com.example.navigation1.presentation.ui.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation1.presentation.ui.screens.Screen1
import com.example.navigation1.presentation.ui.screens.Screen2
import com.example.navigation1.presentation.ui.screens.Screen3
import com.example.navigation1.ui.theme.Navigation1Theme

@Composable
fun NavGraph(startDestination: String = Screen.Screen1.route){
    //Cargamos el navController
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination){
        composable(Screen.Screen1.route){
            Screen1(navController)
        }
        composable(Screen.Screen2.route){
            Screen2(navController)
        }
        composable(Screen.Screen3.route){
            Screen3(navController)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Navigation1Theme {
        NavGraph()
    }
}