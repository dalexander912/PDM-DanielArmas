package com.pdm0126.laboratorio3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.laboratorio3.ui.screens.HomeScreen
import com.pdm0126.laboratorio3.ui.screens.ListScreen
import com.pdm0126.laboratorio3.ui.screens.SensorScreen
import com.pdm0126.laboratorio3.ui.theme.Laboratorio3Theme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      Laboratorio3Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          Labo3App(
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }
  }
}

@Composable
fun Labo3App(modifier: Modifier = Modifier) {
  val backStack = rememberNavBackStack(Routes.Home)

  NavDisplay(
    backStack = backStack,
    onBack = { backStack.removeLastOrNull() },
    entryProvider = entryProvider {
      entry<Routes.Home> {
        HomeScreen(
          modifier,
          {backStack.add(Routes.List)},
          {backStack.add(Routes.Sensor)}
        )
      }
      entry<Routes.List> {
        ListScreen(
          modifier,
          {backStack.removeLastOrNull()}
        )
      }
      entry<Routes.Sensor> {
        SensorScreen(
          modifier,
          {backStack.removeLastOrNull()}
        )
      }
    }
  )
}

@Preview(showBackground = true)
@Composable
fun Labo3AppPreview() {
  Laboratorio3Theme {
    Labo3App()
  }
}