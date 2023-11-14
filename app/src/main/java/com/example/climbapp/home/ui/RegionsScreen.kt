package com.example.climbapp.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegionsScreen(){
    Box (modifier = Modifier.fillMaxSize()){
        Text(text = "Regions Screen", modifier = Modifier.align(Alignment.Center))
    }
}