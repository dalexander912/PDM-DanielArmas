package com.pdm0126.laboratorio4.screens.HomeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
  navigateToList: () -> Unit
) {
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(text = "Laboratorio 4", fontSize = 32.sp)
    Spacer(Modifier.height(16.dp))

    Text("Arquitectura MVVM")
    Spacer(Modifier.height(32.dp))

    Text("Daniel Alexander Armas Domínguez")
    Text("00232622")
    Spacer(Modifier.height(32.dp))

    Button(
      navigateToList
    ) {
      Text("Ver tareas")
    }
  }
}