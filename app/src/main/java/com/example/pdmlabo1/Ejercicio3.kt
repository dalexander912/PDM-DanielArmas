package com.example.pdmlabo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pdmlabo1.ui.theme.PDMLabo1Theme

class Estudiante(
    var nombre: String,
    var carnet: Int,
    var asignatura: String
)

@Composable
fun Ejercicio3() {
    val Ciclo01 = listOf(
        Estudiante("Daniel", 232622, "Moviles"),
        Estudiante("Maria", 182622, "Moviles"),
        Estudiante("Susana", 84421, "Analisis"),
        Estudiante("Diego", 110422, "Moviles"),
        Estudiante("Samuel", 68823, "Analisis"),
        Estudiante("Pedro", 210423, "Analisis"),
        Estudiante("Angelica", 79022, "Analisis")
    )

    for (estudiante in Ciclo01) {
        if (estudiante.asignatura == "Moviles") {
            Text(text = "${estudiante.nombre}: presente")
        }
    }
}