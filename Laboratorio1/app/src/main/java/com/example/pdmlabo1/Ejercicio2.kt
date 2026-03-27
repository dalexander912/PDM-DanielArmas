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

class Calculadora(
    val marca: String,
    val vida: String,
    var precio: Double
) {
    fun sumar(a: Double, b: Double) {
        var resultado = a+b
        println("$a + $b = $resultado")
    }

    fun restar(a: Double, b: Double) {
        var resultado = a-b
        println("$a - $b = $resultado")
    }

    fun multiplicar(a: Double, b: Double) {
        var resultado = a*b
        println("$a * $b = $resultado")
    }

    fun dividir(a: Double, b: Double) {
        if (b == 0.0) {
            println("El divisor debe ser diferente de cero.")
        } else {
            var resultado = a/b
            println("$a / $b = $resultado")
        }
    }
}

@Composable
fun Ejercicio2() {
    val calculadora1 = Calculadora("Casio", "10 anios", 19.90)

    calculadora1.sumar(3.0, 2.5)
    calculadora1.restar(10.1, 8.3)
    calculadora1.multiplicar(25.0, 0.0)
    calculadora1.dividir(1.0, 2.0)
}