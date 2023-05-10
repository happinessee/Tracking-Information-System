package com.example.trackinginfosystem

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController

object Destinations {
    const val WELCOME_ROUTE = "welcome"
    const val SIGN_UP_ROUTE = "signup/{email}"
    const val SIGN_IN_ROUTE = "signin/{email}"
}

@Composable
fun TrackingInfoSystemNavHost(navController: NavHostController = rememberNavController(),) {
    NavHost() {}

}
