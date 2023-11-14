package com.example.climbapp.home.ui

sealed class Routes(val route: String){
    object RegionsScreen: Routes("regions")
    object MapScreen: Routes("map")
    object ProfileScreen: Routes("profile")
}
