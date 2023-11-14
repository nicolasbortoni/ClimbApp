package com.example.climbapp.home.ui

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.climbapp.core.ui.BottomNavigationBar
import com.example.climbapp.home.ui.Routes.*

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(mainViewModel: MainViewModel){

    //val navigationController = rememberNavController()

    val selectedScreen : Int by mainViewModel.selectedScreen.observeAsState(0)

    Scaffold(
        bottomBar = { BottomNavigationBar(selectedScreen) { mainViewModel.updateIndex(it) } }
    ) {

        when(selectedScreen){
            0 -> {
                RegionsScreen()
            }
            1 -> {
                MapScreen()
            }
            2 -> {
                ProfileScreen()
            }
        }
        /*NavHost(navController = navigationController, startDestination = RegionsScreen.route) {
            composable(RegionsScreen.route) {
                RegionsScreen()
            }
            composable(MapScreen.route) {
                MapScreen()
            }
            composable(ProfileScreen.route) {
                ProfileScreen()
            }
        }*/

    }

}
