package com.example.reusetextfield.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.reusetextfield.views.HomeScreen

@Composable
fun MainContent(){
    val navController = rememberNavController()
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
            composable(Screen.HomeScreen.route){
                HomeScreen()
            }
        }
    }
}