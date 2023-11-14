package com.example.climbapp.core.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable

@Composable
fun BottomNavigationBar(selectedScreen: Int, function: (Int) -> Unit) {

    NavigationBar() {
        NavigationBarItem(
            selected = selectedScreen == 0,
            onClick = {
                function(0)
            },
            icon = { Icon(imageVector = Icons.Default.Add, contentDescription = "") }
        )
        NavigationBarItem(
            selected = selectedScreen == 1,
            onClick = {
                function(1)
            },
            icon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "") }
        )
        NavigationBarItem(
            selected = selectedScreen == 2,
            onClick = {
                function(2)
            },
            icon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") }
        )
    }
}