package com.pdm0126.laboratorio3.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListScreen(
  modifier: Modifier = Modifier,
  onNavigateBack: () -> Unit
) {
  Column(
    modifier = Modifier.safeContentPadding().padding(32.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {

    val persona: MutableState<String> = remember { mutableStateOf("") }
    val listaPersonas = remember { mutableStateListOf<String>() }

    Button(
      onClick = onNavigateBack,
      modifier = Modifier.padding(8.dp).align(Alignment.Start)
    ) {
      Text("Volver")
    }
    Text("Lista de personas")

    TextField(
      modifier = Modifier.fillMaxWidth(),
      value = persona.value,
      onValueChange = { persona.value = it },
      label = { Text("Nombre") }
    )
    Button(onClick = {listaPersonas.add(persona.value)}) {
      Text(text = "Guardar")
    }

    Row(Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)) {
      Text(
        modifier = Modifier.weight(2f),
        text = "Listado de nombres y posición en la lista"
      )
      Button(
        modifier = Modifier.weight(1f),
        onClick = {listaPersonas.clear()}
      ) { Text(text = "Limpiar") }
    }

    Surface(
      modifier = Modifier.fillMaxSize(),
      shape = RoundedCornerShape(8.dp),
      border = BorderStroke(4.dp, Color.Blue)
    ) {
      LazyColumn {
        itemsIndexed(listaPersonas.toList()) { index, item ->
          Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
          ) {
            Text(text = item)
            Text(text = (index + 1).toString())
          }
        }
      }
    }

  }
}