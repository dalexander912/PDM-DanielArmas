package com.pdm0126.laboratorio3

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
  @Serializable
  data object Home : Routes()

  @Serializable
  data object List : Routes()

  @Serializable
  data object Sensor : Routes()
}