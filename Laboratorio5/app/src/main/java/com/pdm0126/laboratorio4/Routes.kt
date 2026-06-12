package com.pdm0126.laboratorio4

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
  @Serializable
  data object HomeScreen : Routes()

  @Serializable
  data object ListScreen : Routes()
}