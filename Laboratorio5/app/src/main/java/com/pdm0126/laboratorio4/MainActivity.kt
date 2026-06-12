package com.pdm0126.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.laboratorio4.screens.HomeScreen.HomeScreen
import com.pdm0126.laboratorio4.screens.ListScreen.ListScreen
import com.pdm0126.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      Laboratorio4Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          Lab5(
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }
  }
}

@Composable
fun Lab5(modifier: Modifier = Modifier) {
  val backStack = rememberNavBackStack(Routes.HomeScreen)

  NavDisplay(
    backStack = backStack,
    onBack = { backStack.removeLastOrNull() },
    entryProvider = entryProvider {
      entry<Routes.HomeScreen> {
        HomeScreen(
          { backStack.add(Routes.ListScreen) }
        )
      }
      entry<Routes.ListScreen> {
        ListScreen(
          { backStack.removeLastOrNull() }
        )
      }
    }
  )
}