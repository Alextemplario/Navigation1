package com.example.navigation1.presentation.ui.navegation

sealed class Screen(val route: String) {
    data object Screen1 : Screen("screen1")
    object Screen2 : Screen("screen2")
    object Screen3 : Screen("screen3")

}