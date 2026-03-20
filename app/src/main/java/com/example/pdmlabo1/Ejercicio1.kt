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

class Computadora(
    var RAM: Int,
    var memoria: Int,
    var OS: String,
    var ProgramasInstalados: List <String>
) {
    fun encender() { println("Encendiendo...") }

    fun apagar() { println("Apagando...") }

    fun actualizar(RAM: Int, memoria: Int, OS: String, programas: List <String>) {
        this.RAM = RAM
        this.memoria = memoria
        this.OS = OS
        ProgramasInstalados = programas
    }
}

@Composable
fun Ejercicio1() {
    val programas = listOf("Visual 2026", "Adobe 2026", "Edge 2026", "Discord 2026")

    val computadora1 = Computadora(
        8,
        256,
        "Windows 11",
        programas
    )
}