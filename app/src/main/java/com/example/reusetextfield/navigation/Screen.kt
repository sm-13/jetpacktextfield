package com.example.reusetextfield.navigation

sealed class Screen(val route: String){
    object HomeScreen: Screen("homeScreen")
}
