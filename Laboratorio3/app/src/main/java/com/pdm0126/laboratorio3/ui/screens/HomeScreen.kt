package com.pdm0126.laboratorio3.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
  modifier: Modifier = Modifier,
  onNavigateList: () -> Unit,
  onNavigateSensor: () -> Unit
) {
  Column(
    modifier = Modifier.fillMaxSize().padding(32.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = "PDM - Laboratorio 3",
      fontSize = 32.sp,
      fontWeight = FontWeight.Bold
    )
    Text("Daniel Alexander Armas Domínguez")
    Text("00232622 - Sección 02")

    Spacer(Modifier.height(64.dp))

    Button(onClick = onNavigateList) {
      Text("Ver lista de personas")
    }

    Spacer(Modifier.height(32.dp))

    Button(onClick = onNavigateSensor) {
      Text("Ver información de sensor")
    }
  }
}