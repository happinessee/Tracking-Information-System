package com.example.trackinginfosystem

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trackinginfosystem.Destinations.WELCOME_ROUTE

object Destinations {
    const val WELCOME_ROUTE = "welcome"
    const val SIGN_UP_ROUTE = "signup/{email}"
    const val SIGN_IN_ROUTE = "signin/{email}"
}

@Composable
fun TrackingInfoSystemNavHost(navController: NavHostController = rememberNavController(),) {
    NavHost(navController = navController, startDestination = WELCOME_ROUTE,) {
        composable(WELCOME_ROUTE) {WelcomeRoute(onNavigateToSignIn = {

        })}


    }

}
